
package com.mycompany.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Felipe Davi
 */
public class Principal extends javax.swing.JPanel {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jrb_corrente = new javax.swing.JRadioButton();
        jrb_poupanca = new javax.swing.JRadioButton();
        bt_entrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrb_salario = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        bt_criarConta = new javax.swing.JButton();

        buttonGroup1.add(jrb_corrente);
        jrb_corrente.setText("Corrente");

        buttonGroup1.add(jrb_poupanca);
        jrb_poupanca.setText("Poupança");

        bt_entrar.setText("Entrar");
        bt_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_entrarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel1.setText("NewBank");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel2.setText("O seu banco novo.");

        buttonGroup1.add(jrb_salario);
        jrb_salario.setText("Salário");

        jLabel3.setText("Escolha o tipo de conta ou entre crie uma nova conta:");

        bt_criarConta.setText("Criar Nova Conta");
        bt_criarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_criarContaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(bt_criarConta))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jrb_corrente)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_poupanca)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_salario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_entrar)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addComponent(bt_criarConta))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_corrente)
                    .addComponent(jrb_poupanca)
                    .addComponent(jrb_salario)
                    .addComponent(bt_entrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_entrarMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        if(jrb_corrente.isSelected()){
            Janela.telaCorrente = new TelaCorrente();  
            janela.getContentPane().remove(Janela.telaUsuario);
            janela.add(Janela.telaCorrente, BorderLayout.CENTER);
            janela.pack();
        } else {
            if(jrb_poupanca.isSelected()){
                Janela.telaPoupanca = new TelaPoupanca();  
                janela.getContentPane().remove(Janela.telaUsuario);
                janela.add(Janela.telaPoupanca, BorderLayout.CENTER);
                janela.pack();
            } else {
                if(jrb_salario.isSelected()){
                    Janela.telaSalario = new TelaSalario();  
                    janela.getContentPane().remove(Janela.telaUsuario);
                    janela.add(Janela.telaSalario, BorderLayout.CENTER);
                    janela.pack();
                } else JOptionPane.showMessageDialog(null, "Escolha uma opção.", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }     
    }//GEN-LAST:event_bt_entrarMouseClicked

    private void bt_criarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_criarContaMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        Janela.telaCriarConta = new TelaCriarConta();  
        janela.getContentPane().remove(Janela.telaUsuario);
        janela.add(Janela.telaCriarConta, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_criarContaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_criarConta;
    private javax.swing.JButton bt_entrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrb_corrente;
    private javax.swing.JRadioButton jrb_poupanca;
    private javax.swing.JRadioButton jrb_salario;
    // End of variables declaration//GEN-END:variables
}
