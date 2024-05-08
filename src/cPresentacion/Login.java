package cPresentacion;

import cNegocio.UserService;
import cPresentacion.MainWindow;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private UserService userService;
    /**
    * Crea un nuevo formulario de inicio de sesión
    */
    public Login() {
        initComponents();
        userService = new UserService();
    }
    /**
    * Este método se llama desde el constructor para inicializar el formulario.
    * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
    * regenerado por el Editor de formularios.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        btnCerrarLogin = new javax.swing.JButton();
        txtUsuariooEmail = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtPassContraseña = new javax.swing.JPasswordField();
        jCheckBoxRecuerdame = new javax.swing.JCheckBox();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblCardHeader = new javax.swing.JLabel();
        lblCardContent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatar_Container.png"))); // NOI18N
        lblAvatar.setText("jLabel3");
        jPanel2.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 450, -1));

        btnCerrarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btnCerrarLogin.setContentAreaFilled(false);
        btnCerrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        txtUsuariooEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuariooEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuariooEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuariooEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 30));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña");
        jPanel2.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtPassContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassContraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 30));

        jCheckBoxRecuerdame.setText("Recuerdame");
        jPanel2.add(jCheckBoxRecuerdame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        btnRegister.setBackground(new java.awt.Color(85, 110, 230));
        btnRegister.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnRegister.setText("Signup now");
        btnRegister.setBorder(null);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 30));

        btnLogin.setBackground(new java.awt.Color(85, 110, 230));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 310, 30));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lblCardHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Header.jpg"))); // NOI18N
        lblCardHeader.setText("jLabel2");
        lblCardHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblCardHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        lblCardContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Content.png"))); // NOI18N
        lblCardContent.setText("jLabel1");
        lblCardContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblCardContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 350));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 400, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-440, -110, 840, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String email = txtUsuariooEmail.getText();
        String password = new String(txtPassContraseña.getPassword());
        if (userService.authenticate(email, password)) {
            // Autenticación exitosa, mostrar mensaje de bienvenida
            JOptionPane.showMessageDialog(this, "Bienvenido " + email + "!", "Autenticación exitosa", JOptionPane.INFORMATION_MESSAGE);
            // Cerrar la ventana de login y mostrar la ventana principal
            this.dispose();
            new MainWindow().setVisible(true);
        } else {
            // Autenticación fallida, mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        RegisterWindow registerWindow = new RegisterWindow();
        JFrame registerFrame = new JFrame("Registro");
        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registerFrame.add(registerWindow);
        registerFrame.pack();
        registerFrame.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCerrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarLoginActionPerformed

    private void txtPassContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassContraseñaActionPerformed

    private void txtUsuariooEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuariooEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuariooEmailActionPerformed

    /**
     * @param args the command line arguments (argumenta los argumentos de la línea de comando)
     */
    public static void main(String args[]) {
        /* Establecer la apariencia de Nimbus */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarLogin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox jCheckBoxRecuerdame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblCardContent;
    private javax.swing.JLabel lblCardHeader;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassContraseña;
    private javax.swing.JTextField txtUsuariooEmail;
    // End of variables declaration//GEN-END:variables
}
