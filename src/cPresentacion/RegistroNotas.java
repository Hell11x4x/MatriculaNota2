package cPresentacion;

import Entidad.Matricula;
import Entidad.Nota;
import cDatos.MatriculaDAO;
import cNegocio.NotaNegocio;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class RegistroNotas extends javax.swing.JPanel {

    private NotaNegocio notaNegocio;
    private MatriculaDAO matriculaDAO = new MatriculaDAO();

    /**
     * Creates new form RegistroNotas
     */
    public RegistroNotas() {
        initComponents();
        notaNegocio = new NotaNegocio();
        cargarDatosTabla();

        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                calcularPromedio();
                validarNota((JTextField) documentEvent.getDocument().getProperty("owner"));
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                calcularPromedio();
                validarNota((JTextField) documentEvent.getDocument().getProperty("owner"));
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                calcularPromedio();
                validarNota((JTextField) documentEvent.getDocument().getProperty("owner"));
            }
        };

        txtNota1.getDocument().putProperty("owner", txtNota1);
        txtNota1.getDocument().addDocumentListener(documentListener);

        txtNota2.getDocument().putProperty("owner", txtNota2);
        txtNota2.getDocument().addDocumentListener(documentListener);

        txtNota3.getDocument().putProperty("owner", txtNota3);
        txtNota3.getDocument().addDocumentListener(documentListener);

        txtDniVerificar.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String dniVerificar = txtDniVerificar.getText();
                Matricula matriculaAlumno = matriculaDAO.obtenerMatriculaPorDni(dniVerificar);

                if (matriculaAlumno == null || !dniVerificar.equals(matriculaAlumno.getDni())) {
                    JOptionPane.showMessageDialog(null, "No coincide con el DNI del alumno matriculado.", "Error", JOptionPane.ERROR_MESSAGE);
                    txtDniVerificar.requestFocus();
                }
            }
        });

    }

    private void calcularPromedio() {
        try {
            double nota1 = txtNota1.getText().isEmpty() ? 0 : Double.parseDouble(txtNota1.getText());
            double nota2 = txtNota2.getText().isEmpty() ? 0 : Double.parseDouble(txtNota2.getText());
            double nota3 = txtNota3.getText().isEmpty() ? 0 : Double.parseDouble(txtNota3.getText());

            int count = 0;
            if (!txtNota1.getText().isEmpty()) {
                count++;
            }
            if (!txtNota2.getText().isEmpty()) {
                count++;
            }
            if (!txtNota3.getText().isEmpty()) {
                count++;
            }

            if (count > 0) {
                int promedio = (int) ((nota1 + nota2 + nota3) / count);
                txtPromedioFinal.setText(String.valueOf(promedio));
            } else {
                txtPromedioFinal.setText("");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción aquí
        }
    }

    private boolean validarNota(JTextField txtNota) {
        String input = txtNota.getText();
        if (input.isEmpty()) {
            return true;
        }
        try {
            if (!input.matches("[0-9]+") || input.contains(".")) {
                JOptionPane.showMessageDialog(null, "La nota debe ser un número entero", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtNota.requestFocus();
                return false;
            }
            double nota = Double.parseDouble(input);
            if (nota < 0 || nota > 20) {
                JOptionPane.showMessageDialog(null, "La nota debe estar en el rango de 0 a 20", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtNota.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida", "Error", JOptionPane.ERROR_MESSAGE);
            txtNota.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lblTitleRegistroNotas = new javax.swing.JLabel();
        lblDniAlumno = new javax.swing.JLabel();
        txtDniVerificar = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        cboxCurso = new javax.swing.JComboBox<>();
        lblNota1 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        lblNota2 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        lblNota3 = new javax.swing.JLabel();
        txtNota3 = new javax.swing.JTextField();
        lblPromedioFinal = new javax.swing.JLabel();
        txtPromedioFinal = new javax.swing.JTextField();
        btnRegistrarNota = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotas = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleRegistroNotas.setBackground(new java.awt.Color(0, 0, 0));
        lblTitleRegistroNotas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitleRegistroNotas.setForeground(new java.awt.Color(0, 0, 0));
        lblTitleRegistroNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleRegistroNotas.setText("REGISTRO DE NOTAS");
        lblTitleRegistroNotas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(lblTitleRegistroNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, -1));

        lblDniAlumno.setBackground(new java.awt.Color(0, 0, 0));
        lblDniAlumno.setForeground(new java.awt.Color(0, 0, 0));
        lblDniAlumno.setText("DNI del alumno");
        background.add(lblDniAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtDniVerificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDniVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniVerificarActionPerformed(evt);
            }
        });
        background.add(txtDniVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 30));

        lblCurso.setBackground(new java.awt.Color(0, 0, 0));
        lblCurso.setForeground(new java.awt.Color(0, 0, 0));
        lblCurso.setText("Curso:");
        background.add(lblCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        cboxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistemas operativos", "Taller de programación web", "Algoritmos y estructuras de datos", "Redes y comunicación de datos I", " " }));
        cboxCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(cboxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 250, 30));

        lblNota1.setBackground(new java.awt.Color(0, 0, 0));
        lblNota1.setForeground(new java.awt.Color(0, 0, 0));
        lblNota1.setText("Nota 1:");
        background.add(lblNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtNota1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(txtNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, 30));

        lblNota2.setBackground(new java.awt.Color(0, 0, 0));
        lblNota2.setForeground(new java.awt.Color(0, 0, 0));
        lblNota2.setText("Nota 2:");
        background.add(lblNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtNota2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(txtNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 180, 30));

        lblNota3.setBackground(new java.awt.Color(0, 0, 0));
        lblNota3.setForeground(new java.awt.Color(0, 0, 0));
        lblNota3.setText("Nota 3:");
        background.add(lblNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtNota3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(txtNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 30));

        lblPromedioFinal.setBackground(new java.awt.Color(0, 0, 0));
        lblPromedioFinal.setForeground(new java.awt.Color(0, 0, 0));
        lblPromedioFinal.setText("PROMEDIO FINAL");
        background.add(lblPromedioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        txtPromedioFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(txtPromedioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 180, 30));

        btnRegistrarNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar-como.png"))); // NOI18N
        btnRegistrarNota.setText("REGISTRAR");
        btnRegistrarNota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistrarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNotaActionPerformed(evt);
            }
        });
        background.add(btnRegistrarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 180, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tableNotas.setBackground(new java.awt.Color(255, 255, 255));
        tableNotas.setForeground(new java.awt.Color(0, 0, 0));
        tableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "dni", "curso", "nota 1", "nota 2", "nota 3", "promedio final"
            }
        ));
        jScrollPane1.setViewportView(tableNotas);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 670, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatosTabla() {
        List<Nota> notas = notaNegocio.obtenerNotas();
        DefaultTableModel modelo = (DefaultTableModel) tableNotas.getModel();
        modelo.setRowCount(0); // Limpiar la tabla
        for (Nota nota : notas) {
            modelo.addRow(new Object[]{nota.getDniAlumno(), nota.getCurso(), nota.getNota1(), nota.getNota2(), nota.getNota3(), nota.getPromedioFinal()});
        }
    }

    private void btnRegistrarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNotaActionPerformed

        if (txtDniVerificar.getText().isEmpty() || txtNota1.getText().isEmpty() || txtNota2.getText().isEmpty() || txtNota3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan campos por rellenar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!validarNota(txtNota1) || !validarNota(txtNota2) || !validarNota(txtNota3)) {
            return;
        }

        Nota nota = new Nota();
        nota.setDniAlumno(txtDniVerificar.getText());
        nota.setCurso((String) cboxCurso.getSelectedItem());

        double nota1 = Double.parseDouble(txtNota1.getText());
        nota.setNota1(nota1);

        double nota2 = Double.parseDouble(txtNota2.getText());
        nota.setNota2(nota2);

        double nota3 = Double.parseDouble(txtNota3.getText());
        nota.setNota3(nota3);

        // Calcular el promedio final
        double promedioFinal = (nota1 + nota2 + nota3) / 3;
        promedioFinal = Math.ceil(promedioFinal);
        nota.setPromedioFinal(promedioFinal);
        txtPromedioFinal.setText(String.valueOf(promedioFinal));

        notaNegocio.registrarNota(nota);
        // Actualizar la tabla con la nueva nota registrada
        DefaultTableModel modelo = (DefaultTableModel) tableNotas.getModel();
        modelo.addRow(new Object[]{nota.getDniAlumno(), nota.getCurso(), nota.getNota1(), nota.getNota2(), nota.getNota3(), nota.getPromedioFinal()});
        cargarDatosTabla();

    }//GEN-LAST:event_btnRegistrarNotaActionPerformed

    private void txtDniVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniVerificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniVerificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnRegistrarNota;
    private javax.swing.JComboBox<String> cboxCurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDniAlumno;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JLabel lblPromedioFinal;
    private javax.swing.JLabel lblTitleRegistroNotas;
    private javax.swing.JTable tableNotas;
    private javax.swing.JTextField txtDniVerificar;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtPromedioFinal;
    // End of variables declaration//GEN-END:variables

    private List<Matricula> obtenerMatriculas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
