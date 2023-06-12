/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packageimg;

import java.sql.*;
import javax.swing.JOptionPane;

public class atualizarCadastro extends javax.swing.JFrame {

    private String nomeAtual, enderecoAtual, telefoneAtual, emailAtual, cpfAtual, cepAtual, nascimentoAtual, cidadeAtual;
    private String novoNome;
    private String novoEndereco;
    private String novoTelefone;
    private String novoEmail;
    private String novoCEP;
    private String novoNascimento;
    private String novoCidade;
    private String cpfConsulta = "";
    
    
    public atualizarCadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        alteraNome = new javax.swing.JTextField();
        alteraEmail = new javax.swing.JTextField();
        alteraEndereço = new javax.swing.JTextField();
        alteraCidade = new javax.swing.JTextField();
        alteraCpf = new javax.swing.JFormattedTextField();
        alteraData = new javax.swing.JFormattedTextField();
        alteraTelefone = new javax.swing.JFormattedTextField();
        alteraCep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(alteraNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 320, -1));

        alteraEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteraEmailActionPerformed(evt);
            }
        });
        jPanel1.add(alteraEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 290, -1));

        alteraEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteraEndereçoActionPerformed(evt);
            }
        });
        jPanel1.add(alteraEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 250, -1));
        jPanel1.add(alteraCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 190, -1));

        try {
            alteraCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(alteraCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 250, -1));

        try {
            alteraData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(alteraData, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, -1));

        try {
            alteraTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(alteraTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 150, -1));

        try {
            alteraCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(alteraCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AtualizarCadastro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 830, 400));

        btAtualizar.setText("jButton1");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 180, 40));

        btConsultar.setText("jButton1");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 83, 130, 30));

        btVoltar.setText("jButton2");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 343, 50, 40));

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

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new telaMenu().show();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
               int status;
				
				
	try
	{
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera","root","");
               Statement stm = con.createStatement();
               ResultSet res = stm.executeQuery("SELECT * from associados");
					
                cpfConsulta = alteraCpf.getText();
                status = 0;
		while(res.next())
		{
		   cpfAtual = res.getString("cpf");
		   
                   if(cpfAtual.compareTo(cpfConsulta)==0)
		   {
                       nomeAtual=res.getString("nome");
			  enderecoAtual = res.getString("endereco");
			  telefoneAtual = res.getString("telefone");
			  emailAtual = res.getString("email");
                          cepAtual  = res.getString("cep");
                          nascimentoAtual = res.getString("nascimento");
                          cidadeAtual = res.getString("cidade");
			  status = 1;						  
		   }					   			   
		}
		if(status == 1)
		{
                    alteraNome.setText(nomeAtual);
			alteraEndereço.setText(enderecoAtual);
			alteraTelefone.setText(telefoneAtual);
			alteraEmail.setText(emailAtual);
                        alteraCep.setText(cepAtual);
                        alteraData.setText(nascimentoAtual);
                        alteraCidade.setText(cidadeAtual);
		}
		if(status == 0)
		{
			JOptionPane.showMessageDialog(null,"CPF: "+cpfConsulta+" nao encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
		}
	}
	catch(ClassNotFoundException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
                String classeDriver = "com.mysql.cj.jdbc.Driver";
	String stringconectarBanco = "jdbc:mysql://localhost:/acelera";
	String Usuario = "root";
	String Senha = "";
	Connection con;
	String sql;
        novoNome = alteraNome.getText();
	novoEndereco = alteraEndereço.getText();
	novoTelefone = alteraTelefone.getText();
	novoEmail = alteraEmail.getText();
        novoCEP = alteraCep.getText();
        novoNascimento = alteraData.getText();
        novoCidade = alteraCidade.getText();
	            
	con=null;
	sql = "SELECT * FROM associados";
        
        try
	{
	    Class.forName(classeDriver);
	    con = DriverManager.getConnection(stringconectarBanco, Usuario, Senha);
	    PreparedStatement stmt = con.prepareStatement(sql);
             
            int x=stmt.executeUpdate("UPDATE associados SET Nome='"+novoNome+"',Endereco='"+novoEndereco+"', Telefone='"+novoTelefone+"',"+
	         "Email='"+novoEmail+"', Cep='"+novoCEP+"', Nascimento='"+novoNascimento+"', Cidade='"+novoCidade+"' WHERE cpf='"+cpfConsulta+"'");
            JOptionPane.showMessageDialog(null,"Cadastro atualizado com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
            
         
        }
        catch(SQLException ex)
	{
	   JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.INFORMATION_MESSAGE);
	}
	catch(ClassNotFoundException ex)
	{
	   JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.INFORMATION_MESSAGE);
	}

    }//GEN-LAST:event_btAtualizarActionPerformed

    private void alteraEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteraEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alteraEmailActionPerformed

    private void alteraEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteraEndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alteraEndereçoActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
      atualizarCadastro.this.dispose(); 
    }//GEN-LAST:event_btFecharActionPerformed

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
            java.util.logging.Logger.getLogger(atualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atualizarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atualizarCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField alteraCep;
    private javax.swing.JTextField alteraCidade;
    private javax.swing.JFormattedTextField alteraCpf;
    private javax.swing.JFormattedTextField alteraData;
    private javax.swing.JTextField alteraEmail;
    private javax.swing.JTextField alteraEndereço;
    private javax.swing.JTextField alteraNome;
    private javax.swing.JFormattedTextField alteraTelefone;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
