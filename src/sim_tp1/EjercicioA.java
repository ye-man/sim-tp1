/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim_tp1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sim_tp1.Generador.Generador;
import sim_tp1.Generador.GeneradorCongruencialLineal;
import sim_tp1.Generador.GeneradorCongruencialMultiplicativo;

/**
 *
 * @author feder
 */
public class EjercicioA extends javax.swing.JFrame {

    Generador generador;
    /**
     * Creates new form principal
     */
    public EjercicioA() {
        initComponents();
        this.btn_siguiente.setEnabled(false);
        limpiarTabla();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combo_generador = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_m = new javax.swing.JTextField();
        txt_c = new javax.swing.JTextField();
        txt_x0 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_k = new javax.swing.JTextField();
        txt_g = new javax.swing.JTextField();
        txt_a = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        txt_cant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_numeros = new javax.swing.JTable();
        btn_siguiente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Generador de Números Aleatorios"));

        jLabel1.setText("Generador: ");

        combo_generador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Congruencial Mixto o Lineal", "Congruencial Multiplicativo" }));
        combo_generador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_generadorActionPerformed(evt);
            }
        });

        jLabel2.setText("a: ");

        jLabel3.setText("c: ");

        jLabel4.setText("M: ");

        jLabel5.setText("Semilla: ");

        txt_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_mKeyReleased(evt);
            }
        });

        jLabel6.setText("k:");

        jLabel7.setText("g:");

        txt_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kActionPerformed(evt);
            }
        });
        txt_k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_kKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_kKeyReleased(evt);
            }
        });

        txt_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gActionPerformed(evt);
            }
        });
        txt_g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_gKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_gKeyReleased(evt);
            }
        });

        txt_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aActionPerformed(evt);
            }
        });
        txt_a.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_aPropertyChange(evt);
            }
        });
        txt_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_aKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_aKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aKeyTyped(evt);
            }
        });

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        txt_cant.setText("10");
        txt_cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_generador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txt_k))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_x0, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_m, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(txt_c)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_g, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combo_generador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txt_k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txt_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_x0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcular)))
        );

        table_numeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "i", "Xi+1", "Número Aleatorio"
            }
        ));
        jScrollPane1.setViewportView(table_numeros);

        btn_siguiente.setText("Siguiente ");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_siguiente)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btn_siguiente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_generadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_generadorActionPerformed
        if (this.combo_generador.getSelectedItem().equals("Congruencial Mixto o Lineal")){
            this.txt_c.setEnabled(true);
        }
        else if (this.combo_generador.getSelectedItem().equals("Congruencial Multiplicativo")){
            this.txt_c.setEnabled(false);
        }
    }//GEN-LAST:event_combo_generadorActionPerformed

    private void txt_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kActionPerformed

    private void txt_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gActionPerformed

    private void txt_cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantActionPerformed

    private void txt_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aActionPerformed
        
    }//GEN-LAST:event_txt_aActionPerformed

    private void txt_aPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_aPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_aPropertyChange

    private void txt_aKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyPressed
 
    }//GEN-LAST:event_txt_aKeyPressed

    private void txt_mKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_mKeyPressed

    private void txt_kKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_kKeyPressed

    private void txt_gKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_gKeyPressed

    private void txt_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aKeyTyped

    private void txt_aKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyReleased
        // TODO add your handling code here:
        if (this.txt_a.getText().isEmpty()){
            this.txt_k.setEnabled(true);
        }
        else {
            this.txt_k.setEnabled(false);          
        }
    }//GEN-LAST:event_txt_aKeyReleased

    private void txt_kKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kKeyReleased
        // TODO add your handling code here:
        if (this.txt_k.getText().isEmpty()){
            this.txt_a.setEnabled(true);
        }
        else {
            this.txt_a.setEnabled(false);
        }
    }//GEN-LAST:event_txt_kKeyReleased

    private void txt_mKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mKeyReleased
        // TODO add your handling code here:
        if (this.txt_m.getText().isEmpty()){
            this.txt_g.setEnabled(true);
        }
        else {
            this.txt_g.setEnabled(false);
        }
    }//GEN-LAST:event_txt_mKeyReleased

    private void txt_gKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gKeyReleased
        // TODO add your handling code here:
        if (this.txt_g.getText().isEmpty()){
            this.txt_m.setEnabled(true);
        }
        else {
            this.txt_m.setEnabled(false);
        }
    }//GEN-LAST:event_txt_gKeyReleased

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        if (verificarCampos()){
            generador = null;
            generador = crearGenerador();
            
           try {
            int cantidad = Integer.parseInt(this.txt_cant.getText());
            if (!this.txt_a.getText().isEmpty()){
                generador.setA(Integer.parseInt(this.txt_a.getText()));
            }
            else {
                 generador.setK(Integer.parseInt(this.txt_k.getText()));
            }
            
            
            if (!this.txt_m.getText().isEmpty()){
                generador.setM(Integer.parseInt(this.txt_m.getText()));
            }
            else {
                 generador.setG(Integer.parseInt(this.txt_g.getText()));
            }
          
            if (!this.txt_c.getText().isEmpty()){
                generador.setC(Integer.parseInt(this.txt_c.getText()));
            }
            generador.setX0(Integer.parseInt(this.txt_x0.getText()));
           
           
            limpiarTabla();
            DefaultTableModel tm = (DefaultTableModel) this.table_numeros.getModel();

            for (int i = 0; i <cantidad; i++){
                double rnd = generador.calcularSiguiente();
                int xi = generador.getXi();
                tm.addRow(new Object[]{i,xi,rnd});
            }
            
            this.btn_calcular.setEnabled(false);
            this.btn_siguiente.setEnabled(true);
            
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
            
           
            
        }
        
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        limpiarTabla();
        this.combo_generador.setFocusable(true);
        this.btn_calcular.setEnabled(true);
        this.btn_siguiente.setEnabled(false);
        this.txt_a.setEnabled(true);
        this.txt_m.setEnabled(true);
        this.txt_k.setEnabled(true);
        this.txt_g.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tm = (DefaultTableModel) this.table_numeros.getModel();
         double rnd = generador.calcularSiguiente();
         int xi = generador.getXi();
         tm.addRow(new Object[]{tm.getRowCount(),xi,rnd});
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel)this.table_numeros.getModel();
            int length = modelo.getRowCount();
            for (int i = 0; i < length; i++) {
            modelo.removeRow(0);
            
       } 
    }
    
    private void limpiarCampos(){
        this.combo_generador.setSelectedIndex(0);
        this.txt_a.setText("");
        this.txt_c.setText("");
        this.txt_m.setText("");
        this.txt_k.setText("");
        this.txt_g.setText("");
        this.txt_x0.setText("");
        this.txt_cant.setText("10");
    }
    
    private Generador crearGenerador(){
        
        Generador generador = null;
        if (this.combo_generador.getSelectedIndex() == 0){
            generador = new GeneradorCongruencialLineal();
        }
        else if (this.combo_generador.getSelectedIndex() == 1){
            generador = new GeneradorCongruencialMultiplicativo();
        }
        
        return generador;
    }
    
    
    private boolean verificarCampos(){
        if (this.txt_a.getText().isEmpty() && this.txt_k.getText().isEmpty()){
            return false;
        }
        
        if (this.txt_m.getText().isEmpty() && this.txt_g.getText().isEmpty()){
            return false;
        }
        
        if (this.combo_generador.getSelectedIndex() == 0 && this.txt_c.getText().isEmpty()){
            return false;
        }
        
        if (this.txt_x0.getText().isEmpty()){
            return false;
        }
        
        
        if (this.txt_cant.getText().isEmpty()){
            return false;
        }
        
        
        return true;
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
            java.util.logging.Logger.getLogger(EjercicioA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JComboBox<String> combo_generador;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTable table_numeros;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_c;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_g;
    private javax.swing.JTextField txt_k;
    private javax.swing.JTextField txt_m;
    private javax.swing.JTextField txt_x0;
    // End of variables declaration//GEN-END:variables
}
