package proyecto;

import java.awt.Color;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CampanasScreen extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	
    public CampanasScreen(ArrayList<Campana> campanas) {
    	this.campanas = campanas;
        initComponents();
    }

    private void initComponents() {
    	this.setTitle("Campañas");
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
		
        buttons.get(0).getValue().setText(campanas.get(0).getProducto());
        buttons.get(1).getValue().setText(campanas.get(1).getProducto());
        buttons.get(2).getValue().setText(campanas.get(2).getProducto());
        buttons.get(3).getValue().setText(campanas.get(3).getProducto());
        buttons.get(4).getValue().setText(campanas.get(4).getProducto());

        

        nuevaBtn.setText("Nueva campaÃ±a");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttons.get(4).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttons.get(4).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttons.get(3).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttons.get(3).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttons.get(2).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttons.get(2).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttons.get(1).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttons.get(1).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttons.get(0).getValue())
                                .addGap(231, 231, 231)
                                .addComponent(buttons.get(0).getKey())))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevaBtn)))
                .addContainerGap())
              .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(statusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaBtn)
                    .addComponent(salirBtn))
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

    private void editarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
    	EditWindowTemp editWindow = new EditWindowTemp(campanas.get(0));
    	editWindow.setVisible(true);
    }
	private void editarBtn2ActionPerformed(java.awt.event.ActionEvent evt) {
	    	
	}
	private void editarBtn3ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}
	private void editarBtn4ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}
	private void editarBtn5ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}
    
    private void nuevaBtnActionPerformed(java.awt.event.ActionEvent evt) {       
    	
    	JTextField cantidad = new JTextField();
    	JList productos = new JList();
    	
    	productos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {"Paquete lubricante", "Ceras", "Estearato de zinc"};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
    	
    	final JComponent[] inputs = new JComponent[] {
    			new JLabel("Cantidad en kg: "),
    			cantidad,
    			new JLabel("-"),
    			new JLabel("Producto: "),
    			productos
    	};
    	
    	JOptionPane.showMessageDialog(null, inputs, "My custom dialog", JOptionPane.PLAIN_MESSAGE);

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
    		
    	dispose();
    	
    	int i=0;
    	while(campanas.get(i).getCantidad() != 0){
    		i++;
    	}
    	campanas.set(i, new Campana(Integer.parseInt(cantidad.getText()), 
    			(String)productos.getSelectedValue()));
    	
    	
    	ArrayList<Proceso> procesos = Procesos.getProcesosDeMaquina(campanas.get(0).getProducto());
    	ProcessSelection processSelection = new ProcessSelection(procesos);
    	processSelection.setVisible(true);
    	
    	Proceso procesoSeleccionado = processSelection.getProcesoActual();
    	
    	campanas.get(i).setProceso(procesoSeleccionado);
    	
    	
    }                                        

    private javax.swing.JButton nuevaBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel statusLabel;
    
    private ArrayList<AbstractMap.SimpleEntry<javax.swing.JButton, javax.swing.JLabel> > buttons;
    
    private ArrayList<Campana> campanas;
}
