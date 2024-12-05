package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Estagiario;


public class CadastroEstagiario extends javax.swing.JFrame {

    public CadastroEstagiario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        PanelOptions = new javax.swing.JPanel();
        botaoExcluir = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoVisualizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        PanelOptions.setBackground(new java.awt.Color(255, 255, 255));
        PanelOptions.setPreferredSize(new java.awt.Dimension(683, 424));

        botaoExcluir.setBackground(new java.awt.Color(0, 0, 0));
        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoVisualizar.setBackground(new java.awt.Color(0, 0, 0));
        botaoVisualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVisualizar.setText("Visualizar");
        botaoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnClose.setText("X");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("O que você deseja fazer?");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Cadastro de Estagiario");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/estagio.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelOptionsLayout = new javax.swing.GroupLayout(PanelOptions);
        PanelOptions.setLayout(PanelOptionsLayout);
        PanelOptionsLayout.setHorizontalGroup(
            PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOptionsLayout.createSequentialGroup()
                        .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOptionsLayout.createSequentialGroup()
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)))
                .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelOptionsLayout.setVerticalGroup(
            PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOptionsLayout.createSequentialGroup()
                .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(PanelOptionsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String nome = JOptionPane.showInputDialog("Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String endereco = JOptionPane.showInputDialog("Endereço:");
        char sexo = JOptionPane.showInputDialog("Sexo (M/F):").charAt(0);
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura:"));
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String registro = JOptionPane.showInputDialog("Registro:");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));
        float bolsa = Float.parseFloat(JOptionPane.showInputDialog("Bolsa:"));
        float horasServico = Float.parseFloat(JOptionPane.showInputDialog("Horas de Serviço:"));

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Telefone: " + telefone);
        System.out.println("Registro: " + registro);
        System.out.println("Salário: " + salario);
        System.out.println("Bolsa: (1 = SIM   0 = NÃO)" + bolsa);
        System.out.println("Horas de Servico: " + horasServico);

        Estagiario estagiario = new Estagiario(bolsa, horasServico, nome, idade, endereco, sexo, altura, telefone, registro, salario);
        model.CadastroEstagiario.salvarCadastro(estagiario);

        JOptionPane.showMessageDialog(this, "Estagiário cadastrado com sucesso!");
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
    String nome = JOptionPane.showInputDialog("Informe o nome do estagiário a visualizar:");
    Estagiario estagiario = model.CadastroEstagiario.lerCadastro(nome);

    if (estagiario != null) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));


        panel.add(new JLabel("Nome:"));
        panel.add(new JLabel(estagiario.getNome()));

        panel.add(new JLabel("Idade:"));
        panel.add(new JLabel(String.valueOf(estagiario.getIdade())));

        panel.add(new JLabel("Endereço:"));
        panel.add(new JLabel(estagiario.getEndereco()));

        panel.add(new JLabel("Sexo:"));
        panel.add(new JLabel(String.valueOf(estagiario.getSexo())));

        panel.add(new JLabel("Altura:"));
        panel.add(new JLabel(String.valueOf(estagiario.getAltura())));

        panel.add(new JLabel("Telefone:"));
        panel.add(new JLabel(estagiario.getTelefone()));

        panel.add(new JLabel("Registro:"));
        panel.add(new JLabel(estagiario.getRegistro()));

        panel.add(new JLabel("Salário:"));
        panel.add(new JLabel(String.valueOf(estagiario.getSalario())));

        panel.add(new JLabel("Bolsa:"));
        panel.add(new JLabel(String.valueOf(estagiario.getBolsa())));

        panel.add(new JLabel("Horas de Serviço:"));
        panel.add(new JLabel(String.valueOf(estagiario.getHorasServico())));

        JOptionPane.showMessageDialog(this, panel, "Cadastro de Estagiário", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Estagiário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_botaoVisualizarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        String nome = JOptionPane.showInputDialog("Informe o nome do cadastro a excluir:");
        model.CadastroEstagiario.excluirCadastro(nome);
        JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!");
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                new CadastroEstagiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOptions;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JButton btnClose;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
