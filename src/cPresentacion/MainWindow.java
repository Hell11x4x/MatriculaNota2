
package cPresentacion;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainWindow extends javax.swing.JFrame {
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        InitContent();
        setLocationRelativeTo(null); 
        
        
    }
    
    private void InitContent(){
        ShowJPanel(new RegistroMatricula());
        
    }
    
    private void ShowJPanel(JPanel rm){
        rm.setSize(700, 550);
        rm.setLocation(0,0);
        
        content.removeAll();
        content.add(rm, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        lblTitleMatricula = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistroMatricula1 = new javax.swing.JButton();
        btnRegistroNotas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(51, 51, 255));
        menu.setPreferredSize(new java.awt.Dimension(200, 550));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleMatricula.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTitleMatricula.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleMatricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/matricula.png"))); // NOI18N
        menu.add(lblTitleMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 200, 200));
        menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 10));

        btnRegistroMatricula1.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistroMatricula1.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnRegistroMatricula1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroMatricula1.setText("MATRÍCULA");
        btnRegistroMatricula1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegistroMatricula1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistroMatricula1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2024-05-07 103508.png"))); // NOI18N
        btnRegistroMatricula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroMatricula1ActionPerformed(evt);
            }
        });
        menu.add(btnRegistroMatricula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 60));

        btnRegistroNotas.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistroNotas.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnRegistroNotas.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroNotas.setText("NOTAS");
        btnRegistroNotas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegistroNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistroNotas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Notas1.png"))); // NOI18N
        btnRegistroNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroNotasActionPerformed(evt);
            }
        });
        menu.add(btnRegistroNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 200, 60));

        btnSalir.setBackground(new java.awt.Color(204, 0, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 488, 200, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 30));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        content.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroMatricula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroMatricula1ActionPerformed
        ShowJPanel(new RegistroMatricula());
    }//GEN-LAST:event_btnRegistroMatricula1ActionPerformed

    private void btnRegistroNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroNotasActionPerformed
        ShowJPanel(new RegistroNotas());
    }//GEN-LAST:event_btnRegistroNotasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistroMatricula1;
    private javax.swing.JButton btnRegistroNotas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitleMatricula;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
