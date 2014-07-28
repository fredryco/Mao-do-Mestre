

package JDialogs;

import Classes.Batalha;
import Classes.Campanha;
import Classes.Personagem;
import ListasSelecionaveis.ListaSelecionavel;
import ListasSelecionaveis.ListaSelecionavelPersonagens;
import Mensagens.JDialogMensagemDeErro;
import java.util.ArrayList;
import javax.swing.JFrame;

public class JDialogCriaCampanha extends javax.swing.JDialog {

        private Campanha campanha;
        private boolean campanhaOK;

        private ArrayList<Personagem> personagens;
        private ListaSelecionavel listaPersonagens;
        private ArrayList<Batalha> batalhas;
        private ListaSelecionavel listaBatalhas;


    public JDialogCriaCampanha() {
        super(new JFrame(), true);
        initComponents();
        initListas();
        
        campanhaOK = false;
    }

    public void initListas(){

        personagens = new ArrayList<Personagem>();
        batalhas = new ArrayList<Batalha>();

        listaPersonagens = new ListaSelecionavelPersonagens(personagens);
        listaBatalhas = new ListaSelecionavel(new Batalha(), batalhas, true);

        listaBatalhas.setBorder("Batalhas");
        listaPersonagens.setBorder("Personagens");

        scrollPaneBatalhas.setViewportView(listaBatalhas.getListaSelecionavel());
        scrollPanePersonagens.setViewportView(listaPersonagens.getListaSelecionavel());


 //       this.remove(scrollPaneBatalhas);
 //       this.remove(scrollPanePersonagens);

//        this.add(listaPersonagens.getListaSelecionavel());
//        this.add(listaBatalhas.getListaSelecionavel());
 
    }

    public JDialogCriaCampanha(Campanha campanha){
        this();

        valorNome.setText(campanha.getNome());
        valorDescricao.setText(campanha.getDescricao());
        valorRecompensas.setText(campanha.getRecompensas());
        valorXPTotal.setText(campanha.getXPTotal().toString());
        personagens = campanha.getPersonagens();
        batalhas = campanha.getBatalhas();
        listaPersonagens.adicionarItens(campanha.getPersonagens());
        listaBatalhas.adicionarItens(campanha.getBatalhas());

    }

    public Campanha getCampanha(){
        return campanha;
    }

    public boolean isCampanhaOK() {
        return campanhaOK;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valorNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        valorDescricao = new javax.swing.JTextArea();
        JButtonSalvar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        scrollPaneBatalhas = new javax.swing.JScrollPane();
        baseListaBatalhas = new javax.swing.JList();
        scrollPanePersonagens = new javax.swing.JScrollPane();
        baseListaPersonagens = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        valorRecompensas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorXPTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Descrição");

        valorDescricao.setColumns(20);
        valorDescricao.setLineWrap(true);
        valorDescricao.setRows(5);
        jScrollPane1.setViewportView(valorDescricao);

        JButtonSalvar.setText("Salvar");
        JButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalvarActionPerformed(evt);
            }
        });

        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelarActionPerformed(evt);
            }
        });

        baseListaBatalhas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lista de Batalhas" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneBatalhas.setViewportView(baseListaBatalhas);

        baseListaPersonagens.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lista de Personagens" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPanePersonagens.setViewportView(baseListaPersonagens);

        valorRecompensas.setColumns(20);
        valorRecompensas.setLineWrap(true);
        valorRecompensas.setRows(5);
        jScrollPane2.setViewportView(valorRecompensas);

        jLabel3.setText("Recompensas");

        jLabel4.setText("XPTotal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorXPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(scrollPanePersonagens, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPaneBatalhas, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(JButtonCancelar)
                .addGap(18, 18, 18)
                .addComponent(JButtonSalvar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(valorXPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPanePersonagens)
                    .addComponent(scrollPaneBatalhas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonSalvar)
                    .addComponent(JButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalvarActionPerformed
        if(valorNome.getText().equals("")){
            JDialogMensagemDeErro.executar("A campanha deve ter um nome!");
        }
        else{
            try{
                campanha = new Campanha(valorNome.getText(), valorDescricao.getText(),valorRecompensas.getText(), personagens, batalhas, Integer.parseInt(valorXPTotal.getText()));
                campanhaOK = true;
                this.dispose();
            }catch(Exception e){
                JDialogMensagemDeErro.executar("O campo XP está preenchido incorretamente!");
                campanhaOK = false;
            }
        }
    }//GEN-LAST:event_JButtonSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        campanhaOK = false;
    }//GEN-LAST:event_formWindowClosed

    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed
    }//GEN-LAST:event_JButtonCancelarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonSalvar;
    private javax.swing.JList baseListaBatalhas;
    private javax.swing.JList baseListaPersonagens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane scrollPaneBatalhas;
    private javax.swing.JScrollPane scrollPanePersonagens;
    private javax.swing.JTextArea valorDescricao;
    private javax.swing.JTextField valorNome;
    private javax.swing.JTextArea valorRecompensas;
    private javax.swing.JTextField valorXPTotal;
    // End of variables declaration//GEN-END:variables

}

