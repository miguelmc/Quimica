package proyecto;

import java.awt.Color;
import java.util.AbstractMap;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Line{
	public javax.swing.JButton edit;
	public javax.swing.JLabel label;
	public javax.swing.JButton remove;
	
	public Line(){
		edit = new JButton();
		remove = new JButton();
		label = new JLabel();
	}
}

public class CampanasScreen extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	
    public CampanasScreen(ArrayList<Campana> campanas, ArrayList<Campana> paused) {
    	this.campanas = campanas;
    	this.paused = paused;
        initComponents();
    }
    
    public void updateGUI() {
    	
    	buttons.get(0).getValue().setText(campanas.get(0).getProducto() + 
        		"   (" + campanas.get(0).getTotal() + " / " + campanas.get(0).getCantidad() + ")");
        buttons.get(1).getValue().setText(campanas.get(1).getProducto() + 
        		"   (" + campanas.get(1).getTotal() + " / " + campanas.get(1).getCantidad() + ")");
        buttons.get(2).getValue().setText(campanas.get(2).getProducto() + 
        		"   (" + campanas.get(2).getTotal() + " / " + campanas.get(2).getCantidad() + ")");
        buttons.get(3).getValue().setText(campanas.get(3).getProducto() + 
        		"   (" + campanas.get(3).getTotal() + " / " + campanas.get(3).getCantidad() + ")");
        buttons.get(4).getValue().setText(campanas.get(4).getProducto() + 
        		"   (" + campanas.get(4).getTotal() + " / " + campanas.get(4).getCantidad() + ")");
        
        for(int i=0; i<campanas.size(); i++){
        	if(campanas.get(i).getCantidad() == 0){
        		buttons.get(i).getKey().setVisible(false);
        		buttons.get(i).getValue().setVisible(false);
        	} else {
        		
        		for(Maquina m : campanas.get(i).getProceso().getPasos())
        			m.getButton().setBackground(
        					Colores.getColor(campanas.get(i).getProducto()));
        		
        		buttons.get(i).getKey().setVisible(true);
        		buttons.get(i).getValue().setVisible(true);
        	}
        	
        }
    }

    private void initComponents() {
    	this.setTitle("Campa�as");
    	setModalityType(DEFAULT_MODALITY_TYPE);
    	setLocationRelativeTo(null);
    	buttons = new ArrayList<AbstractMap.SimpleEntry<javax.swing.JButton, javax.swing.JLabel> >(5);
    	
    	buttons.add(new AbstractMap.SimpleEntry<javax.swing.JButton,
    			javax.swing.JLabel>(new javax.swing.JButton(), new javax.swing.JLabel()));
    	buttons.add(new AbstractMap.SimpleEntry<javax.swing.JButton,
    			javax.swing.JLabel>(new javax.swing.JButton(), new javax.swing.JLabel()));
    	buttons.add(new AbstractMap.SimpleEntry<javax.swing.JButton,
    			javax.swing.JLabel>(new javax.swing.JButton(), new javax.swing.JLabel()));
    	buttons.add(new AbstractMap.SimpleEntry<javax.swing.JButton,
    			javax.swing.JLabel>(new javax.swing.JButton(), new javax.swing.JLabel()));
    	buttons.add(new AbstractMap.SimpleEntry<javax.swing.JButton,
    			javax.swing.JLabel>(new javax.swing.JButton(), new javax.swing.JLabel()));
    	
    	statusLabel = new JLabel();
        nuevaBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        resumirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttons.get(0).getKey().setText("Editar");
		buttons.get(1).getKey().setText("Editar");
		buttons.get(2).getKey().setText("Editar");
		buttons.get(3).getKey().setText("Editar");
		buttons.get(4).getKey().setText("Editar");
		
		buttons.get(0).getKey().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtn1ActionPerformed(evt);
            }
        });
		buttons.get(1).getKey().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtn2ActionPerformed(evt);
            }
        });
		buttons.get(2).getKey().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtn3ActionPerformed(evt);
            }
        });
		buttons.get(3).getKey().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtn4ActionPerformed(evt);
            }
        });
		buttons.get(4).getKey().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtn5ActionPerformed(evt);
            }
        });
		
        buttons.get(0).getValue().setText(campanas.get(0).getProducto() + 
        		"   (" + campanas.get(0).getTotal() + " / " + campanas.get(0).getCantidad() + ")");
        buttons.get(1).getValue().setText(campanas.get(1).getProducto() + 
        		"   (" + campanas.get(1).getTotal() + " / " + campanas.get(1).getCantidad() + ")");
        buttons.get(2).getValue().setText(campanas.get(2).getProducto() + 
        		"   (" + campanas.get(2).getTotal() + " / " + campanas.get(2).getCantidad() + ")");
        buttons.get(3).getValue().setText(campanas.get(3).getProducto() + 
        		"   (" + campanas.get(3).getTotal() + " / " + campanas.get(3).getCantidad() + ")");
        buttons.get(4).getValue().setText(campanas.get(4).getProducto() + 
        		"   (" + campanas.get(4).getTotal() + " / " + campanas.get(4).getCantidad() + ")");

        

        nuevaBtn.setText("Nueva campaña");
        nuevaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaBtnActionPerformed(evt);
            }
        });

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        resumirBtn.setText("Resumir campaña");
        resumirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resumirBtnMouseClicked(evt);
            }
        });
        
        statusLabel.setForeground(Color.RED);
        statusLabel.setText("");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(resumirBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttons.get(4).getValue())
                            .addComponent(buttons.get(3).getValue())
                            .addComponent(buttons.get(2).getValue())
                            .addComponent(buttons.get(1).getValue())
                            .addComponent(buttons.get(0).getValue()))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttons.get(2).getKey())
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevaBtn)
                            .addComponent(buttons.get(4).getKey())
                            .addComponent(buttons.get(3).getKey())
                            .addComponent(buttons.get(1).getKey())
                            .addComponent(buttons.get(0).getKey()))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(statusLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttons.get(0).getKey())
                    .addComponent(buttons.get(0).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttons.get(1).getKey())
                    .addComponent(buttons.get(1).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttons.get(2).getKey())
                    .addComponent(buttons.get(2).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttons.get(3).getKey())
                    .addComponent(buttons.get(3).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttons.get(4).getKey())
                    .addComponent(buttons.get(4).getValue()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaBtn)
                    .addComponent(salirBtn)
                    .addComponent(resumirBtn))
                .addContainerGap())
        );

        for(int i=0; i<campanas.size(); i++){
        	if(campanas.get(i).getCantidad() == 0){
        		buttons.get(i).getKey().setVisible(false);
        		buttons.get(i).getValue().setVisible(false);
        	}
        }
        
        pack();
    }                   

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	dispose();
    }                                        

    //EDIT BUTTONS------------------------------------------------------------------
    private void editarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
    	editBtnHelper(0);
    }
	private void editarBtn2ActionPerformed(java.awt.event.ActionEvent evt) {
		editBtnHelper(1);
	}
	private void editarBtn3ActionPerformed(java.awt.event.ActionEvent evt) {
		editBtnHelper(2);
	}
	private void editarBtn4ActionPerformed(java.awt.event.ActionEvent evt) {
		editBtnHelper(3);
	}
	private void editarBtn5ActionPerformed(java.awt.event.ActionEvent evt) {
		editBtnHelper(4);
	}
	
	private void editBtnHelper(int i){
		EditWindow editWindow = new EditWindow(i, campanas, paused);
    	editWindow.setVisible(true);
//    	buttons.get(i).getValue().setText(campanas.get(i).getProducto() + 
//		"   (" + campanas.get(i).getTotal() + " / " + campanas.get(i).getCantidad() + ")");
    	
    	updateGUI();
	}
    //-----------------------------------------------------------------------------
	
	private void resumirBtnMouseClicked(java.awt.event.MouseEvent evt) {                                        
        
		if(paused.size() == 0){
			statusLabel.setText("No hay nada que resumir.");
			return;
		}
		
    	JList productos = new JList();
    	
    	final String[] convertedStrings = new String[paused.size()];
    	for(int i=0; i<paused.size(); i++)
    		convertedStrings[i] = paused.get(i).getProducto();
    	
    	productos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = convertedStrings;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
    	
    	final JComponent[] inputs = new JComponent[] {
    			new JLabel("Seleccione el producto a resumir: "),
    			productos
    	};
    	
    	JOptionPane.showMessageDialog(null, inputs, "Resumir campaña", JOptionPane.PLAIN_MESSAGE);
    	
    	if(productos.getSelectedValue() == null)
    	{
    		statusLabel.setText("Valores no validos.");
    		return;
    	}
    	int index = 0;
    	while(campanas.get(index).getCantidad() != 0)
    		index++;
    	
    	
    	campanas.set(index, new Campana( paused.get(productos.getSelectedIndex()) ));
    	paused.remove(productos.getSelectedIndex());
    	paused.add(new Campana());
    	
    	updateGUI();
    } 
	
    private void nuevaBtnActionPerformed(java.awt.event.ActionEvent evt) {       
    	
    	JTextField cantidad = new JTextField();
    	JList productos = new JList();
    	
    	productos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {"Paquete lubricante", "Ceras", "Estearato de zinc", 
            		"Estearato de potasio", "Estearato de calcio", "Estearato de magnesio",
            		"Estearato de sodio", "Blends"};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
    	
    	final JComponent[] inputs = new JComponent[] {
    			new JLabel("Cantidad en kg: "),
    			cantidad,
    			new JLabel("-            -"),
    			new JLabel("Producto: "),
    			productos
    	};
    	
    	JOptionPane.showMessageDialog(null, inputs, "Nueva campaña", JOptionPane.PLAIN_MESSAGE);

    	if(productos.getSelectedValue() == null || cantidad.getText().equals(""))
    	{
    		statusLabel.setText("Valores no validos.");
    		return;
    	}

    	try{
    		Integer.parseInt(cantidad.getText());
    	}catch(Exception e){
    		statusLabel.setText("Cantidad no es valida.");
    		return;
    	}
    		
    	int i=0;
    	while(campanas.get(i).getCantidad() != 0){
    		i++;
    	}
    	campanas.set(i, new Campana(Integer.parseInt(cantidad.getText()), 
    			(String)productos.getSelectedValue()));
    	
    	
    	ArrayList<Proceso> procesos = Procesos.getProcesosDeMaquina(campanas.get(i).getProducto());
    	ProcessSelection processSelection = new ProcessSelection(procesos);
    	processSelection.setVisible(true);
    	
    	Proceso procesoSeleccionado = processSelection.getProcesoActual();
    	campanas.get(i).setProceso(procesoSeleccionado);
    	
    	if(procesoSeleccionado == null) {
    		for(Maquina m : processSelection.forceGetProcesoActual().getPasos()) {

    			m.getButton().setBackground(null);
    		}
    		
    		campanas.set(i, new Campana());
    	}
    	
    	updateGUI();
    }                                        

    private javax.swing.JButton nuevaBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton resumirBtn;
    private javax.swing.JLabel statusLabel;
    
    private ArrayList<AbstractMap.SimpleEntry<javax.swing.JButton, javax.swing.JLabel> > buttons;
    
    private ArrayList<Campana> campanas;
    private ArrayList<Campana> paused;

}
