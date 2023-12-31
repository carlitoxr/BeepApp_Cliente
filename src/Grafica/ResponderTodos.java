/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Alejandro
 */
public class ResponderTodos extends javax.swing.JFrame {

    int sTexto = 14;
    String fuente = "Times New Roman";
    String color = "Negro";
    /**
     * Creates new form Redactar
     */
   
    public ResponderTodos() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    private void colorTexto(String colores){        
        if(colores.equals("Rojo")){
            txtMail.setForeground(Color.RED);
        }else if(colores.equals("Azul")){
            txtMail.setForeground(Color.BLUE);
        }else if(colores.equals("Gris")){
            txtMail.setForeground(Color.DARK_GRAY);
        }else{
            txtMail.setForeground(Color.BLACK);
        }
        
    }
    
    
    private void cambiarTexto(String fuente, int sizeTexto){        
    	if(btnNegrita.isSelected() && btnCursiva.isSelected()){
            txtMail.setFont(new Font(fuente,3,sizeTexto ));
            colorTexto(color);
        }else if (btnCursiva.isSelected()){
            txtMail.setFont(new Font(fuente,2,sizeTexto ));
            colorTexto(color);
	}else if (btnNegrita.isSelected()){
            txtMail.setFont(new Font(fuente,1,sizeTexto ));
            colorTexto(color);
	}else{
            txtMail.setFont(new Font(fuente,0,sizeTexto ));
            colorTexto(color);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBeep = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPara = new javax.swing.JTextField();
        txtCc = new javax.swing.JTextField();
        txtCco = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMail = new javax.swing.JTextPane();
        Enviar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        cboxTxtSize = new javax.swing.JComboBox<>();
        btnNegrita = new javax.swing.JToggleButton();
        btnCursiva = new javax.swing.JToggleButton();
        comboTipoFuente = new javax.swing.JComboBox<>();
        colorFuente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelBeep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logobeepCalera.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Para:");

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Cc:");

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Cco:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asunto");
        jLabel1.setToolTipText("");

        txtPara.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtCc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtCco.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtAsunto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jScrollPane1.setViewportView(txtMail);

        Enviar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEnviar.png"))); // NOI18N
        Enviar.setText("Enviar");

        Guardar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGuardar1.png"))); // NOI18N
        Guardar.setText("Guardar");

        Cancelar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCancelar1.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        cboxTxtSize.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboxTxtSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14", "16", "18", "20", "24", "36", "48" }));
        cboxTxtSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxTxtSizeMouseClicked(evt);
            }
        });
        cboxTxtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTxtSizeActionPerformed(evt);
            }
        });

        btnNegrita.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNegrita.setText("N");
        btnNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegritaActionPerformed(evt);
            }
        });

        btnCursiva.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnCursiva.setText("C");
        btnCursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursivaActionPerformed(evt);
            }
        });

        comboTipoFuente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboTipoFuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Times New Roman", "Arial", "Castellar", "Verdana" }));
        comboTipoFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoFuenteActionPerformed(evt);
            }
        });

        colorFuente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        colorFuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Azul", "Rojo", "Gris" }));
        colorFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorFuenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelBeep, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPara)
                            .addComponent(txtCc, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                            .addComponent(txtCco, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                            .addComponent(txtAsunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboTipoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNegrita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCursiva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxTxtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(colorFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelBeep, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtPara, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtCc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txtCco, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(colorFuente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxTxtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNegrita)
                            .addComponent(btnCursiva)))
                    .addComponent(comboTipoFuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursivaActionPerformed
       cambiarTexto(fuente, sTexto);
    }//GEN-LAST:event_btnCursivaActionPerformed

    private void cboxTxtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTxtSizeActionPerformed
        String infoCombo = (String) cboxTxtSize.getSelectedItem();
        int intCombo = Integer.parseInt((String) cboxTxtSize.getSelectedItem());
        sTexto = intCombo;
        cambiarTexto(fuente, sTexto);
    }//GEN-LAST:event_cboxTxtSizeActionPerformed

    private void cboxTxtSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxTxtSizeMouseClicked
        //        
    }//GEN-LAST:event_cboxTxtSizeMouseClicked

    private void btnNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegritaActionPerformed
        cambiarTexto(fuente, sTexto);
    }//GEN-LAST:event_btnNegritaActionPerformed

    private void comboTipoFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoFuenteActionPerformed
        String infoFuente = (String) comboTipoFuente.getSelectedItem();
        fuente = infoFuente;
        cambiarTexto(fuente, sTexto);
    }//GEN-LAST:event_comboTipoFuenteActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        new Mail().setVisible(true);
        dispose();        
    }//GEN-LAST:event_CancelarActionPerformed

    private void colorFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorFuenteActionPerformed
        String infoColor = (String) colorFuente.getSelectedItem();
        color = infoColor;
        cambiarTexto(fuente, sTexto);
    }//GEN-LAST:event_colorFuenteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResponderTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResponderTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResponderTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResponderTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResponderTodos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton Guardar;
    private javax.swing.JToggleButton btnCursiva;
    private javax.swing.JToggleButton btnNegrita;
    private javax.swing.JComboBox<String> cboxTxtSize;
    private javax.swing.JComboBox<String> colorFuente;
    private javax.swing.JComboBox<String> comboTipoFuente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBeep;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCc;
    private javax.swing.JTextField txtCco;
    private javax.swing.JTextPane txtMail;
    private javax.swing.JTextField txtPara;
    // End of variables declaration//GEN-END:variables
}
