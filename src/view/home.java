package view;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        panelPrincipal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParte1 = new javax.swing.JMenu();
        mnFunc = new javax.swing.JMenu();
        mnFuncCad = new javax.swing.JMenuItem();
        mnEst = new javax.swing.JMenu();
        mnEstCad = new javax.swing.JMenuItem();
        mnParte2 = new javax.swing.JMenu();
        BibliotecaMenu = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Link do Repositório:  https://github.com/gkissel/TrabalhoFinal_POO");

        jLabel5.setText("051183 - Guilherme Carbonera Chiaradia");

        jLabel4.setText("105723 - Gustavo Kissel");

        jLabel3.setText("105495 - Guilherme Caue Deon");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Programação Orientada a Objetos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Trabalho Final");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        mnParte1.setText("Parte 1");

        mnFunc.setText("Funcionário");

        mnFuncCad.setText("Cadastro");
        mnFuncCad.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFuncCadActionPerformed(evt);
            }
        });
        mnFunc.add(mnFuncCad);

        mnParte1.add(mnFunc);

        mnEst.setText("Estagiário");

        mnEstCad.setText("Cadastro");
        mnEstCad.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstCadActionPerformed(evt);
            }
        });
        mnEst.add(mnEstCad);

        mnParte1.add(mnEst);

        jMenuBar1.add(mnParte1);

        mnParte2.setText("Parte 2");
        mnParte2.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
			public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            @Override
			public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            @Override
			public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnParte2MenuSelected(evt);
            }
        });

        BibliotecaMenu.setText("Biblioteca");
        BibliotecaMenu.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                BibliotecaMenuActionPerformed(evt);
            }
        });
        mnParte2.add(BibliotecaMenu);

        jMenuBar1.add(mnParte2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnFuncCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFuncCadActionPerformed
        CadastroFuncionario tela = new CadastroFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_mnFuncCadActionPerformed

    private void mnEstCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstCadActionPerformed
        CadastroEstagiario tela = new CadastroEstagiario();
        tela.setVisible(true);
    }//GEN-LAST:event_mnEstCadActionPerformed

    private void mnParte2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnParte2MenuSelected

    }//GEN-LAST:event_mnParte2MenuSelected

    private void BibliotecaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BibliotecaMenuActionPerformed
        Biblioteca tela = new Biblioteca();
        tela.setVisible(true);
    }//GEN-LAST:event_BibliotecaMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BibliotecaMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu mnEst;
    private javax.swing.JMenuItem mnEstCad;
    private javax.swing.JMenu mnFunc;
    private javax.swing.JMenuItem mnFuncCad;
    private javax.swing.JMenu mnParte1;
    private javax.swing.JMenu mnParte2;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
