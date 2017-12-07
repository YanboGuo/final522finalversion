package GUI;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
import ShoppingSystem.*;

public class ShoppingCartPage extends javax.swing.JFrame {

    public static HashMap<Product, Integer> h = (HashMap<Product, Integer>) shoppingSysten.shoppingSysteminstance.CurrentAccount.SC.SCmap;
	
   /* String t1 = null;
    String t2 = null;
    String t3 = null;
    String t4 = null;*/
    
    public ShoppingCartPage() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("shopping cart");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ShoppingWeb", "Order", "Signout" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 //jComboBox1ActionPerformed(evt);////////????????
                JComboBox comboBox = (JComboBox) evt.getSource();

                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("ShoppingWeb"))
                   {
                	new ShoppingWebPage().setVisible(true);
                     dispose();}
                else if(selected.toString().equals("Order"))
                   {new ShoppingWebPage().setVisible(true);
                	dispose();}
                else if(selected.toString().equals("Signout"))
                    {new ShoppingWebPage().setVisible(true);
                	dispose();}                                  
            }
        });
        
        jButton1.setText("Update");
        jButton1.setVisible(false);
        /*jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton1ActionPerformed(evt);
            	
            }

			private void jButton1ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        }); */

        
        jButton2.setText("Place Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton2ActionPerformed(evt);
            	shoppingSysten.shoppingSysteminstance.CurrentAccount.SC.order.placeOrder();               
                
            }

			private void jButton2ActionPerformed(ActionEvent evt) {
				
			}
        });      
        
        
        for(Product p : h.keySet()){
        	if(p.name.equals("apple")){
        		jLabel4.setText("apple price: $3.0");
        		
                jTextField5.setText("Qty:" + h.get(p.name));
                jTextField5.addActionListener(new java.awt.event.ActionListener() {        
        			public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField5ActionPerformed(evt);
                        ShoppingWebPage.t1 = jTextField5.getText();              
                         System.out.println(ShoppingWebPage.t1);
                         if(ShoppingWebPage.t1. equals("0")){
                        	jLabel4.setVisible(false);
                     		jTextField5.setVisible(false);
                     		h.remove(p);
                         }
                        
                    }
					private void jTextField5ActionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						
					}
                });
                break;
                
        	}else{
        		jLabel4.setVisible(false);
        		jTextField5.setVisible(false);
        	}
        }
        
        for(Product p : h.keySet()){
        	if(p.name.equals("banana")){
        		jLabel3.setText("banana price: $2.0"); 
        		
                jTextField6.setText("Qty:" + h.get(p.name));
                jTextField6.addActionListener(new java.awt.event.ActionListener() {        
        			public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField6ActionPerformed(evt);
                        ShoppingWebPage.t2 = jTextField6.getText();              
                         System.out.println(ShoppingWebPage.t2);
                         if(ShoppingWebPage.t2. equals("0")){
                         	jLabel3.setVisible(false);
                      		jTextField6.setVisible(false);
                      		h.remove(p);
                          }
                        
                    }
					private void jTextField6ActionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						
					}
                });
                break;
        	}else{
        		jLabel3.setVisible(false);
        		jTextField6.setVisible(false);
        	}
        }
        
        /*jLabel3.setText("banana price: $2.0");
        jTextField6.setText("Qty:");*/
        
        for(Product p : h.keySet()){
        	if(p.name.equals("pear")){
        		jLabel5.setText("pear price: $2.0");             
                jTextField7.setText("Qty:" + h.get(p.name));
                jTextField7.addActionListener(new java.awt.event.ActionListener() {        
        			public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField7ActionPerformed(evt);
                        ShoppingWebPage.t3 = jTextField7.getText();              
                         System.out.println(ShoppingWebPage.t3);
                         if(ShoppingWebPage.t3. equals("0")){
                         	jLabel5.setVisible(false);
                      		jTextField7.setVisible(false);
                      		h.remove(p);
                          }
                    }
					private void jTextField7ActionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						
					}
                });
                break;
        	}else{
        		jLabel5.setVisible(false);
        		jTextField7.setVisible(false);
        	}
        }
        /*jLabel5.setText("pear price: $2.0");
        jTextField7.setText("Qty:");*/
        
        for(Product p : h.keySet()){
        	if(p.name.equals("peach")){
        		jLabel6.setText("peach price $1.0");            
                jTextField8.setText("Qty:" + h.get(p.name));
                jTextField8.addActionListener(new java.awt.event.ActionListener() {        
        			public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField8ActionPerformed(evt);
                        ShoppingWebPage.t4 = jTextField8.getText();              
                         System.out.println(ShoppingWebPage.t4);
                         if(ShoppingWebPage.t4. equals("0")){
                         	jLabel6.setVisible(false);
                      		jTextField8.setVisible(false);
                      		h.remove(p);
                          }
                    }
					private void jTextField8ActionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						
					}
                });
                break;
        	}else{
        		jLabel6.setVisible(false);
        		jTextField8.setVisible(false);
        	}
        }
       /* jLabel6.setText("peach price $1.0");
        jTextField8.setText("Qty:");*/
       
        jLabel2.setText("Total: "+ shoppingSysten.shoppingSysteminstance.CurrentAccount.SC.total());
                                           
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(640, 640, 640)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 136, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
  
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration                   
}
