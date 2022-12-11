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
public class RetirarVehiculo extends javax.swing.JDialog {

    /**
     * Creates new form Tarifas
     */
    public RetirarVehiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tablaTarifas.setModel(ModeloTarifas.tablaTarifas());
        cargarDatos();
        mostrarUsuarios.setModel(ValidacionRegistrarUsuario.ValoresUsuarios());
    }
    private double cargarDatos() {
        double resultado = 0; 
        double descuento, precio;
       

        if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("1")) {
                if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 1000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
         if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("1")) {
                if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 1000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
            if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("1")) {
                    if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 1000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
             if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("1")) {
                    if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 1000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("1")) {
                        if(cumpleBox.getSelectedItem().equals("SI")){ 
                        precio = 1500;
                        descuento = 0.20;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                
                } 
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("1")) {
                        if(cumpleBox.getSelectedItem().equals("NO")){ 
                        precio = 1500;
                        descuento = 0;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                }
                
                
        if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("1")){
               if(cumpleBox.getSelectedItem().equals("SI")){ 
                precio=1500;
                descuento=0.20;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
         if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("1")){
               if(cumpleBox.getSelectedItem().equals("NO")){ 
                precio=1500;
                descuento=0;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
         
         
         if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("2")) {
                if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 2000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
         if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("2")) {
                if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 2000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
            if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("2")) {
                    if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 2000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
             if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("2")) {
                    if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 2000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("2")) {
                        if(cumpleBox.getSelectedItem().equals("SI")){ 
                        precio = 2500;
                        descuento = 0.20;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                
                } 
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("2")) {
                        if(cumpleBox.getSelectedItem().equals("NO")){ 
                        precio = 2500;
                        descuento = 0;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                }
                
                
        if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("2")){
               if(cumpleBox.getSelectedItem().equals("SI")){ 
                precio=2500;
                descuento=0.20;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
         if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("2")){
               if(cumpleBox.getSelectedItem().equals("NO")){ 
                precio=2500;
                descuento=0;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
       if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("3")) {
                if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 3000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
         if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("3")) {
                if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 3000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
            if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("3")) {
                    if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 3000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
             if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("3")) {
                    if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 3000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("3")) {
                        if(cumpleBox.getSelectedItem().equals("SI")){ 
                        precio = 3500;
                        descuento = 0.20;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                
                } 
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("3")) {
                        if(cumpleBox.getSelectedItem().equals("NO")){ 
                        precio = 3500;
                        descuento = 0;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                }
                
                
        if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("3")){
               if(cumpleBox.getSelectedItem().equals("SI")){ 
                precio=3500;
                descuento=0.20;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
         if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("3")){
               if(cumpleBox.getSelectedItem().equals("NO")){ 
                precio=3500;
                descuento=0;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
       if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("4")) {
                if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 4000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
         if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("4")) {
                if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 4000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
            if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("4")) {
                    if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 4000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
             if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("4")) {
                    if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 4000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                }
                }
                
            }
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("4")) {
                        if(cumpleBox.getSelectedItem().equals("SI")){ 
                        precio = 4500;
                        descuento = 0.20;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                
                } 
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("4")) {
                        if(cumpleBox.getSelectedItem().equals("NO")){ 
                        precio = 4500;
                        descuento = 0;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                }
                
                
        if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("4")){
               if(cumpleBox.getSelectedItem().equals("SI")){ 
                precio=4500;
                descuento=0.20;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
         if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("4")){
               if(cumpleBox.getSelectedItem().equals("NO")){ 
                precio=4500;
                descuento=0;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
       if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("5")) {
                if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 5000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
         if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("5")) {
                if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 5000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
            if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("5")) {
                    if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 5500;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    JOptionPane.showMessageDialog(rootPane, "tiempo caducado, valor de la hora mas monto de 500 adicional");
                    return resultado;
                    
                }
                }
                
            }
             if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("5")) {
                    if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 5500;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    JOptionPane.showMessageDialog(rootPane, "tiempo caducado, valor de la hora mas monto de 500 adicional");
                    return resultado;
                }
                }
                
            }
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("5")) {
                        if(cumpleBox.getSelectedItem().equals("SI")){ 
                        precio = 5500;
                        descuento = 0.20;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                
                } 
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("5")) {
                        if(cumpleBox.getSelectedItem().equals("NO")){ 
                        precio = 5500;
                        descuento = 0;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                }
                
                
        if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("5")){
               if(cumpleBox.getSelectedItem().equals("SI")){ 
                precio=5500;
                descuento=0.20;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
         if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("5")){
               if(cumpleBox.getSelectedItem().equals("NO")){ 
                precio=5500;
                descuento=0;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
       if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("6")) {
                if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 6000;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
         if (usuarioBox.getSelectedItem().equals("Docente")) {
            if (horasBox.getSelectedItem().equals("6")) {
                if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 6000;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    return resultado;
                    
                
                }
            }
        
        }
            if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("6")) {
                    if(cumpleBox.getSelectedItem().equals("SI")){
                    precio = 6500;
                    descuento = 0.20;
                    resultado = (precio) - (precio * descuento);
                    JOptionPane.showMessageDialog(rootPane, "tiempo caducado,valor de la hora mas monto de 500 adicional");
                    return resultado;
                }
                }
                
            }
             if (usuarioBox.getSelectedItem().equals("Estudiante")) {
                if (horasBox.getSelectedItem().equals("6")) {
                    if(cumpleBox.getSelectedItem().equals("NO")){
                    precio = 6500;
                    descuento = 0;
                    resultado = (precio) - (precio * descuento);
                    JOptionPane.showMessageDialog(rootPane, "tiempo caducado,valor de la hora mas monto de 500 adicional");
                    return resultado;
                }
                }
                
            }
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("6")) {
                        if(cumpleBox.getSelectedItem().equals("SI")){ 
                        precio = 6500;
                        descuento = 0.20;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                
                } 
                if (usuarioBox.getSelectedItem().equals("Funcionario")) {
                    if (horasBox.getSelectedItem().equals("6")) {
                        if(cumpleBox.getSelectedItem().equals("NO")){ 
                        precio = 6500;
                        descuento = 0;
                        resultado=(precio)-(precio*descuento);
                        return resultado;
                    }
                    
                }
                }
                
                
        if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("6")){
               if(cumpleBox.getSelectedItem().equals("SI")){ 
                precio=6500;
                descuento=0.20;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
         if(usuarioBox.getSelectedItem().equals("Particular")){
            if(horasBox.getSelectedItem().equals("6")){
               if(cumpleBox.getSelectedItem().equals("NO")){ 
                precio=6500;
                descuento=0;
                resultado=(precio)-(precio*descuento);
                return resultado;
              }
            
        }
        }
       
       
        return 0;     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTarifas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuarioBox = new javax.swing.JComboBox<>();
        horasBox = new javax.swing.JComboBox<>();
        totalPagar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cumpleBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarUsuarios = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TARIFAS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 16, 86, 21);

        jScrollPane1.setViewportView(tablaTarifas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 43, 452, 120);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 120, 80, 30);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 150, 80, 30);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Pagar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 210, 80, 30);

        usuarioBox.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        usuarioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Estudiante", "Docente", "Particular", "Funcionario" }));
        usuarioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioBoxActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioBox);
        usuarioBox.setBounds(560, 120, 120, 30);

        horasBox.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        horasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        horasBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasBoxActionPerformed(evt);
            }
        });
        jPanel1.add(horasBox);
        horasBox.setBounds(560, 150, 120, 30);

        totalPagar.setEditable(false);
        jPanel1.add(totalPagar);
        totalPagar.setBounds(560, 210, 120, 30);

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("V. Familiar");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 180, 80, 30);

        cumpleBox.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cumpleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "SI", "NO" }));
        cumpleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cumpleBoxActionPerformed(evt);
            }
        });
        jPanel1.add(cumpleBox);
        cumpleBox.setBounds(560, 180, 120, 30);

        jButton1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 260, 100, 30);

        mostrarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(mostrarUsuarios);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 210, 452, 160);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUARIOS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 180, 105, 20);

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RETIRAR VEHICULO");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, 80, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 380);

        setSize(new java.awt.Dimension(705, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioBoxActionPerformed
       totalPagar.setText(String.valueOf(cargarDatos()));
    }//GEN-LAST:event_usuarioBoxActionPerformed

    private void horasBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasBoxActionPerformed
        totalPagar.setText(String.valueOf(cargarDatos()));
    }//GEN-LAST:event_horasBoxActionPerformed

    private void cumpleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cumpleBoxActionPerformed
      totalPagar.setText(String.valueOf(cargarDatos()));
    }//GEN-LAST:event_cumpleBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JOptionPane.showMessageDialog(rootPane, "Gracias por utilizar nuestro servicio");        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RetirarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetirarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetirarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetirarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RetirarVehiculo dialog = new RetirarVehiculo(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cumpleBox;
    private javax.swing.JComboBox<String> horasBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable mostrarUsuarios;
    private javax.swing.JTable tablaTarifas;
    private javax.swing.JTextField totalPagar;
    private javax.swing.JComboBox<String> usuarioBox;
    // End of variables declaration//GEN-END:variables
}
