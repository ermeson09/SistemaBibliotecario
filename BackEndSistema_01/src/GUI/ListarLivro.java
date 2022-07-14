/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.ListModel;
import java.lang.String;
import javax.swing.DefaultComboBoxModel;
import main.ArrayListComboBoxModelBiblioteca;
import main.Biblioteca;
/**
 *
 * @author Guilherme
 */
public class ListarLivro extends javax.swing.JFrame {
    /**
     * Creates new form PesquisarLivro
     */
    public ListarLivro() {
        initComponents();
    }
    Biblioteca biblioteca = Biblioteca.getInstance();
    ArrayList arraylist = biblioteca.getObras();
    ArrayListComboBoxModelBiblioteca model = new ArrayListComboBoxModelBiblioteca(arraylist);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeLivro = new javax.swing.JLabel();
        btnVoltarLivro = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa de Livro");

        lblNomeLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeLivro.setText("Livros:");

        btnVoltarLivro.setText("Voltar");
        btnVoltarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLivroActionPerformed(evt);
            }
        });

        jComboBox1.setModel(model);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnVoltarLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblNomeLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnSelecionar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnVoltarLivro)
                .addGap(24, 24, 24)
                .addComponent(lblNomeLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnSelecionar)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnVoltarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLivroActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarLivroActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        /*jComboBox1.removeAllItems();
        for(int i=0; i<biblioteca.getObras().size(); i++){
            jComboBox1.addItem(biblioteca.getObras().get(i).toString());
        }
        jComboBox1.updateUI();*/
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        
    }//GEN-LAST:event_btnSelecionarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnVoltarLivro;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblNomeLivro;
    // End of variables declaration//GEN-END:variables
}
