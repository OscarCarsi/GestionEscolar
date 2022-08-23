/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uv.fei.gestionescolar.gui;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uv.fei.gestionescolar.bussinesslogic.AcademicoDAO;
import uv.fei.gestionescolar.bussinesslogic.UsuarioDAO;
import uv.fei.gestionescolar.domain.Usuario;
import uv.fei.gestionescolar.validaciones.ValidacionDeDatosRegistro;
import uv.fei.sistemadetutorias.domain.Academico;

/**
 *
 * @author oscar
 */
public class RegistrarAcademicoGUI extends javax.swing.JFrame {
    private ValidacionDeDatosRegistro validar = new ValidacionDeDatosRegistro();
    private final int ROL_ACADEMICO = 2;
    /**
     * Creates new form NewJFrame
     */
    public RegistrarAcademicoGUI() {
        initComponents();
    }
        private boolean sonCamposValidos(){
        boolean estatusCampus = false;
        int numeroDeCamposInvalidos = 0;
        if (tfNumeroPersonal.getText().isEmpty() || tfNombre.getText().isEmpty() || tfApellidoPaterno.getText().isEmpty() || tfApellidoMaterno.getText().isEmpty() || tfCorreoPersonal.getText().isEmpty() 
        || tfCorreoInstitucional.getText().isEmpty() || tfNombreUsuario.getText().isEmpty() || pfContraseña.getPassword().length == 0){
            JOptionPane.showMessageDialog(null, "No se puede dejar campos en blanco. Campos obligatorios");
        }
        else {
            if(validar.validarLongitudDeCadena(tfNombre.getText()) == false || validar.validarMayusculasMinusculasAcentos(tfNombre.getText()) == false){
                tfNombre.setBackground(new Color(255, 69, 43));
                numeroDeCamposInvalidos++;
            }    
            if(validar.validarLongitudDeCadena(tfApellidoPaterno.getText()) == false || validar.validarMayusculasMinusculasAcentos(tfApellidoPaterno.getText()) == false){        
                tfApellidoPaterno.setBackground(new Color(255, 69, 43));
                numeroDeCamposInvalidos++;
            }
            if(validar.validarLongitudDeCadena(tfApellidoMaterno.getText()) == false || validar.validarMayusculasMinusculasAcentos(tfApellidoMaterno.getText()) == false){
                tfApellidoMaterno.setBackground(new Color(255, 69, 43));
                numeroDeCamposInvalidos++;
            }    
            if(validar.validarCorreoElectronico(tfCorreoPersonal.getText()) == false){
                tfCorreoPersonal.setBackground(new Color(255, 69, 43));
                numeroDeCamposInvalidos++;
            }
            if(validar.validarCorreoElectronico(tfCorreoInstitucional.getText()) == false){
                tfCorreoInstitucional.setBackground(new Color(255, 69, 43));
                numeroDeCamposInvalidos++;
            }
            int numeroDePersonal = validar.validarNumeros(tfNumeroPersonal.getText());
            if (numeroDePersonal == -1){
                tfNumeroPersonal.setBackground(new Color(255, 69, 43));
                numeroDeCamposInvalidos++;
            }
            if(validar.validarLongitudDeCadena(tfNombreUsuario.getText()) == false || validar.validarMayusculasMinusculasAcentos(tfNombreUsuario.getText()) == false){        
                tfNombreUsuario.setBackground(new Color(255, 69, 43));
                numeroDeCamposInvalidos++;
            }
            if (numeroDeCamposInvalidos == 0){
                estatusCampus = true;
            }
        }
        return estatusCampus;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbRegistroAcademico = new javax.swing.JLabel();
        lbNumeroPersonal = new javax.swing.JLabel();
        tfNumeroPersonal = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbApellidoPaterno = new javax.swing.JLabel();
        tfApellidoPaterno = new javax.swing.JTextField();
        lbApellidoMaterno = new javax.swing.JLabel();
        tfApellidoMaterno = new javax.swing.JTextField();
        lbCorreoInstitucional = new javax.swing.JLabel();
        tfCorreoInstitucional = new javax.swing.JTextField();
        lbCorreoPersonal = new javax.swing.JLabel();
        tfCorreoPersonal = new javax.swing.JTextField();
        tfNombreUsuario = new javax.swing.JTextField();
        lbNombreUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pfContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbRegistroAcademico.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbRegistroAcademico.setText("Registro de Académico");

        lbNumeroPersonal.setText("Numero de personal");

        lbNombre.setText("Nombre");

        lbApellidoPaterno.setText("Apellido Paterno");

        lbApellidoMaterno.setText("Apellido Materno");

        lbCorreoInstitucional.setText("Correo Institucional");

        lbCorreoPersonal.setText("Correo personal");

        lbNombreUsuario.setText("Nombre de Usuario");

        lbContraseña.setText("Contraseña");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lbRegistroAcademico))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbNumeroPersonal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbApellidoPaterno)
                                    .addComponent(lbApellidoMaterno))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCorreoInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCorreoInstitucional))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCorreoPersonal)
                            .addComponent(lbNombreUsuario)
                            .addComponent(lbContraseña))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tfCorreoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(pfContraseña))))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbRegistroAcademico)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumeroPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbApellidoPaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbApellidoMaterno)
                    .addComponent(tfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreoInstitucional)
                    .addComponent(tfCorreoInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCorreoPersonal)
                    .addComponent(tfCorreoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombreUsuario)
                    .addComponent(tfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbContraseña)
                    .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int numeroPersonal = Integer.parseInt(tfNumeroPersonal.getText());
        String nombre = tfNombre.getText();
        String apellidoPaterno = tfApellidoPaterno.getText();
        String apellidoMaterno = tfApellidoMaterno.getText();
        String correoInstitucional = tfCorreoInstitucional.getText();
        String correoPersonal = tfCorreoPersonal.getText();
        String nombreUsuario = tfNombreUsuario.getText();
        String contraseña = String.valueOf(pfContraseña.getPassword());
        Academico academicoRegistrado = new Academico();
        AcademicoDAO academicoDAO = new AcademicoDAO();
        Usuario usuarioRegistrado = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        academicoRegistrado.setNombre(nombre);
        academicoRegistrado.setNumeroDePersonal(numeroPersonal);
        academicoRegistrado.setApellidoPaterno(apellidoPaterno);
        academicoRegistrado.setApellidoMaterno(apellidoMaterno);
        academicoRegistrado.setCorreoInstitucional(correoInstitucional);
        academicoRegistrado.setCorreoPersonal(correoPersonal);
        usuarioRegistrado.setNumeroDePersonal(numeroPersonal);
        usuarioRegistrado.setNombreDeUsuario(nombreUsuario);
        usuarioRegistrado.setContraseña(contraseña);
        try{
            academicoDAO.registrarAcademico(academicoRegistrado);
            usuarioDAO.registrarUsuarioAcademico(usuarioRegistrado);
            usuarioDAO.asignarUsuarioRol(usuarioDAO.obtenerIdUsuario(usuarioRegistrado), ROL_ACADEMICO);
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException mensajeError) {
            JOptionPane.showMessageDialog(null, mensajeError);
        }
        InicioSesionGUI consultarEE = new InicioSesionGUI();
        this.setVisible(false);
        consultarEE.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        InicioSesionGUI consultarEE = new InicioSesionGUI();
        this.setVisible(false);
        consultarEE.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarAcademicoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAcademicoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAcademicoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAcademicoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAcademicoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lbApellidoMaterno;
    private javax.swing.JLabel lbApellidoPaterno;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbCorreoInstitucional;
    private javax.swing.JLabel lbCorreoPersonal;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JLabel lbNumeroPersonal;
    private javax.swing.JLabel lbRegistroAcademico;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JTextField tfApellidoMaterno;
    private javax.swing.JTextField tfApellidoPaterno;
    private javax.swing.JTextField tfCorreoInstitucional;
    private javax.swing.JTextField tfCorreoPersonal;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreUsuario;
    private javax.swing.JTextField tfNumeroPersonal;
    // End of variables declaration//GEN-END:variables
}
