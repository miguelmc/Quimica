package proyecto;

import java.util.ArrayList;

public class ProcessSelection extends javax.swing.JDialog {

    public ProcessSelection(ArrayList<Proceso> procesosDeMaquina) {
    	this.procesosDeMaquina = procesosDeMaquina;
    	
        initComponents();
    }
    
    public Proceso getProcesoActual(){
    	return procesoActual;
    }

    public String[] getItems(){
    	String[] strings = new String[procesosDeMaquina.size()];
    	for(int i=0; i<procesosDeMaquina.size(); i++){
    		strings[i] = procesosDeMaquina.get(i).getComentarios();
    	}
    	return strings;
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

    	setModalityType(DEFAULT_MODALITY_TYPE);
    	setLocationRelativeTo(null);
    	
        jScrollPane1 = new javax.swing.JScrollPane();
        procesos = new javax.swing.JList();
        acceptBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        procesos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = getItems();
            public Object getElementAt(int i) { return strings[i]; }
			public int getSize() { return strings.length; }
        });
        procesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
            	procesosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(procesos);

        acceptBtn.setText("Aceptar");
        acceptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptBtnMouseClicked(evt);
            }
        });

        CancelBtn.setText("Cancelar");
        CancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelBtnMouseClicked(evt);
            }
        });

        statusLabel.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acceptBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(CancelBtn))
                .addContainerGap())
        );

        pack();
    }
    
    private void acceptBtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
        
    	dispose();
    }                                      

    private void CancelBtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
       	dispose();
    }                                      

    private void procesosMouseReleased(java.awt.event.MouseEvent evt) {                                      
        
    	//borra todo del proceso pasado
    	if(procesoActual != null){
    		for(Maquina m : procesoActual.getPasos()) {
            	m.getButton().setBackground(null);
            }
    	}
    	
        procesoActual = procesosDeMaquina.get(procesos.getSelectedIndex());
        
        //colorea la ruta del proceso
        for(Maquina m : procesoActual.getPasos()) {
        	m.getButton().setBackground(Colores.getColor(procesoActual.getProducto()));
        }
    }   
    
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton acceptBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList procesos;
    private javax.swing.JLabel statusLabel;
    
    private ArrayList<Proceso> procesosDeMaquina;
    private Proceso procesoActual;
}
