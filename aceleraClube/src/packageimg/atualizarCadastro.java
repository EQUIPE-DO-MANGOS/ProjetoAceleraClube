/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packageimg;

/**
 *
 * @author cruze
 */
public class atualizarCadastro extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastro
     */
    public atualizarCadastro() {
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
        atualizarTelefone = new javax.swing.JTextField();
        atualizarEmail = new javax.swing.JTextField();
        btProsseguir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setText("Nome completo");
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 285, -1));

        campoCPF.setText("CPF");
        jPanel1.add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 285, -1));

        campoData.setText("Data de nascimento");
        jPanel1.add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 285, -1));

        atualizarTelefone.setText("Telefone");
        jPanel1.add(atualizarTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 285, -1));

        atualizarEmail.setText("E-mail");
        jPanel1.add(atualizarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 285, -1));

        btProsseguir.setBackground(new java.awt.Color(51, 255, 153));
        btProsseguir.setText("ATUALIZAR");
        jPanel1.add(btProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

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
    private javax.swing.JTextField atualizarEmail;
    private javax.swing.JTextField atualizarTelefone;
    private javax.swing.JButton btProsseguir;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
