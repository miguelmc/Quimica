package proyecto;

import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class Controller {
	
	private HashMap<String, Color> colores;
	
	public Controller(){
		colores = new HashMap<String, Color>();
		colores.put("Paquete lubricante", Color.LIGHT_GRAY);
		colores.put("Estearato de calcio", Color.YELLOW);
		colores.put("Estearato de zinc", Color.RED);
		colores.put("Estearato de magnesio", Color.MAGENTA);
		colores.put("Estearato de sodio", Color.CYAN);
	}
	
	//Se ejecuta al seleccionar una maquina inactiva
	public void updateAfterPrompt(Maquina maquina, Form form){
		javax.swing.JButton button = maquina.getButton();
		
		button.setText(button.getText() + " (" + form.getBatch() + ")" );
		button.setBackground(colores.get(form.getProducto()));
		
		maquina.setNumBatch(form.getBatch());
		maquina.setEnUso(true);
		maquina.setInicio();
		maquina.setProducto(form.getProducto());
		//TODO
		maquina.setCantidad(0);
	}
	
	
	//Paso a seguir cuando se selecciona que ya termino una maquina que se esta utilizando
	public void updateToNextStep(Maquina maquina) {
		HashSet<Maquina> maquinasSiguientes = Procesos.getMaquinasSiguientes(maquina);
		final String[] maquinasEnString = convertirAStrings(maquinasSiguientes);
    	
    	System.out.println(JOptionPane.showInputDialog(null, "Selector de maquina",
    	        "Selecciona una maquina", JOptionPane.PLAIN_MESSAGE, null, 
    	        maquinasEnString, // Array of choices
    	        maquinasEnString[0])); // Initial choice
    	
	}
	
	public String[] convertirAStrings(HashSet<Maquina> maquinas) {
		String[] strings = new String[maquinas.size()];
		int i = 0;
		for(Maquina m : maquinas){
			strings[i] = m.getNombre();
			++i;
		}
		return strings;
	}
}
