/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.entities.Conta;
import com.mycompany.entities.ContaCorrente;
import com.mycompany.entities.ContaPoupanca;
import com.mycompany.entities.ContaSalario;
import com.mycompany.entities.Titular;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Felip
 */
public class TelaCriarConta extends javax.swing.JPanel {
    public Titular titular;
    public Conta conta;
    public List listaConta;

    public TelaCriarConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bt_voltar = new javax.swing.JButton();
        bt_criar = new javax.swing.JButton();
        jrb_corrente = new javax.swing.JRadioButton();
        jrb_poupanca = new javax.swing.JRadioButton();
        jrb_salario = new javax.swing.JRadioButton();
        tf_titular = new javax.swing.JTextField();
        tf_endereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });

        bt_criar.setText("Criar Conta");
        bt_criar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_criarMouseClicked(evt);
            }
        });

        jrb_corrente.setText("Corrente");

        jrb_poupanca.setText("Poupança");

        jrb_salario.setText("Salário");

        jLabel1.setText("Titular :");

        jLabel2.setText("Endereço :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel3.setText("Criar Nova Conta");

        jLabel4.setText("Crie uma nova conta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_titular)
                                .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(bt_criar)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrb_corrente)
                        .addGap(94, 94, 94)
                        .addComponent(jrb_poupanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrb_salario)
                        .addGap(54, 54, 54))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_corrente)
                    .addComponent(jrb_poupanca)
                    .addComponent(jrb_salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_voltar)
                    .addComponent(bt_criar))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        Janela.telaUsuario = new Principal();  
        janela.getContentPane().remove(Janela.telaCriarConta);
        janela.add(Janela.telaUsuario, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_criarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_criarMouseClicked
        if(!tf_endereco.getText().equals("") && !tf_titular.getText().equals("")){    
            if(jrb_corrente.isSelected()){
                titular = new Titular(tf_titular.getText(), tf_endereco.getText());
                conta = new ContaCorrente(titular);
                JOptionPane.showMessageDialog(null, "Conta criada!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
            } else {
                if(jrb_poupanca.isSelected()){
                    titular = new Titular(tf_titular.getText(), tf_endereco.getText());
                    conta = new ContaPoupanca(titular);
                    JOptionPane.showMessageDialog(null, "Conta criada!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                } else {
                    if(jrb_salario.isSelected()){
                        titular = new Titular(tf_titular.getText(), tf_endereco.getText());
                        conta = new ContaSalario(titular);
                        JOptionPane.showMessageDialog(null, "Conta criada!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
                    } else JOptionPane.showMessageDialog(null, "Selecione um tipo de conta.", "Erro!", JOptionPane.ERROR_MESSAGE); 
                }
            }
        } else JOptionPane.showMessageDialog(null, "Complete todos os campos.", "Erro!", JOptionPane.ERROR_MESSAGE); 
    }//GEN-LAST:event_bt_criarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_criar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton jrb_corrente;
    private javax.swing.JRadioButton jrb_poupanca;
    private javax.swing.JRadioButton jrb_salario;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_titular;
    // End of variables declaration//GEN-END:variables
}
