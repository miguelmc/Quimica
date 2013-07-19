package proyecto;

import java.awt.Color;
import java.util.AbstractMap;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditWindow extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	
    public EditWindow(Proceso proceso) {
    	this.proceso = proceso;
    	this.maquinas = proceso.getPasos();
    	for(int i=maquinas.size(); i<5; i++){
    		maquinas.add(new Maquina("", null));
    	}
        initComponents();
    }

    private void initComponents() {
    	
    	setModalityType(DEFAULT_MODALITY_TYPE);
    	setLocationRelativeTo(null);
    	pasos = new ArrayList<AbstractMap.SimpleEntry<javax.swing.JLabel, javax.swing.JTextField> >(5);
    	
    	pasos.add(new AbstractMap.SimpleEntry<javax.swing.JLabel,
    			javax.swing.JTextField>(new javax.swing.JLabel(), new javax.swing.JTextField()));
    	pasos.add(new AbstractMap.SimpleEntry<javax.swing.JLabel,
    			javax.swing.JTextField>(new javax.swing.JLabel(), new javax.swing.JTextField()));
    	pasos.add(new AbstractMap.SimpleEntry<javax.swing.JLabel,
    			javax.swing.JTextField>(new javax.swing.JLabel(), new javax.swing.JTextField()));
    	pasos.add(new AbstractMap.SimpleEntry<javax.swing.JLabel,
    			javax.swing.JTextField>(new javax.swing.JLabel(), new javax.swing.JTextField()));
    	pasos.add(new AbstractMap.SimpleEntry<javax.swing.JLabel,
    			javax.swing.JTextField>(new javax.swing.JLabel(), new javax.swing.JTextField()));
    	
    	statusLabel = new JLabel();
        aceptarBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pasos.get(0).getKey().setText(maquinas.get(0).getNombre());
        pasos.get(1).getKey().setText(maquinas.get(1).getNombre());
        pasos.get(2).getKey().setText(maquinas.get(2).getNombre());
        pasos.get(3).getKey().setText(maquinas.get(3).getNombre());
        pasos.get(4).getKey().setText(maquinas.get(4).getNombre());
        //terminadosLabel.setText("Terminados");
        
        pasos.get(0).getValue().setText("0");
		pasos.get(1).getValue().setText("0");
		pasos.get(2).getValue().setText("0");
		pasos.get(3).getValue().setText("0");
		pasos.get(4).getValue().setText("0");
		//terminadosTextField.setText("0");
		
        aceptarBtn.setText("Aceptar");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
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
                                .addComponent(pasos.get(4).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pasos.get(4).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pasos.get(3).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pasos.get(3).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pasos.get(2).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pasos.get(2).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pasos.get(1).getValue())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pasos.get(1).getKey()))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pasos.get(0).getValue())
                                .addGap(231, 231, 231)
                                .addComponent(pasos.get(0).getKey())))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarBtn)))
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
                    .addComponent(pasos.get(0).getKey())
                    .addComponent(pasos.get(0).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasos.get(1).getKey())
                    .addComponent(pasos.get(1).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasos.get(2).getKey())
                    .addComponent(pasos.get(2).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasos.get(3).getKey())
                    .addComponent(pasos.get(3).getValue()))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasos.get(4).getKey())
                    .addComponent(pasos.get(4).getValue()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBtn)
                    .addComponent(salirBtn))
                .addContainerGap())
        );

        for(int i=0; i<maquinas.size(); i++){
        	if(maquinas.get(i).getNombre().equals("")){
        		pasos.get(i).getKey().setVisible(false);
        		pasos.get(i).getValue().setVisible(false);
        	}
        }
        
        pack();
    }                   

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	dispose();
    }                                        

    
    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {       
    	
    	dispose();
    }                                        

    private javax.swing.JButton aceptarBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel statusLabel;
    
    private ArrayList<AbstractMap.SimpleEntry<javax.swing.JLabel, javax.swing.JTextField> > pasos;
    
    private Proceso proceso;
    private ArrayList<Maquina> maquinas;
}
