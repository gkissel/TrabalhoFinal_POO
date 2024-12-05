package view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Livro;


public class Biblioteca extends javax.swing.JFrame {

    public Biblioteca() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        PanelOpcoes = new javax.swing.JPanel();
        butAdicionarLivro = new javax.swing.JButton();
        butExcluirLivro = new javax.swing.JButton();
        butPesquisarLivro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        PanelOpcoes.setBackground(new java.awt.Color(255, 255, 255));

        butAdicionarLivro.setBackground(new java.awt.Color(0, 0, 0));
        butAdicionarLivro.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        butAdicionarLivro.setForeground(new java.awt.Color(255, 255, 255));
        butAdicionarLivro.setText("Adicionar Livro");
        butAdicionarLivro.setToolTipText("");
        butAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAdicionarLivroActionPerformed(evt);
            }
        });

        butExcluirLivro.setBackground(new java.awt.Color(0, 0, 0));
        butExcluirLivro.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        butExcluirLivro.setForeground(new java.awt.Color(255, 255, 255));
        butExcluirLivro.setText("Excluir Livro");
        butExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluirLivroActionPerformed(evt);
            }
        });

        butPesquisarLivro.setBackground(new java.awt.Color(0, 0, 0));
        butPesquisarLivro.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        butPesquisarLivro.setForeground(new java.awt.Color(255, 255, 255));
        butPesquisarLivro.setText("Pesquisar Livro");
        butPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPesquisarLivroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnClose.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        btnClose.setText("X");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Livro.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Livro.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Biblioteca Virtual");

        javax.swing.GroupLayout PanelOpcoesLayout = new javax.swing.GroupLayout(PanelOpcoes);
        PanelOpcoes.setLayout(PanelOpcoesLayout);
        PanelOpcoesLayout.setHorizontalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butAdicionarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butPesquisarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butExcluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelOpcoesLayout.setVerticalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91)
                        .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOpcoesLayout.createSequentialGroup()
                                .addComponent(butAdicionarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butPesquisarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butExcluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPesquisarLivroActionPerformed
String tituloLivro = JOptionPane.showInputDialog("Informe o título do livro: ");
        Livro livro = model.CadastroLivro.lerLivro(tituloLivro);

        if (livro != null) {
            JPanel panel = new JPanel(new GridLayout(0, 2));

            panel.add(new JLabel("Título:"));
            panel.add(new JLabel(livro.getTitulo()));

            panel.add(new JLabel("Autor:"));
            panel.add(new JLabel(livro.getAutor()));

            panel.add(new JLabel("Ano de Publicação:"));
            panel.add(new JLabel(String.valueOf(livro.getAnoPublicacao())));

            panel.add(new JLabel("Gênero:"));
            panel.add(new JLabel(livro.getGenero()));

            JOptionPane.showMessageDialog(this, panel, "Detalhes do Livro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Livro não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butPesquisarLivroActionPerformed

    private void butExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluirLivroActionPerformed
        String titulo = JOptionPane.showInputDialog("Informe o título do livro para excluir: ");
        model.CadastroLivro.excluirLivro(titulo);
        JOptionPane.showMessageDialog(this, "Livro excluído com sucesso!");
    }//GEN-LAST:event_butExcluirLivroActionPerformed

    private void butAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAdicionarLivroActionPerformed
        String titulo = JOptionPane.showInputDialog("Título do Livro:");
        String autor = JOptionPane.showInputDialog("Autor:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de Publicação:"));
        String genero = JOptionPane.showInputDialog("Gênero:");

        Livro livro = new Livro(titulo, autor, ano, genero);
        model.CadastroLivro.salvarLivro(livro);

        JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso!");
    }//GEN-LAST:event_butAdicionarLivroActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOpcoes;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton butAdicionarLivro;
    private javax.swing.JButton butExcluirLivro;
    private javax.swing.JButton butPesquisarLivro;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
