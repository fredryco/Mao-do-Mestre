

package Mensagens;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class JDialogMensagemDeErro extends javax.swing.JDialog {

    /** Creates new form JDialogMensagemDeErro */

    private String mensagem;

    public JDialogMensagemDeErro(java.awt.Frame parent, boolean modal, String mensagem) {
        super(parent, modal);
        this.mensagem = mensagem;
        initComponents();
        this.setSize(getJLabelMensagemDeErroMensagem().getWidth() + 50, this.getHeight());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelMensagemDeErroMensagem = new javax.swing.JLabel();
        JButtonJDialogMensagemDeErroOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLabelMensagemDeErroMensagem.setText(mensagem);

        JButtonJDialogMensagemDeErroOK.setText("OK");
        JButtonJDialogMensagemDeErroOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonJDialogMensagemDeErroOKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JLabelMensagemDeErroMensagem)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JButtonJDialogMensagemDeErroOK, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelMensagemDeErroMensagem)
                .addGap(18, 18, 18)
                .addComponent(JButtonJDialogMensagemDeErroOK)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonJDialogMensagemDeErroOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonJDialogMensagemDeErroOKMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_JButtonJDialogMensagemDeErroOKMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    public static void executar(String mensagem){
        JDialogMensagemDeErro mensagemDeErro = new JDialogMensagemDeErro(new JFrame(),true,mensagem);
        mensagemDeErro.setVisible(true);
    }

    public JLabel getJLabelMensagemDeErroMensagem() {
        return JLabelMensagemDeErroMensagem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonJDialogMensagemDeErroOK;
    private javax.swing.JLabel JLabelMensagemDeErroMensagem;
    // End of variables declaration//GEN-END:variables

}
