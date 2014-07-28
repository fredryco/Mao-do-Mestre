

package trabalho;

import Classes.*;
import JDialogs.JDialogDistribuiXP;
import ListasSelecionaveis.ListaSelecionavel;
import ListasSelecionaveis.ListaSelecionavelPersonagens;
import Mensagens.JDialogMensagemDeErro;

public class JFrameCampanha extends javax.swing.JFrame {

    private Campanha campanha;

    public JFrameCampanha(Campanha campanha) {
        initComponents();
        this.campanha = campanha;

        valorNome.setText(campanha.getNome());
        valorDescricao.setText(campanha.getDescricao());

        ListaSelecionavelPersonagens listaPersonagens = new ListaSelecionavelPersonagens(campanha.getPersonagens());
        listaPersonagens.setBorder("Personagens");
        scrollPanePersonagens.setViewportView(listaPersonagens.getListaSelecionavel());

        ListaSelecionavel listaBatalhas = new ListaSelecionavel(new Batalha(),campanha.getBatalhas(),true);
        listaBatalhas.setBorder("Batalhas");
        scrollPaneBatalhas.setViewportView(listaBatalhas.getListaSelecionavel());

    }

    public Campanha getCampanha() {
        return campanha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valorNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        valorDescricao = new javax.swing.JTextArea();
        scrollPanePersonagens = new javax.swing.JScrollPane();
        baseListaPersonagens = new javax.swing.JList();
        JButtonJFrameCampanhaVoltar = new javax.swing.JButton();
        valorXPAcumulado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        scrollPaneBatalhas = new javax.swing.JScrollPane();
        baseListaBatalhas = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        valorRecompensas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valorXPTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        valorNome.setFont(new java.awt.Font("Pristina", 1, 18));

        valorDescricao.setColumns(20);
        valorDescricao.setLineWrap(true);
        valorDescricao.setRows(5);
        jScrollPane1.setViewportView(valorDescricao);

        scrollPanePersonagens.setViewportView(baseListaPersonagens);

        JButtonJFrameCampanhaVoltar.setText("Voltar");
        JButtonJFrameCampanhaVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonJFrameCampanhaVoltarMouseClicked(evt);
            }
        });

        valorXPAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorXPAcumuladoActionPerformed(evt);
            }
        });

        jLabel3.setText("XP Acumulado");

        jButton6.setText("Distribuir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        scrollPaneBatalhas.setViewportView(baseListaBatalhas);

        valorRecompensas.setColumns(20);
        valorRecompensas.setLineWrap(true);
        valorRecompensas.setRows(5);
        jScrollPane5.setViewportView(valorRecompensas);

        jLabel4.setText("Descrição");

        jLabel5.setText("Recompensas");

        jLabel6.setText("XP Total");

        valorXPTotal.setEditable(false);
        valorXPTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorXPTotalMouseClicked(evt);
            }
        });
        valorXPTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                valorXPTotalFocusLost(evt);
            }
        });
        valorXPTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorXPTotalKeyPressed(evt);
            }
        });

        jButton1.setText("Finalizar Campanha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPanePersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPaneBatalhas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(valorXPTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorXPAcumulado, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(100, 100, 100))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addComponent(valorNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(JButtonJFrameCampanhaVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valorNome)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanePersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneBatalhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(valorXPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(valorXPAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(JButtonJFrameCampanhaVoltar))
                .addGap(26, 26, 26))
        );

        valorNome.getAccessibleContext().setAccessibleName("Nome da Campanha");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorXPAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorXPAcumuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorXPAcumuladoActionPerformed

    private void JButtonJFrameCampanhaVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonJFrameCampanhaVoltarMouseClicked
    }//GEN-LAST:event_JButtonJFrameCampanhaVoltarMouseClicked

    private void valorXPTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorXPTotalMouseClicked
        if(evt.getClickCount() > 1){
            valorXPTotal.setEditable(true);
            valorXPTotal.selectAll();
            valorXPTotal.requestFocus();
        }
    }//GEN-LAST:event_valorXPTotalMouseClicked

    private void valorXPTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorXPTotalKeyPressed
        if(evt.getKeyChar() == evt.VK_ENTER){
            valorXPTotal.setEditable(false);
        }
    }//GEN-LAST:event_valorXPTotalKeyPressed

    private void valorXPTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorXPTotalFocusLost
        valorXPTotal.setEditable(false);
    }//GEN-LAST:event_valorXPTotalFocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            JDialogDistribuiXP distribuiXP = new JDialogDistribuiXP(campanha.getPersonagens(), Integer.parseInt(valorXPAcumulado.getText()));
            distribuiXP.setVisible(true);
            if(distribuiXP.foiDistribuido())
                valorXPAcumulado.setText("");
        }catch(Exception e){
            JDialogMensagemDeErro.executar("Número inválido");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonJFrameCampanhaVoltar;
    private javax.swing.JList baseListaBatalhas;
    private javax.swing.JList baseListaPersonagens;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane scrollPaneBatalhas;
    private javax.swing.JScrollPane scrollPanePersonagens;
    private javax.swing.JTextArea valorDescricao;
    private javax.swing.JLabel valorNome;
    private javax.swing.JTextArea valorRecompensas;
    private javax.swing.JTextField valorXPAcumulado;
    private javax.swing.JTextField valorXPTotal;
    // End of variables declaration//GEN-END:variables

}
