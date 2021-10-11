/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Propietario;

import javax.swing.JOptionPane;
import static pagoimpuestovehicular.Principal_frame.lista_vehiculos;
import static java.lang.String.valueOf;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Propietario.Factura;
import static pagoimpuestovehicular.Principal_frame.descProntoPago;
import static pagoimpuestovehicular.Principal_frame.descServPublico;
import static pagoimpuestovehicular.Principal_frame.descTrasCuenta;



/**
 *
 * @author camil
 */
public class Propietario_frame extends javax.swing.JFrame {

    
    public Propietario_frame() {
        initComponents();
        mostrarTabla();
        setLocationRelativeTo(this);
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxTransladoDeCuenta = new javax.swing.JCheckBox();
        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        btnImprimirComprobante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boxProntoPago = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        boxServicioPublico = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boxTransladoDeCuenta.setText("TRANSLADO DE CUENTA");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INTERFAZ PROPIETARIO");

        jLabel2.setText("CÓDIGO : ");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("MARCA : ");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        btnImprimirComprobante.setText("IMPRIMIR COMPROBANTE");
        btnImprimirComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirComprobanteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Marca", "Modelo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("MODELO : ");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        jLabel5.setText("AÑO :");

        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });

        jLabel7.setText("DESCUENTOS : ");

        boxProntoPago.setText("PRONTO PAGO");
        boxProntoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProntoPagoActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        boxServicioPublico.setText("SERVICIO PÚBLICO");

        jLabel6.setText("VALOR : ");

        jLabel8.setText("NOMBRE CLIENTE : ");

        jLabel9.setText("N° DOCUMENTO : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(147, 147, 147)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMarca))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtModelo)
                                        .addComponent(txtAño)
                                        .addComponent(txtValor))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(91, 91, 91))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxServicioPublico)
                                    .addComponent(boxProntoPago)
                                    .addComponent(boxTransladoDeCuenta))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDocumento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombreCliente)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnImprimirComprobante)
                                        .addGap(35, 35, 35))))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxProntoPago)
                            .addComponent(jLabel9)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxServicioPublico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxTransladoDeCuenta)
                            .addComponent(btnImprimirComprobante))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        txtModelo.setEditable(false);
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        txtAño.setEditable(false);
    }//GEN-LAST:event_txtAñoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        txtMarca.setEditable(false);
    }//GEN-LAST:event_txtMarcaActionPerformed

    
    private void btnImprimirComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirComprobanteActionPerformed
        
       String cliente, documento, marca, linea, agnio, descuentosApli = "";
        double valor, totalDescuentos = 0, totalAPagar;
        
        cliente = txtNombreCliente.getText();
        documento = txtDocumento.getText();
        marca = txtMarca.getText();
        linea = txtModelo.getText();
        agnio = txtAño.getText();
        valor = Double.parseDouble(txtValor.getText());
        totalAPagar = valor;
        
        if (boxServicioPublico.isSelected() && boxTransladoDeCuenta.isSelected() && boxProntoPago.isSelected()) {
            descuentosApli = "SERVICIO PÚBLICO, TRASLADO CUENTA, PRONTO PAGO";
            totalDescuentos = valor*(descServPublico+descTrasCuenta+descProntoPago);
            totalAPagar = valor-totalDescuentos;
        }else{
            if (boxServicioPublico.isSelected()) {
                descuentosApli = " SERVICIO PÚBLICO ";
                totalDescuentos = totalDescuentos + totalAPagar*descServPublico;
                totalAPagar = totalAPagar-totalAPagar*descServPublico;
                
            }
            if (boxTransladoDeCuenta.isSelected()) {
                descuentosApli = descuentosApli + " TRASLADO CUENTA ";
                totalDescuentos = totalDescuentos + totalAPagar*descTrasCuenta;
                totalAPagar = totalAPagar-totalAPagar*descTrasCuenta;
                
            }
            if (boxProntoPago.isSelected()) {
                descuentosApli = descuentosApli + " PRONTO PAGO ";
                totalDescuentos = totalDescuentos + totalAPagar*descProntoPago;
                totalAPagar = totalAPagar-totalAPagar*descProntoPago;
                
            }
        }
        
        
        Factura ventana = new Factura(cliente, documento, marca, linea, agnio, valor, descuentosApli, totalDescuentos, totalAPagar);
        ventana.setVisible(true);
        
        cliente =leerNombre();
        if(cliente.length() == 0){
            JOptionPane.showMessageDialog(rootPane, "INGRESE NOMBRE DE CLIENTE");
            txtNombreCliente.requestFocus();
        }
        
        documento = leerDocumento();
            if(documento.length() == 0){
            JOptionPane.showMessageDialog(rootPane, "INGRESE DOCUMENTO DEL CLIENTE");
            txtDocumento.requestFocus();
        }
 
    }//GEN-LAST:event_btnImprimirComprobanteActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

   
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            for (int i=0;i<lista_vehiculos.size();i++) {
                if (txtCodigo.getText().equals(valueOf(lista_vehiculos.get(i).getCodigo()))) {
                    txtMarca.setText(lista_vehiculos.get(i).getMarca());
                    txtModelo.setText(lista_vehiculos.get(i).getLinea());
                    txtAño.setText(lista_vehiculos.get(i).getAgnio());
                    txtValor.setText(valueOf(lista_vehiculos.get(i).getValorI()));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE UN CÓDIGO VÁLIDO");
	}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void boxProntoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProntoPagoActionPerformed
        
    }//GEN-LAST:event_boxProntoPagoActionPerformed
    
    int leerCodigo(){
       return Integer.parseInt(txtCodigo.getText().trim());
   }
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
            java.util.logging.Logger.getLogger(Propietario_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Propietario_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Propietario_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Propietario_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Propietario_frame().setVisible(true);
            }
        });
    }
    public void mostrarTabla(){
        String matriz[][] = new String[lista_vehiculos.size()][10];
        for(int i=0; i<lista_vehiculos.size();i++){
            matriz[i][0]=valueOf(lista_vehiculos.get(i).getCodigo());
            matriz[i][1]=lista_vehiculos.get(i).getMarca();
            matriz[i][2]=lista_vehiculos.get(i).getLinea();
            matriz[i][3]=lista_vehiculos.get(i).getAgnio();
            matriz[i][4]=valueOf(lista_vehiculos.get(i).getValorI());

            //lista_vehiculos
            //vehiculos_disponibles
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Código", "Marca", "Línea", "Año", "Valor"
            } 
            
        ){
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            };
            
        });
    }
    public void Limpiar(JPanel panel){
        for (Object o : panel.getComponents()) {
            if(o instanceof JLabel){
                ((JLabel) o).setText("");
            
        }
            
        }
        
    }
    String leerNombre(){
       return txtNombreCliente.getText().trim();
   }
    String leerDocumento(){
       return txtDocumento.getText().trim();
   }
   /*int leerDocumento(){
       return Integer.parseInt(txtDocumento.getText().trim());
   }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxProntoPago;
    private javax.swing.JCheckBox boxServicioPublico;
    private javax.swing.JCheckBox boxTransladoDeCuenta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimirComprobante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
