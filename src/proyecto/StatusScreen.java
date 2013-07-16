/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mike
 */
package proyecto;

import java.util.Calendar;

import org.joda.time.Instant;
import org.joda.time.Interval;

public class StatusScreen extends javax.swing.JFrame {

    /**
     * Creates new form StatusScreen
     * @param controller 
     */
    public StatusScreen(Controller controller, Maquina maquina) {
    	this.controller = controller;
    	this.maquina = maquina;
        initComponents();
    }

    public String diferencia(Instant before) {
    	Interval interval = new Interval(before, new Instant());
    	long timeInSeconds = interval.toDuration().getMillis()/1000;
    	
    	return (timeInSeconds/3600) + " horas, " + ((timeInSeconds%3600)/60) + " minutos, " 
    			+ ((timeInSeconds%3600)%60) + " segundos";
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        batchLabel = new javax.swing.JLabel();
        productoLabel = new javax.swing.JLabel();
        inicioLabel = new javax.swing.JLabel();
        llevaLabel = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JButton();
        terminarButton = new javax.swing.JButton();
        
        batchLabel1 = new javax.swing.JLabel();
        productoLabel1 = new javax.swing.JLabel();
        cantidadLabel1 = new javax.swing.JLabel();
        inicioLabel1 = new javax.swing.JLabel();
        llevaLabel1 = new javax.swing.JLabel();
        
        String[] DIAS = {"", "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String[] MESES = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        		"Septiembre", "Octubre", "Noviembre", "Diciembre"};

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        batchLabel.setText(""+maquina.getNumBatch());

        productoLabel.setText(maquina.getNombre());

        Calendar before = maquina.getInicio();
        Instant bef = maquina.getInstant();
        
        inicioLabel.setText(DIAS[before.get(Calendar.DAY_OF_WEEK)]
        		+ ", " + before.get(Calendar.DAY_OF_MONTH) + " de " + MESES[before.get(Calendar.MONTH)]
        		+ ", " + before.get(Calendar.YEAR));

        llevaLabel.setText(diferencia(bef));

        cantidadLabel.setText("Cantidad:    " + maquina.getCantidad());

        cerrarButton.setText("Cerrar");
        cerrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarButtonMouseClicked(evt);
            }
        });

        terminarButton.setText("Terminar proceso");
        terminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminarButtonMouseClicked(evt);
            }
        });

        batchLabel1.setText("Batch: ");

        productoLabel1.setText("Producto: ");

        cantidadLabel1.setText("Cantidad:");

        inicioLabel1.setText("Tiempo de inicio:");

        llevaLabel1.setText("Tiempo que lleva:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(cerrarButton)
                .addGap(62, 62, 62)
                .addComponent(terminarButton)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batchLabel1)
                    .addComponent(productoLabel1)
                    .addComponent(cantidadLabel1)
                    .addComponent(inicioLabel1)
                    .addComponent(llevaLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batchLabel)
                    .addComponent(inicioLabel)
                    .addComponent(llevaLabel)
                    .addComponent(cantidadLabel)
                    .addComponent(productoLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batchLabel)
                    .addComponent(batchLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productoLabel)
                    .addComponent(productoLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadLabel)
                    .addComponent(cantidadLabel1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioLabel)
                    .addComponent(inicioLabel1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llevaLabel)
                    .addComponent(llevaLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrarButton)
                    .addComponent(terminarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void terminarButtonMouseClicked(java.awt.event.MouseEvent evt) {                                            
        
    	controller.updateToNextStep(maquina);
    	dispose();
    }                                           

    private void cerrarButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        dispose();
    }                                         
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel batchLabel;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JButton cerrarButton;
    private javax.swing.JLabel inicioLabel;
    private javax.swing.JLabel llevaLabel;
    private javax.swing.JLabel productoLabel;
    private javax.swing.JButton terminarButton;
    
    private javax.swing.JLabel batchLabel1;
    private javax.swing.JLabel cantidadLabel1;
    private javax.swing.JLabel inicioLabel1;
    private javax.swing.JLabel llevaLabel1;
    private javax.swing.JLabel productoLabel1;
    
    private Controller controller;
    private Maquina maquina;
    // End of variables declaration                   
}
