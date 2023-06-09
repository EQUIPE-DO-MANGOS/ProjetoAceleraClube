/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packageimg;

/**
 *
 * @author cruze
 */
public class telaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastro
     */
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
        jLabel1 = new javax.swing.JLabel();
        btProsseguir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setText("Nome completo");
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 310, -1));

        campoCPF.setText("CPF");
        jPanel1.add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 310, -1));

        campoData.setText("Data de nascimento");
        jPanel1.add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 310, -1));

        campoTelefone.setText("Telefone");
        jPanel1.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 310, -1));

        campoEmail.setText("E-mail");
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastrarCliente.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 840, 400));

        btProsseguir.setBackground(new java.awt.Color(51, 255, 153));
        btProsseguir.setText("PROSSEGUIR");
        btProsseguir.setContentAreaFilled(false);
        jPanel1.add(btProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 320, 120, 30));

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
    private javax.swing.JButton btProsseguir;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
