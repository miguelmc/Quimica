package proyecto;

import java.awt.Color;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class Controller {
	
	private HashMap<String, Color> colores;
	private ButtonPrompt buttonPrompt;
	private Form form;
	private StatusScreen statusScreen;
	
	public Controller(){
		form = new Form();
		
		colores = new HashMap<String, Color>();
		colores.put("Paquete lubricante", Color.LIGHT_GRAY);
		colores.put("Estearato de calcio", Color.YELLOW);
		colores.put("Estearato de zinc", Color.RED);
		colores.put("Estearato de magnesio", Color.MAGENTA);
		colores.put("Estearato de sodio", Color.CYAN);
	}
	
	public void displayButtonPrompt(Maquina actual){
		buttonPrompt = new ButtonPrompt(form, actual);
		if(!actual.estaEnUso())
		{
			buttonPrompt.setVisible(true);
			if(form.getBatch() == 0 || form.getProducto().equals(""))
			{
				return;
			}

			updateAfterPrompt(actual);
		}
		else {
			statusScreen = new StatusScreen(this, actual);
			statusScreen.setVisible(true);
			//updateToNextStep(actual);
		}
	}
	
	//Se ejecuta al seleccionar una maquina inactiva
	public void updateAfterPrompt(Maquina maquina){
		javax.swing.JButton button = maquina.getButton();
		
		button.setText(button.getText() + " (" + form.getBatch() + ")" );
		button.setBackground(colores.get(form.getProducto()));
		
		maquina.setAll(form.getBatch(), 0, form.getProducto(), "");
		//TODO
		maquina.setCantidad(0);
	}
	
	
	//Paso a seguir cuando se selecciona que ya termino una maquina que se esta utilizando
	public void updateToNextStep(Maquina maquina) {
		HashSet<String> maquinasSiguientes = Procesos.getMaquinasSiguientes(maquina);
		Maquina siguiente;
		final String[] maquinasEnString = convertirAStrings(maquinasSiguientes);
    	maquinasEnString[maquinasEnString.length-1] = "Dar por terminado";
		
    	String seleccion = (String)JOptionPane.showInputDialog(null, "Selecciona una maquina", 
    			"Selector de maquina", JOptionPane.PLAIN_MESSAGE, null, 
    	        maquinasEnString, // Array of choices
    	        maquinasEnString[0]); // Initial choice
    	
    	System.out.println(seleccion);
    	
    	//cancel catch
    	if(seleccion == null)
    		return;
    	
    	
    	siguiente = Planta.getMaquinaPorNombre(seleccion);
    	try {
	    	siguiente.setAll(maquina.getNumBatch(), maquina.getCantidad(), maquina.getProducto(),
	    			maquina.getTipo());
	    	
	    	javax.swing.JButton button = siguiente.getButton();
	    	button.setText(button.getText() + " (" + siguiente.getNumBatch() + ")");
	    	button.setBackground(colores.get(siguiente.getProducto()));
    	} catch(Exception e){}
    	clearMaquina(maquina);
	}
	
	public void clearMaquina(Maquina maquina) {
		maquina.getButton().setBackground(null);
		int index = maquina.getButton().getText().indexOf('(', 0);
		maquina.getButton().setText(maquina.getButton().getText().substring(0,index-1));
    	maquina.clear();
	}
	
	//Set<String> --> String[]
	public String[] convertirAStrings(HashSet<String> maquinas) {
		String[] strings = new String[maquinas.size()+1];
		int i = 0;
		for(String s : maquinas){
			strings[i] = s;
			++i;
		}
		return strings;
	}
}
