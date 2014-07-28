

package JDialogs;

import Classes.Personagem;
import Mensagens.JDialogMensagemDeErro;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Erik
 */
public class JDialogDistribuiXP extends javax.swing.JDialog {

    private ArrayList<JCheckBox> listaCheckBoxes;
    private ArrayList<JTextField> listaTextFields;
    private ArrayList<Personagem> listaPersonagens;
    private Integer XPADistribuir;
    private boolean distribuido;



    public ArrayList<JCheckBox> getListaCheckBoxes() {
        return listaCheckBoxes;
    }

    public ArrayList<JTextField> getListaTextFields() {
        return listaTextFields;
    }


    public JDialogDistribuiXP(ArrayList<Personagem> listaPersonagens,Integer XP) {
        super(new JFrame(), true);
        if(listaPersonagens.isEmpty()){
            JDialogMensagemDeErro.executar("A lista de Personagens está vazia!");
            return;
        }
        initComponents();
        this.listaPersonagens = listaPersonagens;
        distribuido = false;
        listaCheckBoxes = new ArrayList<JCheckBox>();
        listaTextFields = new ArrayList<JTextField>();
        buttonGroup.add(checkBoxXPRequerido);
        buttonGroup.add(checkBoxXPSugerido);
        buttonGroup.add(checkBoxXPEditado);
        checkBoxXPRequerido.setSelected(true);
        XPADistribuir = XP - XP % listaPersonagens.size();

        checkBoxXPRequerido.setText(checkBoxXPRequerido.getText() + " = " + XP.toString());
        checkBoxXPSugerido.setText(checkBoxXPSugerido.getText() + " = " + XPADistribuir.toString());

        JLabel novoLabel;
        JTextField novoTextField;

        Rectangle bounds = new Rectangle(checkBoxXPEditado.getBounds());
        bounds.y += 40;

        for(Personagem personagem:listaPersonagens){
            novoLabel = new JLabel(personagem.getNome());
            bounds.x = this.checkBoxXPEditado.getX();
            bounds.y += 30;
            bounds.width = 265;
            novoLabel.setBounds(bounds);

            this.add(novoLabel);

            bounds.x = 280;
            bounds.width = 60;
            novoTextField = new JTextField(new Integer(XPADistribuir / listaPersonagens.size()).toString());
            novoTextField.setBounds(bounds);
            novoTextField.setEditable(false);

            this.getListaTextFields().add(novoTextField);
            this.add(novoTextField);
        }

        this.setSize(this.getWidth(), bounds.y + 150);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        checkBoxXPRequerido = new javax.swing.JRadioButton();
        checkBoxXPSugerido = new javax.swing.JRadioButton();
        checkBoxXPEditado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        checkBoxXPRequerido.setText("XP Requerido");
        checkBoxXPRequerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxXPRequeridoActionPerformed(evt);
            }
        });

        checkBoxXPSugerido.setText("XP Sugerido");
        checkBoxXPSugerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxXPSugeridoActionPerformed(evt);
            }
        });

        checkBoxXPEditado.setText("XP Editado");
        checkBoxXPEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxXPEditadoActionPerformed(evt);
            }
        });

        jLabel1.setText("<");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText(">");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setText("Distribuir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxXPEditado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBoxXPSugerido)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(checkBoxXPRequerido)
                    .addComponent(jLabel7))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(checkBoxXPRequerido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxXPSugerido)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxXPEditado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel7))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshXPTextFields(){
        for(JTextField textField:listaTextFields)
            textField.setText(new Integer(XPADistribuir / listaPersonagens.size()).toString());
    }

    public boolean foiDistribuido() {
        return distribuido;
    }


    private void checkBoxXPEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxXPEditadoActionPerformed
        for(JTextField textField:listaTextFields)
            textField.setEditable(checkBoxXPEditado.isSelected());
    }//GEN-LAST:event_checkBoxXPEditadoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        checkBoxXPSugerido.setSelected(true);

        Integer XP = Integer.parseInt(checkBoxXPSugerido.getText().substring(14));
        XP -= listaPersonagens.size();
        checkBoxXPSugerido.setText("XP Sugerido = " + XP.toString());
        XPADistribuir = XP;
        refreshXPTextFields();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        checkBoxXPSugerido.setSelected(true);

        Integer XP = Integer.parseInt(checkBoxXPSugerido.getText().substring(14));
        XP += listaPersonagens.size();
        checkBoxXPSugerido.setText("XP Sugerido = " + XP.toString());
        XPADistribuir = XP;
        refreshXPTextFields();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void checkBoxXPSugeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxXPSugeridoActionPerformed
        XPADistribuir = Integer.parseInt(checkBoxXPSugerido.getText().substring(14));
        for(JTextField textField:listaTextFields)
            textField.setEditable(checkBoxXPEditado.isSelected());
        refreshXPTextFields();
    }//GEN-LAST:event_checkBoxXPSugeridoActionPerformed

    private void checkBoxXPRequeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxXPRequeridoActionPerformed
        XPADistribuir = Integer.parseInt(checkBoxXPRequerido.getText().substring(15));
        for(JTextField textField:listaTextFields)
            textField.setEditable(checkBoxXPEditado.isSelected());
        refreshXPTextFields();
    }//GEN-LAST:event_checkBoxXPRequeridoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = 0;
        try{
            for(i = 0; i < listaPersonagens.size(); i++){
                listaPersonagens.get(i).addXP(checkBoxXPEditado.isSelected()? Integer.parseInt(listaTextFields.get(i).getText()):XPADistribuir / listaPersonagens.size());
            }
            distribuido = true;
            this.dispose();
        }catch(Exception e){
            JDialogMensagemDeErro.executar("Valor inválido!");
            listaTextFields.get(i).selectAll();
            listaTextFields.get(i).requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton checkBoxXPEditado;
    private javax.swing.JRadioButton checkBoxXPRequerido;
    private javax.swing.JRadioButton checkBoxXPSugerido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
