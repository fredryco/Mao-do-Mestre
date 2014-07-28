

package trabalho;

import Classes.Personagem;
import Imagens.ManipulaImagem;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;


public class JFramePersonagem extends javax.swing.JFrame {

    private ArrayList<JLabel> listaInformacoes;
    private ArrayList<String> listaInformacoesString;
    private ManipulaImagem teste;

    private JLabel nome;

    public JFramePersonagem(Personagem personagem) {

        initComponents();
        teste = new ManipulaImagem();
        teste.setLayout(null);

        nome = new JLabel(personagem.getNome());
        nome.setBounds(90, 20, 190, 15);
        teste.add(nome);

        nome = new JLabel(personagem.getHP().toString());
        nome.setBounds(48 - (personagem.getHP() > 9? 5:0) - (personagem.getHP() > 99? 4:0), 162, 30, 15);
        nome.setFont(new Font("Comic Sans",1,17));
        teste.add(nome);

        nome = new JLabel(personagem.getDeslocamento().toString());
        nome.setBounds(48, 226, 30, 15);
        nome.setFont(new Font("Comic Sans",1,17));
        teste.add(nome);

        nome = new JLabel("+" + personagem.getIniciativa().toString());
        nome.setBounds(43, 292, 30, 15);
        nome.setFont(new Font("Comic Sans",1,17));
        teste.add(nome);

        nome = new JLabel(personagem.getAtributos().getForca().toString());
        nome.setBounds(110 - (personagem.getAtributos().getForca() > 9? 4:0), 138, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getAtributos().getConstituicao().toString());
        nome.setBounds(110 - (personagem.getAtributos().getConstituicao() > 9? 4:0), 168, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getAtributos().getDestreza().toString());
        nome.setBounds(110 - (personagem.getAtributos().getDestreza() > 9? 4:0), 203, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getAtributos().getInteligencia().toString());
        nome.setBounds(110 - (personagem.getAtributos().getInteligencia() > 9? 4:0), 233, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getAtributos().getSabedoria().toString());
        nome.setBounds(110 - (personagem.getAtributos().getSabedoria() > 9? 4:0), 268, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getAtributos().getCarisma().toString());
        nome.setBounds(110 - (personagem.getAtributos().getCarisma() > 9? 4:0), 298, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getDefesas().getCA().toString());
        nome.setBounds(243 - (personagem.getDefesas().getCA() > 9? 4:0), 153, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getDefesas().getFortitude().toString());
        nome.setBounds(243 - (personagem.getDefesas().getFortitude() > 9? 4:0), 203, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getDefesas().getReflexo().toString());
        nome.setBounds(243 - (personagem.getDefesas().getReflexo() > 9? 4:0), 253, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        nome = new JLabel(personagem.getDefesas().getVontade().toString());
        nome.setBounds(243 - (personagem.getDefesas().getVontade() > 9? 4:0), 303, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        Integer x = (personagem.getAtributos().getForca()>10? ((personagem.getAtributos().getForca() - 10)/2):((personagem.getAtributos().getForca() - 10)/2));
        nome = new JLabel((personagem.getAtributos().getForca() > 11? "+":"") + x.toString());
        nome.setBounds(180 - (personagem.getAtributos().getForca() > 11? 4:0) - (personagem.getAtributos().getForca() < 9? 3:0), 138, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        x = (personagem.getAtributos().getConstituicao()>10? ((personagem.getAtributos().getConstituicao() - 10)/2):((personagem.getAtributos().getConstituicao() - 10)/2));
        nome = new JLabel((personagem.getAtributos().getConstituicao() > 11? "+":"") + x.toString());
        nome.setBounds(180 - (personagem.getAtributos().getConstituicao() > 11? 4:0) - (personagem.getAtributos().getConstituicao() < 9? 3:0), 168, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        x = (personagem.getAtributos().getDestreza()>10? ((personagem.getAtributos().getDestreza() - 10)/2):((personagem.getAtributos().getDestreza() - 10)/2));
        nome = new JLabel((personagem.getAtributos().getDestreza() > 11? "+":"") + x.toString());
        nome.setBounds(180 - (personagem.getAtributos().getDestreza() > 11? 4:0) - (personagem.getAtributos().getDestreza() < 9? 3:0), 203, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        x = (personagem.getAtributos().getInteligencia()>10? ((personagem.getAtributos().getInteligencia() - 10)/2):((personagem.getAtributos().getInteligencia() - 10)/2));
        nome = new JLabel((personagem.getAtributos().getInteligencia() > 11? "+":"") + x.toString());
        nome.setBounds(180 - (personagem.getAtributos().getInteligencia() > 11? 4:0) - (personagem.getAtributos().getInteligencia() < 9? 3:0), 233, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        x = (personagem.getAtributos().getSabedoria()>10? ((personagem.getAtributos().getSabedoria() - 10)/2):((personagem.getAtributos().getSabedoria() - 10)/2));
        nome = new JLabel((personagem.getAtributos().getSabedoria() > 11? "+":"") + x.toString());
        nome.setBounds(180 - (personagem.getAtributos().getSabedoria() > 11? 4:0) - (personagem.getAtributos().getSabedoria() < 9? 3:0), 268, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        x = (personagem.getAtributos().getCarisma()>10? ((personagem.getAtributos().getCarisma() - 10)/2):((personagem.getAtributos().getCarisma() - 10)/2));
        nome = new JLabel((personagem.getAtributos().getCarisma() > 11? "+":"") + x.toString());
        nome.setBounds(180 - (personagem.getAtributos().getCarisma() > 11? 4:0) - (personagem.getAtributos().getCarisma() < 9? 3:0), 298, 30, 15);
        nome.setFont(new Font("Comic Sans",1,13));
        teste.add(nome);

        this.setContentPane(teste);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
