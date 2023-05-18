
package com.mycompany.gui;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.mycompany.entities.Conta;
import com.mycompany.entities.ContaPoupanca;
import com.mycompany.entities.Historico;
import com.mycompany.entities.Operacao;
import com.mycompany.entities.Titular;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaPoupanca extends javax.swing.JPanel {
    public Conta contaPoupanca;
    public Titular titular;
    public Historico historico;
    public Operacao operacao;
    private String destinoArquivo;


    public TelaPoupanca() {
        initComponents();
        titular = new Titular("Felipe", "Rua Da Mãe Juana");
        contaPoupanca = new ContaPoupanca(titular);
        historico = new Historico(titular);
        destinoArquivo = "./Historico_Operações.pdf";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_sacar = new javax.swing.JTextField();
        tf_depositar = new javax.swing.JTextField();
        bt_voltar = new javax.swing.JButton();
        bt_sacar = new javax.swing.JButton();
        bt_depositar = new javax.swing.JButton();
        bt_pagarOnline = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_pagarOnline = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jl_saldo = new javax.swing.JLabel();
        bt_historico = new javax.swing.JButton();

        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });

        bt_sacar.setText("Sacar");
        bt_sacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sacarMouseClicked(evt);
            }
        });

        bt_depositar.setText("Depositar");
        bt_depositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_depositarMouseClicked(evt);
            }
        });

        bt_pagarOnline.setText("Pagar Online");
        bt_pagarOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pagarOnlineMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel2.setText("Conta Poupanca");

        jLabel3.setText("Contas poupanças possuem uma taxa de saque de 0,05%;");

        jLabel1.setText("Saldo atual: ");

        jl_saldo.setText("jLabel2");

        bt_historico.setText("Histórico");
        bt_historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_historicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bt_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_historico)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_saldo)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_depositar)
                        .addComponent(bt_pagarOnline))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_sacar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_sacar)
                        .addComponent(tf_pagarOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sacar)
                    .addComponent(tf_sacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_depositar)
                    .addComponent(tf_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_pagarOnline)
                    .addComponent(tf_pagarOnline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_voltar)
                    .addComponent(jLabel1)
                    .addComponent(jl_saldo)
                    .addComponent(bt_historico))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        Janela.telaUsuario = new Principal();
        janela.getContentPane().remove(Janela.telaPoupanca);
        janela.add(Janela.telaUsuario, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_sacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sacarMouseClicked
        if(!tf_sacar.getText().equals("")){
            float sacar = Float.parseFloat(tf_sacar.getText());
            contaPoupanca.sacar(sacar);
            jl_saldo.setText(String.valueOf(contaPoupanca.getSaldo()));
            tf_sacar.setText("");
            operacao = new Operacao("Operação sacar concluída.", sacar);
            historico.adicionarOperacao(operacao);
        } else JOptionPane.showMessageDialog(null, "Digite um valor.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_sacarMouseClicked

    private void bt_depositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_depositarMouseClicked
        if(!tf_depositar.getText().equals("")){
            float depositar = Float.parseFloat(tf_depositar.getText());
            contaPoupanca.depositar(depositar);
            jl_saldo.setText(String.valueOf(contaPoupanca.getSaldo()));
            tf_depositar.setText("");
            operacao = new Operacao("Operação depositar concluída.", depositar);
            historico.adicionarOperacao(operacao);
        } else JOptionPane.showMessageDialog(null, "Digite um valor.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_depositarMouseClicked

    private void bt_pagarOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pagarOnlineMouseClicked
        if(!tf_pagarOnline.getText().equals("")){
            float pagarOnline = Float.parseFloat(tf_pagarOnline.getText());
            contaPoupanca.pagarOnline(pagarOnline);
            jl_saldo.setText(String.valueOf(contaPoupanca.getSaldo()));
            tf_pagarOnline.setText("");
            operacao = new Operacao("Operação pagar online concluída.", pagarOnline);
            historico.adicionarOperacao(operacao);
        } else JOptionPane.showMessageDialog(null, "Digite um valor.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bt_pagarOnlineMouseClicked

    private void bt_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_historicoActionPerformed
        PdfWriter writer;
        try {
            writer = new PdfWriter(this.destinoArquivo);
            PdfDocument pdf = new PdfDocument(writer);
            Document documento = new Document(pdf) {};
            PdfFont font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);

            documento.add(new Paragraph("Listagem de operações:").setFont(font));
            
            List list = new List()
                .setSymbolIndent(12)
                .setListSymbol("\u2022")
                .setFont(font);
            
            list.add(new ListItem(historico.toString()));
            
            documento.add(list);
            documento.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Path para arquivo não pode ser resolvido:");
            Logger.getLogger(TelaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Problemas de leitura/escrita em arquivo:");
            Logger.getLogger(TelaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bt_historicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_depositar;
    private javax.swing.JButton bt_historico;
    private javax.swing.JButton bt_pagarOnline;
    private javax.swing.JButton bt_sacar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jl_saldo;
    private javax.swing.JTextField tf_depositar;
    private javax.swing.JTextField tf_pagarOnline;
    private javax.swing.JTextField tf_sacar;
    // End of variables declaration//GEN-END:variables
}
