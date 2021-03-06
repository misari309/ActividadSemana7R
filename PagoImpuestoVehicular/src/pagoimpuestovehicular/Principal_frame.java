/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagoimpuestovehicular;

import Admin.Admin_frame;
import Propietario.Propietario_frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */
public class Principal_frame extends javax.swing.JFrame {
    public static ArrayList<Vehiculo>lista_vehiculos=new ArrayList<>();
    public static double descProntoPago;
    public static double descServPublico;
    public static double descTrasCuenta;

    /**
     * Creates new form Principal_frame
     */
    public Principal_frame() {
        initComponents();
        setSize(460, 675);
        setResizable(false);
        setLocationRelativeTo(this);

        lista_vehiculos.add(new Vehiculo("CHEVROLET", "AVEO", "2006", 1, Float.parseFloat("14000")));
        lista_vehiculos.add(new Vehiculo("RENAULT", "ZOE", "2016", 2, Float.parseFloat("13000")));
        lista_vehiculos.add(new Vehiculo("NISSAN", "SENTRA", "1995", 3, Float.parseFloat("7000")));
        
         descProntoPago = 0.2;
         descServPublico = 0.15;
         descTrasCuenta = 0.1;
        
    }

    
    public Vehiculo buscar(int codigo){//ESTE METODO LO AGREGUE PARA PODER RETORNAR EL CDIGO Y BUSCAR LA INFORMACION PERTENENCIENTE AL MISMO..HC
        for (int i = 0; i <lista_vehiculos.size() ; i++) {
            if(lista_vehiculos.get(i).getCodigo() == codigo)
                return lista_vehiculos.get(i);
        }
        return null;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_admin_frame = new javax.swing.JButton();
        btn_propietario_frame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAcercaDe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_admin_frame.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btn_admin_frame.setText("Admin");
        btn_admin_frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_frameActionPerformed(evt);
            }
        });

        btn_propietario_frame.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btn_propietario_frame.setText("Propietario");
        btn_propietario_frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_propietario_frameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Pago de Impuestos ");

        btnAcercaDe.setText("ACERCA DE");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAcercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1)
                        .addComponent(btn_propietario_frame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(btn_admin_frame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(btn_propietario_frame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_admin_frame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_propietario_frameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_propietario_frameActionPerformed
        Propietario_frame propietario_frame = new Propietario_frame();
        propietario_frame.setVisible(true);
        
    }//GEN-LAST:event_btn_propietario_frameActionPerformed

    private void btn_admin_frameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_frameActionPerformed
        Admin_frame admin_frame = new Admin_frame();
        admin_frame.setVisible(true);
        
    }//GEN-LAST:event_btn_admin_frameActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
       
        JOptionPane.showMessageDialog(rootPane, "PROYECTO DESARROLLADO POR:\n "+"CAMILO SANCHEZ \n "+"HERMES CASTRO\n ");
    }//GEN-LAST:event_btnAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btn_admin_frame;
    private javax.swing.JButton btn_propietario_frame;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
