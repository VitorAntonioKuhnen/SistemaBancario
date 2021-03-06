/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancario.tela;

import br.com.bancaria.classe.ContaCorrente;
import br.com.bancario.negocio.ContaNegocio;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor.kuhnen
 */
public class TelaCaixaEletronico extends javax.swing.JFrame {

    private ContaCorrente contaCorrente;
    private ContaNegocio contaNegocio;

    /**
     * Creates new form TelaCorrentista
     */
    public TelaCaixaEletronico() {
        initComponents();
    }
//    Sobrecarga quando possui o mesmo metodo mas modifica o parametro
    public TelaCaixaEletronico(ContaCorrente conta){
        initComponents();
        contaCorrente = conta;
        logado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        principal = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        logado = new javax.swing.JPanel();
        btSaldo = new javax.swing.JButton();
        btSaque = new javax.swing.JButton();
        btDeposito = new javax.swing.JButton();
        btExtrato = new javax.swing.JButton();
        lbCorrentista = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        varSenha = new javax.swing.JPasswordField();
        btLogar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa Eletr??nico");

        lb_titulo.setBackground(new java.awt.Color(0, 0, 0));
        lb_titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Caixa Eletr??nico");

        logado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btSaldo.setBackground(new java.awt.Color(102, 102, 102));
        btSaldo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btSaldo.setText("Saldo");
        btSaldo.setPreferredSize(new java.awt.Dimension(82, 27));
        btSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoActionPerformed(evt);
            }
        });

        btSaque.setBackground(new java.awt.Color(102, 102, 102));
        btSaque.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btSaque.setText("Saque");
        btSaque.setPreferredSize(new java.awt.Dimension(82, 27));
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        btDeposito.setBackground(new java.awt.Color(102, 102, 102));
        btDeposito.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btDeposito.setText("Dep??sito");
        btDeposito.setPreferredSize(new java.awt.Dimension(82, 27));
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        btExtrato.setBackground(new java.awt.Color(102, 102, 102));
        btExtrato.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btExtrato.setText("Extrato");
        btExtrato.setPreferredSize(new java.awt.Dimension(82, 27));
        btExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtratoActionPerformed(evt);
            }
        });

        lbCorrentista.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        javax.swing.GroupLayout logadoLayout = new javax.swing.GroupLayout(logado);
        logado.setLayout(logadoLayout);
        logadoLayout.setHorizontalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logadoLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCorrentista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(logadoLayout.createSequentialGroup()
                        .addComponent(btSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(logadoLayout.createSequentialGroup()
                                .addComponent(btSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        logadoLayout.setVerticalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logadoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbCorrentista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(btExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        lb_nome.setBackground(new java.awt.Color(255, 255, 255));
        lb_nome.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_nome.setForeground(new java.awt.Color(0, 0, 0));
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Senha:");

        varSenha.setBackground(new java.awt.Color(255, 255, 255));
        varSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSenhaActionPerformed(evt);
            }
        });

        btLogar.setBackground(new java.awt.Color(102, 102, 102));
        btLogar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btLogar.setText("Entrar");
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogar)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLogar))
                .addGap(18, 18, 18)
                .addComponent(logado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        String senha = String.valueOf(varSenha.getPassword());
        if(senha.equals(contaCorrente.getSenha())){
            logado.setVisible(true);
            lbCorrentista.setText(contaCorrente.getNomeCliente());
        }else{
            JOptionPane.showMessageDialog(null, "Digite uma senha correta!");
        }
    }//GEN-LAST:event_btLogarActionPerformed

    private void varSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varSenhaActionPerformed

    private void btSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoActionPerformed
        JOptionPane.showMessageDialog(null, "Saldo: " + contaCorrente.getSaldo());
    }//GEN-LAST:event_btSaldoActionPerformed

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para o saque!"));
        ContaNegocio cn = new ContaNegocio();
        cn.sacar(contaCorrente, valorSaque);
    }//GEN-LAST:event_btSaqueActionPerformed

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do dep??sito!"));
        ContaNegocio cn = new ContaNegocio();
        cn.depositar(contaCorrente, valorDeposito);
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtratoActionPerformed
        JOptionPane.showMessageDialog(null, "Saldo: " + contaCorrente.getSaldo() + "\n" + contaCorrente.getExtrato());
    }//GEN-LAST:event_btExtratoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCaixaEletronico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btExtrato;
    private javax.swing.JButton btLogar;
    private javax.swing.JButton btSaldo;
    private javax.swing.JButton btSaque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCorrentista;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel logado;
    private javax.swing.JPanel principal;
    private javax.swing.JPasswordField varSenha;
    // End of variables declaration//GEN-END:variables
}
