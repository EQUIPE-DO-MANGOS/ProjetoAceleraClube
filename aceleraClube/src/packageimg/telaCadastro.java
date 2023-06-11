/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packageimg;

import Banco.associadosBanco;
import Dados.Associados;
import javax.swing.JOptionPane;

public class telaCadastro extends javax.swing.JFrame {

    private String Nome, Endereco, Telefone, Email, CPF, CEP, Nascimento, Cidade;
            
    public telaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        campoData = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoEndereço = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoCep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btProsseguir = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 310, -1));

        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });
        campoCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCPFKeyPressed(evt);
            }
        });
        jPanel1.add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 310, -1));

        campoData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDataKeyPressed(evt);
            }
        });
        jPanel1.add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, -1));

        campoTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTelefoneKeyPressed(evt);
            }
        });
        jPanel1.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 170, -1));
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 310, -1));
        jPanel1.add(campoEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 310, -1));
        jPanel1.add(campoCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 190, -1));

        campoCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCepKeyPressed(evt);
            }
        });
        jPanel1.add(campoCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastro.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 830, 400));

        btVoltar.setText("jButton2");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 40));

        btProsseguir.setBackground(new java.awt.Color(51, 255, 153));
        btProsseguir.setText("PROSSEGUIR");
        btProsseguir.setContentAreaFilled(false);
        btProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProsseguirActionPerformed(evt);
            }
        });
        jPanel1.add(btProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 320, 140, 30));

        btFechar.setText("jButton1");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProsseguirActionPerformed
        
        Associados associados = new Associados();
	associadosBanco associadosbanco = new associadosBanco();
				
	Nome = campoNome.getText();
	Endereco = campoEndereço.getText();
	Telefone = campoTelefone.getText();
	Email = campoEmail.getText();
        CPF = campoCPF.getText();
        CEP = campoCep.getText();
        Nascimento = campoData.getText();
        Cidade = campoCidade.getText();
        
        associados.setNome(Nome);
	associados.setEndereco(Endereco);
	associados.setTelefone(Telefone);
	associados.setEmail(Email);
        associados.setCPF(CPF);
        associados.setCEP(CEP);
        associados.setNascimento(Nascimento);
        associados.setCidade(Cidade);
        
        if(associadosbanco.inserirAssociado(associados) == true)
	{
		JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!!!", "Cadastro",JOptionPane.INFORMATION_MESSAGE);
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro",JOptionPane.ERROR_MESSAGE);
	}
        
    }//GEN-LAST:event_btProsseguirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new telaMenu().show();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
      telaCadastro.this.dispose(); 
    }//GEN-LAST:event_btFecharActionPerformed

    private void campoCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCPFKeyPressed
        String numFornecido = campoCPF.getText();

    int quantCaracteres = numFornecido.length();
    if (quantCaracteres > 10){
    numFornecido = numFornecido.substring (0, numFornecido.length() - 1);
    campoCPF.setText(numFornecido);

   }
    }//GEN-LAST:event_campoCPFKeyPressed

    private void campoDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDataKeyPressed
          String numFornecido = campoData.getText();

    int quantCaracteres = numFornecido.length();
    if (quantCaracteres > 7){
    numFornecido = numFornecido.substring (0, numFornecido.length() - 1);
    campoData.setText(numFornecido);

   }
    }//GEN-LAST:event_campoDataKeyPressed

    private void campoTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTelefoneKeyPressed
    String numFornecido = campoTelefone.getText();

    int quantCaracteres = numFornecido.length();
    if (quantCaracteres > 10){
    numFornecido = numFornecido.substring (0, numFornecido.length() - 1);
    campoTelefone.setText(numFornecido);

   }
    }//GEN-LAST:event_campoTelefoneKeyPressed

    private void campoCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCepKeyPressed
    String numFornecido = campoCep.getText();

    int quantCaracteres = numFornecido.length();
    if (quantCaracteres > 7){
    numFornecido = numFornecido.substring (0, numFornecido.length() - 1);
    campoCep.setText(numFornecido);

   }
    }//GEN-LAST:event_campoCepKeyPressed

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
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btProsseguir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereço;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
