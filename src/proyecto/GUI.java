package proyecto;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public GUI(Controller controller) {
		this.controller = controller;
		initComponents();

	}

	private void initComponents() {
		this.setTitle("Mapa de la Planta");
		form = new Form();
		batch = new JTextField();
		campanas = new ArrayList<Campana>();
		for(int i=0; i<5; i++)
			campanas.add(new Campana());
		paused = new ArrayList<Campana>();
		

		filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
		jDialog1 = new javax.swing.JDialog();
		
		//Reactores-------------------------------------------------------------------------------------
		reactor1 = Planta.getMaquinaPorNombre("Reactor 1").getButton();
		reactor2 = Planta.getMaquinaPorNombre("Reactor 2").getButton();
		reactor3 = Planta.getMaquinaPorNombre("Reactor 3").getButton();
		reactor4 = Planta.getMaquinaPorNombre("Reactor 4").getButton();
		reactor5 = Planta.getMaquinaPorNombre("Reactor 5").getButton();
		
		//Mezcladoras-----------------------------------------------------------------------------------
		mezc1 = Planta.getMaquinaPorNombre("Mezcladora 1").getButton();
		mezc2 = Planta.getMaquinaPorNombre("Mezcladora 2").getButton();
		mezc3 = Planta.getMaquinaPorNombre("Mezcladora 3").getButton();
		mezc4 = Planta.getMaquinaPorNombre("Mezcladora 4").getButton();
		mezc5 = Planta.getMaquinaPorNombre("Mezcladora 5").getButton();
		
		//Tanques---------------------------------------------------------------------------------------
		tanqueCera = Planta.getMaquinaPorNombre("Tanque cera").getButton();
		tanqueEstearina = Planta.getMaquinaPorNombre("Tanque estearina").getButton();

		//Molinos---------------------------------------------------------------------------------------
		molino1 = Planta.getMaquinaPorNombre("Molino 1").getButton();
		molino2y4 = Planta.getMaquinaPorNombre("Molino 2 y 4").getButton();
		molino3 = Planta.getMaquinaPorNombre("Molino 3").getButton();
		molino5 = Planta.getMaquinaPorNombre("Molino 5").getButton();
		
		//Rompeterrones---------------------------------------------------------------------------------
		rt1 = Planta.getMaquinaPorNombre("Rompeterrones 1").getButton();
		
		//Cribas----------------------------------------------------------------------------------------
		prensa = Planta.getMaquinaPorNombre("Prensa").getButton();
		
		criba1 = Planta.getMaquinaPorNombre("Criba 1").getButton();
		criba2 = Planta.getMaquinaPorNombre("Criba 2").getButton();
		criba3 = Planta.getMaquinaPorNombre("Criba 3").getButton();
		criba4 = Planta.getMaquinaPorNombre("Criba 4").getButton();
		criba5 = Planta.getMaquinaPorNombre("Criba 5").getButton();
		criba6 = Planta.getMaquinaPorNombre("Criba 6").getButton();
		
		//Otros-----------------------------------------------------------------------------------------
		pelletizador = Planta.getMaquinaPorNombre("Pelletizador").getButton();
		
	    capanasBtn = new JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pelletizador.setText("Pelletizador");
        pelletizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelletizadorMouseClicked(evt);
            }
        });

        reactor4.setText("Reactor 4");
        reactor4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reactor4MouseClicked(evt);
            }
        });

        reactor2.setText("Reactor 2");
        reactor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reactor2MouseClicked(evt);
            }
        });

        reactor3.setText("Reactor 3");
        reactor3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reactor3MouseClicked(evt);
            }
        });

        tanqueCera.setText("Tanque cera");
        tanqueCera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tanqueCeraMouseClicked(evt);
            }
        });

        tanqueEstearina.setText("Tanque estearina");
        tanqueEstearina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tanqueEstearinaMouseClicked(evt);
            }
        });

        molino1.setText("Molino 1");
        molino1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                molino1MouseClicked(evt);
            }
        });

        rt1.setText("Rompeterrones 1");
        rt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rt1MouseClicked(evt);
            }
        });

        criba2.setText("Criba PF-02");
        criba2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criba2MouseClicked(evt);
            }
        });

        molino5.setText("Molino 5");
        molino5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                molino5MouseClicked(evt);
            }
        });

        reactor5.setText("R5");
        reactor5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reactor5MouseClicked(evt);
            }
        });

        reactor1.setText("R1");
        reactor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reactor1MouseClicked(evt);
            }
        });

        mezc1.setText("Mezcladora 1");
        mezc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mezc1MouseClicked(evt);
            }
        });

        criba6.setText("Criba 6");
        criba6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criba6MouseClicked(evt);
            }
        });

        criba3.setText("Criba Paq");
        criba3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criba3MouseClicked(evt);
            }
        });

        criba4.setText("Criba Zinc");
        criba4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criba4MouseClicked(evt);
            }
        });

        molino3.setText("Molino 3");
        molino3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                molino3MouseClicked(evt);
            }
        });

        mezc2.setText("Mezc 2");
        mezc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mezc2MouseClicked(evt);
            }
        });

        mezc3.setText("Mezc 3");
        mezc3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mezc3MouseClicked(evt);
            }
        });

        molino2y4.setText("Molino 2 y 4");
        molino2y4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                molino2y4MouseClicked(evt);
            }
        });

        capanasBtn.setText("Campañas");
        capanasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capanasBtnMouseClicked(evt);
            }
        });

        mezc4.setText("Mecladora 4");
        mezc4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mezc4MouseClicked(evt);
            }
        });

        mezc5.setText("Mezc 5");
        mezc5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mezc5MouseClicked(evt);
            }
        });

        criba1.setText("Criba");
        criba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criba1MouseClicked(evt);
            }
        });

        criba5.setText("      Criba con rodillo    ");
        criba5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criba5MouseClicked(evt);
            }
        });

        prensa.setText("Prensa");
        prensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prensaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(molino5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(criba2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanqueEstearina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(tanqueCera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pelletizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(molino1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reactor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reactor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reactor4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(reactor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reactor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(mezc1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criba6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(molino3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(criba4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addComponent(criba3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mezc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mezc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(molino2y4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mezc5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mezc4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(criba5))))
                    .addComponent(criba1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prensa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(capanasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pelletizador, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(reactor4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reactor3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reactor2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(reactor5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reactor1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mezc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(criba6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mezc2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mezc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanqueCera, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(molino2y4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tanqueEstearina, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(molino1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(criba3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mezc4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(criba5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(mezc5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rt1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criba2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(molino5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(criba4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prensa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(molino3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(criba1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(capanasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }                   

	private void pelletizadorMouseClicked(java.awt.event.MouseEvent evt) {
		actual = Planta.getMaquinaPorNombre("Pelletizador");
		controller.displayButtonPrompt(actual);		
	}                                         

	private void reactor1MouseClicked(java.awt.event.MouseEvent evt) {                                      
		actual = Planta.getMaquinaPorNombre("Reactor 1");
		controller.displayButtonPrompt(actual);
    }                                     

    private void reactor2MouseClicked(java.awt.event.MouseEvent evt) {                                      
    	actual = Planta.getMaquinaPorNombre("Reactor 2");
		controller.displayButtonPrompt(actual);
    }                                     

    private void reactor3MouseClicked(java.awt.event.MouseEvent evt) {                                      
    	actual = Planta.getMaquinaPorNombre("Reactor 3");
		controller.displayButtonPrompt(actual);
    }                                     

    private void reactor4MouseClicked(java.awt.event.MouseEvent evt) {                                      
    	actual = Planta.getMaquinaPorNombre("Reactor 4");
		controller.displayButtonPrompt(actual);
    }                                     

    private void reactor5MouseClicked(java.awt.event.MouseEvent evt) {                                      
    	actual = Planta.getMaquinaPorNombre("Reactor 5");
		controller.displayButtonPrompt(actual);
    }                                     

    private void tanqueCeraMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	actual = Planta.getMaquinaPorNombre("Tanque cera");
		controller.displayButtonPrompt(actual);
    }                                       

    private void tanqueEstearinaMouseClicked(java.awt.event.MouseEvent evt) {                                             
    	actual = Planta.getMaquinaPorNombre("Tanque estearina");
		controller.displayButtonPrompt(actual);
    }                                            

    private void molino1MouseClicked(java.awt.event.MouseEvent evt) {                                     
    	actual = Planta.getMaquinaPorNombre("Molino 1");
		controller.displayButtonPrompt(actual);
    }                                    

    private void rt1MouseClicked(java.awt.event.MouseEvent evt) {                                 
    	actual = Planta.getMaquinaPorNombre("Rompeterrones 1");
		controller.displayButtonPrompt(actual);
    }                                

    private void criba2MouseClicked(java.awt.event.MouseEvent evt) {                                    
    	actual = Planta.getMaquinaPorNombre("Criba 2");
		controller.displayButtonPrompt(actual);
    }                                   

    private void molino5MouseClicked(java.awt.event.MouseEvent evt) {                                     
    	actual = Planta.getMaquinaPorNombre("Molino 5");
		controller.displayButtonPrompt(actual);
    }                                    

    private void mezc1MouseClicked(java.awt.event.MouseEvent evt) {                                   
    	actual = Planta.getMaquinaPorNombre("Mezcladora 1");
		controller.displayButtonPrompt(actual);
    }                                  

    private void criba6MouseClicked(java.awt.event.MouseEvent evt) {                                    
    	actual = Planta.getMaquinaPorNombre("Criba 6");
		controller.displayButtonPrompt(actual);
    }                                   

    private void mezc2MouseClicked(java.awt.event.MouseEvent evt) {                                   
    	actual = Planta.getMaquinaPorNombre("Mezcladora 2");
		controller.displayButtonPrompt(actual);
    }                                  

    private void mezc3MouseClicked(java.awt.event.MouseEvent evt) {                                   
    	actual = Planta.getMaquinaPorNombre("Mezcladora 3");
		controller.displayButtonPrompt(actual);
    }                                  

    private void criba3MouseClicked(java.awt.event.MouseEvent evt) {                                    
    	actual = Planta.getMaquinaPorNombre("Criba 3");
		controller.displayButtonPrompt(actual);
    }                                   

    private void molino2y4MouseClicked(java.awt.event.MouseEvent evt) {                                       
    	actual = Planta.getMaquinaPorNombre("Molino 2 y 4");
		controller.displayButtonPrompt(actual);
    }                                      

    private void criba4MouseClicked(java.awt.event.MouseEvent evt) {                                    
    	actual = Planta.getMaquinaPorNombre("Criba 4");
		controller.displayButtonPrompt(actual);
    } 

    private void molino3MouseClicked(java.awt.event.MouseEvent evt) {                                     
    	actual = Planta.getMaquinaPorNombre("Molino 3");
		controller.displayButtonPrompt(actual);
    } 

    private void prensaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void mezc4MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void criba1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void mezc5MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void criba5MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }       
    
    private void capanasBtnMouseClicked(java.awt.event.MouseEvent evt) {                                    
    	CampanasScreen campanasScreen = new CampanasScreen(campanas, paused);
    	campanasScreen.setVisible(true);
    }

	// Variables declaration - do not modify                 
    private javax.swing.JButton prensa;
    private javax.swing.JButton criba1;
    private javax.swing.JButton criba2;
    private javax.swing.JButton criba3;
    private javax.swing.JButton criba4;
    private javax.swing.JButton criba5;
    private javax.swing.JButton criba6;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JButton mezc1;
    private javax.swing.JButton mezc2;
    private javax.swing.JButton mezc3;
    private javax.swing.JButton mezc4;
    private javax.swing.JButton mezc5;
    private javax.swing.JButton molino1;
    private javax.swing.JButton molino2y4;
    private javax.swing.JButton molino3;
    private javax.swing.JButton molino5;
    private javax.swing.JButton pelletizador;
    private javax.swing.JButton reactor1;
    private javax.swing.JButton reactor2;
    private javax.swing.JButton reactor3;
    private javax.swing.JButton reactor4;
    private javax.swing.JButton reactor5;
    private javax.swing.JButton rt1;
    private javax.swing.JButton tanqueCera;
    private javax.swing.JButton tanqueEstearina;
    
    private javax.swing.JButton capanasBtn;
    // End of variables declaration

	Form form;
	Maquina actual;
	ArrayList<Campana> campanas;
	ArrayList<Campana> paused;
	
	javax.swing.JTextField batch;
	Controller controller;
}
