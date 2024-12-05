package view;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JLabel;
import model.Funcionario;
import model.Estagiario;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TesteCadastroFuncionario extends javax.swing.JInternalFrame {

    public TesteCadastroFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCad = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrar(evt);
            }
        });

        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizar(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluir(evt);
            }
        });

        javax.swing.GroupLayout panelCadLayout = new javax.swing.GroupLayout(panelCad);
        panelCad.setLayout(panelCadLayout);
        panelCadLayout.setHorizontalGroup(
            panelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panelCadLayout.setVerticalGroup(
            panelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluir
        String nome = JOptionPane.showInputDialog("Informe o nome do cadastro a excluir:");
        model.CadastroFuncionario.excluirCadastro(nome);
        JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!");
    }//GEN-LAST:event_botaoExcluir

    private void botaoVisualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizar
        String nome = JOptionPane.showInputDialog("Informe o nome do estagiário a visualizar:");
        Funcionario funcionario = model.CadastroFuncionario.lerCadastro(nome);

        if (funcionario != null) {
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2));
            
            panel.add(new JLabel("Nome:"));
            panel.add(new JLabel(funcionario.getNome()));

            panel.add(new JLabel("Idade:"));
            panel.add(new JLabel(String.valueOf(funcionario.getIdade())));

            panel.add(new JLabel("Endereço:"));
            panel.add(new JLabel(funcionario.getEndereco()));

            panel.add(new JLabel("Sexo:"));
            panel.add(new JLabel(String.valueOf(funcionario.getSexo())));

            panel.add(new JLabel("Altura:"));
            panel.add(new JLabel(String.valueOf(funcionario.getAltura())));

            panel.add(new JLabel("Telefone:"));
            panel.add(new JLabel(funcionario.getTelefone()));

            panel.add(new JLabel("Registro:"));
            panel.add(new JLabel(funcionario.getRegistro()));

            panel.add(new JLabel("Salário:"));
            panel.add(new JLabel(String.valueOf(funcionario.getSalario())));

            JOptionPane.showMessageDialog(this, panel, "Cadastro de Estagiário", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Estagiário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoVisualizar

    private void botaoCadastrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrar
        String nome = JOptionPane.showInputDialog("Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String endereco = JOptionPane.showInputDialog("Endereço:");
        char sexo = JOptionPane.showInputDialog("Sexo (M/F):").charAt(0);
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura:"));
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String registro = JOptionPane.showInputDialog("Registro:");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Telefone: " + telefone);
        System.out.println("Registro: " + registro);
        System.out.println("Salário: " + salario);

        Funcionario funcionario = new Funcionario(nome, idade, endereco, sexo, altura, telefone, registro, salario);
        model.CadastroFuncionario.salvarCadastro(funcionario);

        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
    }//GEN-LAST:event_botaoCadastrar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panelCad;
    // End of variables declaration//GEN-END:variables
}
