/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

import org.joda.time.Instant;
import org.joda.time.Interval;

/**
 *
 * @author mike
 */
public class EditWindowTemp extends javax.swing.JDialog {

    /**
     * Creates new form EditWindowTemp
     * @param campana 
     */
    public EditWindowTemp(Campana campana) {
    	this.campana = campana;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	this.setTitle("Editar Campa�a");
    	setLocationRelativeTo(null);
    	setModalityType(DEFAULT_MODALITY_TYPE);
    	
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        aceptarBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Jlabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        metaLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        gastoLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Reactor 1,5");

        jLabel5.setText("Criba paquetes");

        jLabel3.setText("Reactor 2,3,4");

        jLabel2.setText("Tanque cera");

        jLabel4.setText("Pelletizador");

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        statusLabel.setText("");

        aceptarBtn.setText("Aceptar");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });

        jTextField1.setText(campana.getCantEnPasos().get(0).toString());

        jTextField2.setText(campana.getCantEnPasos().get(1).toString());

        jTextField3.setText(campana.getCantEnPasos().get(2).toString());

        jTextField4.setText(campana.getCantEnPasos().get(3).toString());

        jTextField5.setText(campana.getCantEnPasos().get(4).toString());

        jLabel6.setText("Terminados");

        jTextField6.setText("0");

        Jlabel.setText("Total: ");
        Jlabel.setToolTipText("");

        totalLabel.setText(""+campana.getTotal());

        jLabel9.setText("de");

        metaLabel.setText(""+campana.getCantidad());

        jLabel11.setText("terminados");

        jLabel12.setText("Gasto:");

        gastoLabel.setText(""+campana.getGasto());

        jLabel14.setText("Tiempo de campaña: ");

        
        Interval interval = new Interval(campana.getInstant(), new Instant());
        long timeInSeconds = interval.toDuration().getMillis()/1000;
    	
        timeLabel.setText((timeInSeconds/3600) + " horas, " + ((timeInSeconds%3600)/60) + " minutos, " 
    			+ ((timeInSeconds%3600)%60) + " segundos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(statusLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Jlabel)
                                .addGap(18, 18, 18)
                                .addComponent(totalLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(metaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aceptarBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6))
                                        .addGap(177, 177, 177)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField4)
                                            .addComponent(jTextField5)
                                            .addComponent(jTextField6)))
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(gastoLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(timeLabel)))
                                .addGap(0, 128, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBtn)
                    .addComponent(salirBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }                                        

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	
    	campana.setTotal(campana.getTotal()+ Integer.parseInt(jTextField6.getText()));
    	jLabel6.setText("0");
    	
    	ArrayList<Integer> cantEnPasos = new ArrayList<Integer>(5);
    	
    	cantEnPasos.add(Integer.parseInt(jTextField1.getText()));
    	cantEnPasos.add(Integer.parseInt(jTextField2.getText()));
    	cantEnPasos.add(Integer.parseInt(jTextField3.getText()));
    	cantEnPasos.add(Integer.parseInt(jTextField4.getText()));
    	cantEnPasos.add(Integer.parseInt(jTextField5.getText()));
    	
    	campana.setCantEnPasos(cantEnPasos);
    	
    	dispose();
    }                                        
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Jlabel;
    private javax.swing.JLabel gastoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel metaLabel;
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration     
    
    Campana campana;
}
