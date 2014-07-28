package trabalho;

import Classes.*;
import JDialogs.JDialogDistribuiXP;
import JDialogs.JDialogCriaMonstro;

import ListasSelecionaveis.ListaSelecionavel;
import ListasSelecionaveis.ListaSelecionavelPersonagens;
import Mensagens.JDialogMensagemDeErro;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame {
    
    private static JFrameJogaDados jogaDados;
    ListaSelecionavelPersonagens listaPersonagens;
    ListaSelecionavel listaCampanhas;


    public Principal() {
        initComponents();

        listaCampanhas = new ListaSelecionavel(new Campanha(),new ArrayList<Campanha>(),true);
        listaCampanhas.setBorder("Campanhas");
        scrollCampanhas.setViewportView(listaCampanhas.getListaSelecionavel());
        listaPersonagens = new ListaSelecionavelPersonagens();
        scrollPersonagens.setViewportView(listaPersonagens.getListaSelecionavel());
        jogaDados = new JFrameJogaDados();


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPersonagens = new javax.swing.JScrollPane();
        JListPrincipalPersonagens = new javax.swing.JList();
        scrollCampanhas = new javax.swing.JScrollPane();
        JListPrincipalCampanhas = new javax.swing.JList();
        valorXPAcumulado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonDistribuir = new javax.swing.JButton();
        ButtonTeste = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JListPrincipalPersonagens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personagens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 14))); // NOI18N
        JListPrincipalPersonagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListPrincipalPersonagensMouseClicked(evt);
            }
        });
        scrollPersonagens.setViewportView(JListPrincipalPersonagens);

        JListPrincipalCampanhas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campanhas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 14))); // NOI18N
        scrollCampanhas.setViewportView(JListPrincipalCampanhas);

        jLabel1.setText("XP Acumulado");

        buttonDistribuir.setText("Distribuir");
        buttonDistribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDistribuirActionPerformed(evt);
            }
        });

        ButtonTeste.setText("Teste");
        ButtonTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTesteActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nova mesa");
        jMenu1.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Salvar mesa");
        jMenu1.add(jMenuItem5);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Carregar mesa");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("Fechar mesa");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Sair");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Utilitários");

        jMenuItem6.setText("Rolador de dados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Batalha avulsa");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Monstro");

        jMenuItem8.setText("Adicionar Monstro");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Pesquisar Monstro");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollCampanhas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(valorXPAcumulado)
                            .addComponent(jLabel1)
                            .addComponent(buttonDistribuir)))
                    .addComponent(ButtonTeste, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCampanhas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorXPAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDistribuir)
                .addGap(57, 57, 57)
                .addComponent(ButtonTeste)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDistribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDistribuirActionPerformed
        try{
            JDialogDistribuiXP distribuiXP = new JDialogDistribuiXP(listaPersonagens.getListaDeElementos(), Integer.parseInt(valorXPAcumulado.getText()));
            distribuiXP.setVisible(true);
            if(distribuiXP.foiDistribuido())
                valorXPAcumulado.setText("");
        }catch(Exception e){
            JDialogMensagemDeErro.executar("Número inválido");
        }
    }//GEN-LAST:event_buttonDistribuirActionPerformed

    private void ButtonTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTesteActionPerformed
    }//GEN-LAST:event_ButtonTesteActionPerformed

    private void JListPrincipalPersonagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListPrincipalPersonagensMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JListPrincipalPersonagensMouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
            try{
            JDialogCriaMonstro criaMontro = new JDialogCriaMonstro();
            criaMontro.setVisible(true);
            
        }catch(Exception e){
            JDialogMensagemDeErro.executar("Algum item foi preenchido de forma errada");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         try{
            jogaDados.setVisible(true);
            
        }catch(Exception e){
            JDialogMensagemDeErro.executar("Operação inesperada");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTeste;
    private javax.swing.JList JListPrincipalCampanhas;
    private javax.swing.JList JListPrincipalPersonagens;
    private javax.swing.JButton buttonDistribuir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JScrollPane scrollCampanhas;
    private javax.swing.JScrollPane scrollPersonagens;
    private javax.swing.JTextField valorXPAcumulado;
    // End of variables declaration//GEN-END:variables
}
