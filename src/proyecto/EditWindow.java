package proyecto;

import java.awt.Color;
import java.util.AbstractMap;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.joda.time.Instant;
import org.joda.time.Interval;

public class EditWindow extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	
    public EditWindow(int index, ArrayList<Campana> campanas, ArrayList<Campana> paused) {
    	this.paused = paused;
    	this.campanas = campanas;
    	this.campana = campanas.get(index);
    	this.maquinas = campana.getProceso().getPasos();
    	for(int i=maquinas.size(); i<5; i++){
    		maquinas.add(new Maquina("", null));
    	}
        initComponents();
    }

    private void initComponents() {
    	
    	setModalityType(DEFAULT_MODALITY_TYPE);
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
    	


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pasos.get(0).getKey().setText(maquinas.get(0).getNombre());
        pasos.get(1).getKey().setText(maquinas.get(1).getNombre());
        pasos.get(2).getKey().setText(maquinas.get(2).getNombre());
        pasos.get(3).getKey().setText(maquinas.get(3).getNombre());
        pasos.get(4).getKey().setText(maquinas.get(4).getNombre());
        //terminadosLabel.setText("Terminados");
        
        pasos.get(0).getValue().setText(campana.getCantEnPasos().get(0).toString());
		pasos.get(1).getValue().setText(campana.getCantEnPasos().get(1).toString());
		pasos.get(2).getValue().setText(campana.getCantEnPasos().get(2).toString());
		pasos.get(3).getValue().setText(campana.getCantEnPasos().get(3).toString());
		pasos.get(4).getValue().setText(campana.getCantEnPasos().get(4).toString());
		//terminadosTextField.setText("0");

       
        salirBtn = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        aceptarBtn = new javax.swing.JButton();
        terminadosField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        metaLabel = new javax.swing.JLabel();
        gastoLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        pauseBtn = new javax.swing.JButton();
        terminarBtn = new javax.swing.JButton();
        
		jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        statusLabel.setForeground(Color.RED);
        statusLabel.setText("");

        aceptarBtn.setText("Aceptar");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });

        pauseBtn.setText("Pausar");
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });

        terminarBtn.setText("Terminar");
        terminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarBtnActionPerformed(evt);
            }
        });
        
        jLabel6.setText("Terminados");

        terminadosField.setText("0");

        Jlabel.setText("Total: ");
        Jlabel.setToolTipText("");

        totalLabel.setText(""+campana.getTotal());

        jLabel9.setText("de");

        metaLabel.setText(""+campana.getCantidad());

        jLabel11.setText("terminados");

        jLabel12.setText("Gasto:");
        gastoLabel.setText(""+campana.getGasto());
        
        gastoLabel.setText("0");

        jLabel14.setText("Tiempo de campaña: ");
        Interval interval = new Interval(campana.getInstant(), new Instant());
        long timeInSeconds = interval.toDuration().getMillis()/1000;
        timeLabel.setText((timeInSeconds/3600) + " horas, " + ((timeInSeconds%3600)/60) + " minutos, " 
    			+ ((timeInSeconds%3600)%60) + " segundos");

        

        jLabel7.setText("Maquina");

        jLabel8.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(terminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(statusLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jlabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(metaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(timeLabel))
                                    .addComponent(pasos.get(0).getKey())
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(gastoLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pasos.get(4).getKey())
                                            .addComponent(pasos.get(3).getKey())
                                            .addComponent(pasos.get(2).getKey())
                                            .addComponent(pasos.get(1).getKey())
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(177, 177, 177)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(pasos.get(0).getValue())
                                                .addComponent(pasos.get(1).getValue())
                                                .addComponent(pasos.get(2).getValue())
                                                .addComponent(pasos.get(3).getValue())
                                                .addComponent(pasos.get(4).getValue())
                                                .addComponent(terminadosField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasos.get(0).getKey())
                    .addComponent(pasos.get(0).getValue(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasos.get(1).getKey())
                    .addComponent(pasos.get(1).getValue(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasos.get(2).getKey())
                    .addComponent(pasos.get(2).getValue(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasos.get(3).getKey())
                    .addComponent(pasos.get(3).getValue(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasos.get(4).getKey())
                    .addComponent(pasos.get(4).getValue(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(terminadosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel)
                    .addComponent(totalLabel)
                    .addComponent(jLabel9)
                    .addComponent(metaLabel)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(gastoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(timeLabel))
                .addGap(35, 35, 35)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBtn)
                    .addComponent(salirBtn)
                    .addComponent(terminarBtn)
                    .addComponent(pauseBtn))
                .addContainerGap())
        );

        for(int i=0; i<5; i++){
        	if(maquinas.get(i).getNombre().equals(""))
        	{
        		pasos.get(i).getKey().setVisible(false);
        		pasos.get(i).getValue().setVisible(false);
        	}
        }
        
        pack();
    }                   

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	dispose();
    }      
    
    private void terminarBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	
    	removalProcess();
    	dispose();
    }   
    
    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	
    	paused.add(new Campana(campana));
    	removalProcess();
    	dispose();
    } 
    
    private void removalProcess() {
    	
    	for(Maquina m : campana.getProceso().getPasos()) {
    		m.getButton().setBackground(null);
    	}
    	campanas.remove(campana);
    	campanas.add(new Campana());
    }
    
    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {       
    	
    	campana.setTotal(campana.getTotal()+ Integer.parseInt(terminadosField.getText()));
    	jLabel6.setText("0");
    	
    	ArrayList<Integer> cantEnPasos = new ArrayList<Integer>(5);
    	
    	cantEnPasos.add(Integer.parseInt(pasos.get(0).getValue().getText()));
    	cantEnPasos.add(Integer.parseInt(pasos.get(1).getValue().getText()));
    	cantEnPasos.add(Integer.parseInt(pasos.get(2).getValue().getText()));
    	cantEnPasos.add(Integer.parseInt(pasos.get(3).getValue().getText()));
    	cantEnPasos.add(Integer.parseInt(pasos.get(4).getValue().getText()));
    	
    	campana.setCantEnPasos(cantEnPasos);
    	
    	int result;
    	if(campana.getCantidad() <= campana.getTotal())
    	{
	    	result = JOptionPane.showConfirmDialog(null, "Se alcanzo la meta de la campaña. Terminar?", 
	    		       "Title", JOptionPane.INFORMATION_MESSAGE);
	    	if(result == JOptionPane.OK_OPTION)
	    		removalProcess();
    	}
    	
    	dispose();
    }                                        


    private javax.swing.JLabel metaLabel;
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton terminarBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel gastoLabel;
    private javax.swing.JTextField terminadosField;
    
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JLabel Jlabel;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel14;
    
    private ArrayList<AbstractMap.SimpleEntry<javax.swing.JLabel, javax.swing.JTextField> > pasos;
    
    private ArrayList<Maquina> maquinas;
    private ArrayList<Campana> campanas;
    private ArrayList<Campana> paused;
    private Campana campana;
}
