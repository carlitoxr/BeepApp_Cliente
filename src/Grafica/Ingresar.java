/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Conectividad.FachadaCon;
import Logica.Fachada;
import Logica.Usuario2;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    public Ingresar() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
    }
    private void ejecutar() throws IOException{
        String usuario=CI.getText();
        String pass = "";
        for(int i=0;i<Pass.getPassword().length;i++){
            pass = pass + Pass.getPassword()[i];
        }
        String mensaje="";
        aviso.setText("");
        
        if(usuario.trim().equals(""))
        {
            mensaje="El campo usuario es obligatorio";
        }
        if(pass.trim().equals(""))
        {
            if(mensaje.equals(""))
                mensaje="El campo password es obligatorio";
        }
        if(pass.trim().equals("")&& usuario.trim().equals(""))
        {
                mensaje="Ambos campos deben ser completados";
        }
//        if(pass.trim().equals("calera")&& usuario.trim().equals("calera"))
//        {
//            new Mail().setVisible(true);
//            dispose();
//        }
        if(!pass.isEmpty() && !usuario.isEmpty()){
            String servidor = FachadaCon.getInstancia().Login(usuario, pass);
            System.out.println("" + servidor);
            Fachada.getInstancia().cargar_usuario(usuario, pass);
            if(servidor.equals("Valido")){
                FachadaCon.getInstancia().IniSocket();
                new SeleccionarCuenta().setVisible(true);
                dispose();
            } else if(servidor.equals("NoPass")){
                mensaje="Contraseña incorrecta";
            } else if(servidor.equals("NoCuenta"))
                mensaje="La cuenta no existe";
        }
        else{           
            //aviso.setText(mensaje);
        }
        aviso.setText(mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        etiquetaCI = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        CI = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        etiquetaPass = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        etiquetaCI.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        etiquetaCI.setText("Ingrese el documento de Identidad");

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BeepFondo.png"))); // NOI18N

        CI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        etiquetaPass.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        etiquetaPass.setText("Ingrese su contraseña");

        Ingresar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        aviso.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaCI, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CI)
                            .addComponent(Pass)
                            .addComponent(Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        try {
            ejecutar();
        } catch (IOException ex) {
            ex.printStackTrace();
            //Logger.getLogger(Ingresar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CI;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Ingresar;
    private javax.swing.JPanel Panel;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel etiquetaCI;
    private javax.swing.JLabel etiquetaPass;
    // End of variables declaration//GEN-END:variables
}
