/* package packageimg;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class listaSocios {
    
   private DefaultTableModel modelo;
   private JTable tabela;
   private String Nome,Endereco,Telefone,Email,CPF,CEP,Nascimento,Cidade;
    
   public listaSocios()
   {
	   modelo = new DefaultTableModel();
	   tabela = new JTable(modelo);
	   
	   modelo.addColumn("Nome");
	   modelo.addColumn("Endereço");
	   modelo.addColumn("Telefone");
	   modelo.addColumn("Email");
           modelo.addColumn("CPF");
           modelo.addColumn("CEP");
           modelo.addColumn("Nascimento");
           modelo.addColumn("Cidade");
	   
	   setTitle("Lista dos Associados");
	   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           
            try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ecelera","root","");
		   Statement stm = con.createStatement();
		   ResultSet res = stm.executeQuery("Select * from associados");
                   while(res.next())
		   {
			   Nome = res.getString("nome");
			   Endereco = res.getString("endereco");
			   Telefone = res.getString("telefone");
			   Email = res.getString("email");
                           CPF = res.getString("cpf");
                           CEP = res.getString("cep");
                           Nascimento = res.getString("nascimento");
                           Cidade = res.getString("cidade");
			   modelo.addRow(new Object[] {Nome,Endereco,Telefone,Email});
		   }
            }
            catch(ClassNotFoundException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	   }
	   catch(SQLException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	   }
            
           
            tabela.setPreferredScrollableViewportSize(new Dimension(700,400));
	   Container c = getContentPane();
	   c.setLayout(new FlowLayout());
	   JScrollPane scarollPane = new JScrollPane(tabela);
	   c.add(scarollPane);
	   setSize(800,500);
	   setVisible(true);
	   
	  
	   JButton btnConsultar = new JButton("Fechar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
			
		});
		btnConsultar.setBounds(36, 401, 124, 23);
		c.add(btnConsultar);
	   
} */
