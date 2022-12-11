/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero.presentacion;
import Parqueadero.logica.*;
import javax.swing.JOptionPane;
/**
 *
 * @author braya
 */
public class RegistrarUsuario extends javax.swing.JDialog {

    /**
     * Creates new form MenuPrincipal
     */
    public RegistrarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public static String usuario;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        cargo = new javax.swing.JComboBox<>();
        parqueadero = new javax.swing.JComboBox<>();
        vehiculo = new javax.swing.JComboBox<>();
        placa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        reporteSistema = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 70, 90, 30);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 100, 90, 30);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 130, 90, 30);

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo vehiculo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 190, 90, 30);

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Placa");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 220, 90, 30);

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Parqueadero");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 160, 90, 30);
        jPanel1.add(nombre);
        nombre.setBounds(150, 70, 190, 30);

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(apellido);
        apellido.setBounds(150, 100, 190, 30);

        cargo.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Estudiante", "Docente", "Particular", "Funcionario" }));
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });
        jPanel1.add(cargo);
        cargo.setBounds(150, 130, 130, 30);

        parqueadero.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        parqueadero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Bloque I", "Bloque H", "Bloque A", "Bloque P" }));
        jPanel1.add(parqueadero);
        parqueadero.setBounds(150, 160, 130, 30);

        vehiculo.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        vehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Bicicleta", "Moto", "Carro", "Camioneta" }));
        vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(vehiculo);
        vehiculo.setBounds(150, 190, 130, 30);
        jPanel1.add(placa);
        placa.setBounds(150, 220, 190, 30);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR USUARIO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 220, 30);

        registrar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar);
        registrar.setBounds(60, 260, 100, 30);

        regresar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        regresar.setText("Salir");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar);
        regresar.setBounds(220, 260, 100, 30);

        reporteSistema.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        reporteSistema.setText("Reportes del sistema");
        reporteSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteSistemaActionPerformed(evt);
            }
        });
        jPanel1.add(reporteSistema);
        reporteSistema.setBounds(110, 300, 170, 30);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(370, 10, 300, 50);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 80, 300, 280);

        jButton1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton1.setText("Retirar vehiculo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 340, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 380);

        setSize(new java.awt.Dimension(705, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RetirarVehiculo dialog = new RetirarVehiculo(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reporteSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteSistemaActionPerformed
        this.dispose();
        new ReporteSistema(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_reporteSistemaActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        guardar();
        registrar();
    }//GEN-LAST:event_registrarActionPerformed

    private void vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculoActionPerformed
        if(vehiculo.getSelectedItem().equals("Bicicleta")){
            placa.setVisible(false);
            jLabel6.setVisible(false);
        }else{
            placa.setVisible(true);
            jLabel6.setVisible(true);
        }
    }//GEN-LAST:event_vehiculoActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    public void guardar(){
        usuario = nombre.getText() + " " + apellido.getText();
    }
    
    public void registrar(){
    String respuesta = ValidacionRegistrarUsuario.agregar(nombre.getText(), apellido.getText(), cargo.getSelectedItem().toString(),
            parqueadero.getSelectedItem().toString(), vehiculo.getSelectedItem().toString(), placa.getText());
        if(respuesta.equals("OK")){
            JOptionPane.showMessageDialog(rootPane, "Usuario registrado exitosamente");
            Ticket dialog = new Ticket(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, respuesta);
        }
}
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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarUsuario dialog = new RegistrarUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> parqueadero;
    private javax.swing.JTextField placa;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    private javax.swing.JButton reporteSistema;
    private javax.swing.JComboBox<String> vehiculo;
    // End of variables declaration//GEN-END:variables
}
