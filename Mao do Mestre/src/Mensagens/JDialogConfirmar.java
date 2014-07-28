package Mensagens;

import javax.swing.JLabel;


public class JDialogConfirmar extends javax.swing.JDialog {

    private boolean valor;
    private String mensagem;
    /** Creates new form JDialogConfirmar */
    public JDialogConfirmar(java.awt.Frame parent, boolean modal,String mensagem) {
        super(parent, modal);
        this.mensagem = mensagem;
        initComponents();
        valor = false;
    }

    public static boolean executar(java.awt.Frame parent, String mensagem){
        JDialogConfirmar confirmar = new JDialogConfirmar(parent,true,mensagem);
        confirmar.getJLabelJDialogConfirmarMensagem().setText(mensagem);
        confirmar.setVisible(true);
        return confirmar.getValor();
    }

    public boolean getValor() {
        return valor;
    }

    public JLabel getJLabelJDialogConfirmarMensagem() {
        return JLabelJDialogConfirmarMensagem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelJDialogConfirmarMensagem = new javax.swing.JLabel();
        JButtonConfirmarNao = new javax.swing.JButton();
        JButtonConfirmarSim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLabelJDialogConfirmarMensagem.setText("Tem certeza?");

        JButtonConfirmarNao.setText("Nao");
        JButtonConfirmarNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonConfirmarNaoMouseClicked(evt);
            }
        });

        JButtonConfirmarSim.setText("Sim");
        JButtonConfirmarSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonConfirmarSimMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonConfirmarNao, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonConfirmarSim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLabelJDialogConfirmarMensagem))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelJDialogConfirmarMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonConfirmarNao)
                    .addComponent(JButtonConfirmarSim))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonConfirmarNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonConfirmarNaoMouseClicked
        valor = false;
        this.setVisible(false);
    }//GEN-LAST:event_JButtonConfirmarNaoMouseClicked

    private void JButtonConfirmarSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonConfirmarSimMouseClicked
        valor = true;
        this.setVisible(false);
    }//GEN-LAST:event_JButtonConfirmarSimMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setSize((JLabelJDialogConfirmarMensagem.getWidth()<190? 220:this.JLabelJDialogConfirmarMensagem.getWidth() + 50), this.getHeight());
    }//GEN-LAST:event_formWindowOpened

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonConfirmarNao;
    private javax.swing.JButton JButtonConfirmarSim;
    private javax.swing.JLabel JLabelJDialogConfirmarMensagem;
    // End of variables declaration//GEN-END:variables

}
