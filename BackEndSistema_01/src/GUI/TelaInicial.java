/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.util.ArrayList;
import main.Biblioteca;
/**
 *
 * @author Guilherme
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }
    Biblioteca biblioteca = Biblioteca.getInstance();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPesquisarLivro = new javax.swing.JButton();
        btnPesquisarLeitor = new javax.swing.JButton();
        btnAdicionarLivro = new javax.swing.JButton();
        btnAdicionarLeitor = new javax.swing.JButton();
        btnAluguel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPesquisarLivro.setText("Listar Livro");
        btnPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLivroActionPerformed(evt);
            }
        });

        btnPesquisarLeitor.setText("Listar Leitor");
        btnPesquisarLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLeitorActionPerformed(evt);
            }
        });

        btnAdicionarLivro.setText("Adicionar Livro");
        btnAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarLivroActionPerformed(evt);
            }
        });

        btnAdicionarLeitor.setText("Ações Leitor");
        btnAdicionarLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarLeitorActionPerformed(evt);
            }
        });

        btnAluguel.setText("Alugar Livro");
        btnAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAluguelActionPerformed(evt);
            }
        });

        jButton1.setText("Listar Livros Alugados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarLeitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisarLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnPesquisarLivro)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisarLeitor)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdicionarLeitor)
                .addGap(18, 18, 18)
                .addComponent(btnAluguel)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLivroActionPerformed
        new ListarLivro().setVisible(true);
    }//GEN-LAST:event_btnPesquisarLivroActionPerformed

    private void btnPesquisarLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLeitorActionPerformed
        new ListarLeitor().setVisible(true);
    }//GEN-LAST:event_btnPesquisarLeitorActionPerformed

    private void btnAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarLivroActionPerformed
        new AdicionarLivro().setVisible(true);
    }//GEN-LAST:event_btnAdicionarLivroActionPerformed

    private void btnAdicionarLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarLeitorActionPerformed
        new AdicionarLeitor().setVisible(true);
    }//GEN-LAST:event_btnAdicionarLeitorActionPerformed

    private void btnAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAluguelActionPerformed
        new Aluguel().setVisible(true);
    }//GEN-LAST:event_btnAluguelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ObrasAlugadas().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarLeitor;
    private javax.swing.JButton btnAdicionarLivro;
    private javax.swing.JButton btnAluguel;
    private javax.swing.JButton btnPesquisarLeitor;
    private javax.swing.JButton btnPesquisarLivro;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
