/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import static pagoimpuestovehicular.Principal_frame.lista_vehiculos;
import pagoimpuestovehicular.Vehiculo;


/**
 *
 * @author camil
 */
public class Admin_frame extends javax.swing.JFrame {
    public ArrayList<Vehiculo>vehiculos_disponibles = new ArrayList();
    /**
     * Creates new form Admin_frame
     */
    public Admin_frame() {
        initComponents();
        setSize(850, 600);
        setResizable(false);
        setLocationRelativeTo(this);
        
        input_marca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                mostrarLineaVehiculosComboBox((String) input_marca.getSelectedItem());
            }
            
            
        });
        
        input_linea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg1) {
                mostrarAgnioVehiculosComboBox((String) input_linea.getSelectedItem());      
            }
        });
        
        input_agnio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg1) {
                agregarValor((String) input_agnio.getSelectedItem());      
            }
        });
        
        mostrarTabla();
        rellenarAutosDisponibles();
        mostrarMarcasVehiculosComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_vehiculos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        input_codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        input_marca = new javax.swing.JComboBox<>();
        input_linea = new javax.swing.JComboBox<>();
        input_agnio = new javax.swing.JComboBox<>();
        input_valor = new javax.swing.JLabel();
        desc1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Línea", "Año", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_vehiculos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table_vehiculos);
        table_vehiculos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Agregar Auto");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 20, 110, 24);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Valor:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 230, 60, 24);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Código: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 70, 60, 24);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Marca:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 110, 60, 24);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Línea:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 150, 60, 24);

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Año:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 190, 60, 24);
        jPanel2.add(input_codigo);
        input_codigo.setBounds(100, 70, 140, 24);

        jButton1.setText("Agregar auto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(100, 280, 140, 24);

        input_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_marcaActionPerformed(evt);
            }
        });
        jPanel2.add(input_marca);
        input_marca.setBounds(100, 110, 140, 26);

        jPanel2.add(input_linea);
        input_linea.setBounds(100, 150, 140, 26);

        input_agnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_agnioActionPerformed(evt);
            }
        });
        jPanel2.add(input_agnio);
        input_agnio.setBounds(100, 190, 140, 26);
        jPanel2.add(input_valor);
        input_valor.setBounds(100, 230, 140, 20);

        desc1.setText("jTextField1");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(120, 120, 120))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String marca, linea, agnio;
            int codigo;
            float valor;
            marca = valueOf(input_marca.getSelectedItem());
            linea = valueOf(input_linea.getSelectedItem());
            codigo = Integer.parseInt(input_codigo.getText());
            agnio = valueOf(input_agnio.getSelectedItem());
            valor = Float.parseFloat(input_valor.getText());

            if(!"".equals(marca)&&!"".equals(linea)&&!"".equals(codigo)&&!"".equals(agnio)&&!"".equals(valor)){
                Vehiculo vehiculo_aux = new Vehiculo();
                vehiculo_aux.setCodigo(codigo);
                vehiculo_aux.setMarca(marca);
                vehiculo_aux.setLinea(linea);
                vehiculo_aux.setValorI(valor);
                vehiculo_aux.setAgnio(agnio);
                
                lista_vehiculos.add(vehiculo_aux);
            }

        }catch(Exception e){}
        mostrarTabla();
        input_codigo.setText("");
        input_valor.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void input_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_marcaActionPerformed
        
    }//GEN-LAST:event_input_marcaActionPerformed

    private void input_agnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_agnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_agnioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_frame().setVisible(true);
            }
        });
    }
    //Funciones de frame
    
    public void mostrarTabla(){
        String matriz[][] = new String[lista_vehiculos.size()][10];
        for(int i=0; i<lista_vehiculos.size();i++){
            matriz[i][0]=valueOf(lista_vehiculos.get(i).getCodigo());
            matriz[i][1]=lista_vehiculos.get(i).getMarca();
            matriz[i][2]=lista_vehiculos.get(i).getLinea();
            matriz[i][3]=lista_vehiculos.get(i).getAgnio();
            matriz[i][4]=valueOf(lista_vehiculos.get(i).getValorI());

        }
        table_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
    
    public void mostrarMarcasVehiculosComboBox(){
        String marca_p = "mas";
        for (int i=0; i<vehiculos_disponibles.size();i++) {
            if (marca_p != vehiculos_disponibles.get(i).getMarca()) {
                input_marca.addItem(vehiculos_disponibles.get(i).getMarca());
                marca_p = vehiculos_disponibles.get(i).getMarca();
            }        
        }
    }
      
    public void mostrarLineaVehiculosComboBox(String seleccion){
        input_linea.removeAllItems();
        String linea_a = "las"; 
        for (int i=0; i<vehiculos_disponibles.size(); i++) {
            if(seleccion.equals(vehiculos_disponibles.get(i).getMarca())){
                 if (linea_a != vehiculos_disponibles.get(i).getLinea()) {
                     input_linea.addItem(vehiculos_disponibles.get(i).getLinea());
                     linea_a = vehiculos_disponibles.get(i).getLinea();
                 }
            }  
        }
    }
    
    public void mostrarAgnioVehiculosComboBox(String seleccion){
        input_agnio.removeAllItems();
        String linea_a = "las"; 
        for (int i=0; i<vehiculos_disponibles.size(); i++) {
            if(seleccion.equals(vehiculos_disponibles.get(i).getLinea())){
                 if (linea_a != vehiculos_disponibles.get(i).getAgnio()) {
                     input_agnio.addItem(vehiculos_disponibles.get(i).getAgnio());
                     linea_a = vehiculos_disponibles.get(i).getAgnio();
                 }
            }  
        }
    }
    
    public void agregarValor(String seleccion){
        for (int i=0; i<vehiculos_disponibles.size(); i++) {
            if (seleccion.equals(vehiculos_disponibles.get(i).getAgnio())) {
                input_valor.setText(valueOf(vehiculos_disponibles.get(i).getValorI()));
            } 
        }
    }
    
    public void rellenarAutosDisponibles(){
        
        vehiculos_disponibles.add(new Vehiculo("NISSAN", "SENTRA", "1992", 1, Float.parseFloat("5000")));
        vehiculos_disponibles.add(new Vehiculo("NISSAN", "SENTRA", "1995", 2, Float.parseFloat("7000")));
        vehiculos_disponibles.add(new Vehiculo("NISSAN", "SENTRA", "2007", 3, Float.parseFloat("15000")));
        
        vehiculos_disponibles.add(new Vehiculo("CHEVROLET", "AVEO", "2002", 4, Float.parseFloat("8000")));
        vehiculos_disponibles.add(new Vehiculo("CHEVROLET", "AVEO", "2006", 5, Float.parseFloat("14000")));
        vehiculos_disponibles.add(new Vehiculo("CHEVROLET", "AVEO", "2010", 6, Float.parseFloat("18000")));
        
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "LOGAN", "2004", 7, Float.parseFloat("8000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "LOGAN", "2010", 8, Float.parseFloat("15000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "LOGAN", "2015", 9, Float.parseFloat("20000")));
        
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "ALASKAN", "2007", 7, Float.parseFloat("12000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "ALASKAN", "2012", 8, Float.parseFloat("16000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "ALASKAN", "2019", 9, Float.parseFloat("26000")));
        
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "CAPTUR", "2008", 7, Float.parseFloat("15000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "CAPTUR", "2014", 8, Float.parseFloat("19000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "CAPTUR", "2019", 9, Float.parseFloat("28000")));
        
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "ZOE", "2010", 7, Float.parseFloat("11000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "ZOE", "2016", 8, Float.parseFloat("13000")));
        vehiculos_disponibles.add(new Vehiculo("RENAULT", "ZOE", "2021", 9, Float.parseFloat("24000")));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField desc1;
    private javax.swing.JComboBox<String> input_agnio;
    private javax.swing.JTextField input_codigo;
    private javax.swing.JComboBox<String> input_linea;
    private javax.swing.JComboBox<String> input_marca;
    private javax.swing.JLabel input_valor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_vehiculos;
    // End of variables declaration//GEN-END:variables
}
