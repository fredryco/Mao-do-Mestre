package Classes;

import Interfaces.Creatable;
import JDialogs.JDialogCriaPersonagem;
import java.util.ArrayList;
import trabalho.JFramePersonagem;
import trabalho.Main;


public class Personagem extends Criatura implements Creatable{
    private String nomeDoJogador;
    private String classe;
    private String raca;
    private Pericias pericias;

    public Personagem(String nome, String nomeDoJogador, String classe, String raca, Atributos atributos, Defesas defesas, Integer XP, Integer HP, Integer iniciativa, Integer level, Integer deslocamento, Pericias pericias) {
        super(nome, atributos, defesas, XP, HP, iniciativa, level, deslocamento);
        this.nomeDoJogador = nomeDoJogador;
        this.classe = classe;
        this.raca = raca;
        this.pericias = pericias;
    }

    public Personagem(Personagem personagem){
        super.setAll(personagem.getNome(), personagem.getAtributos(), personagem.getDefesas(), personagem.getXP(), personagem.getHP(), personagem.getIniciativa(), personagem.getLevel(), personagem.getDeslocamento());
        this.nomeDoJogador = personagem.getNomeDoJogador();
        this.classe = personagem.getClasse();
        this.raca = personagem.getRaca();
        this.pericias = personagem.getPericias();
    }

    public Personagem(){
        super();
        nomeDoJogador = "";
        classe = "";
        raca = "";
        pericias = new Pericias();
    }

    public Personagem(String nome){
        this();
        super.setNome(nome);
    }

    public void setAll(String nome, String nomeDoJogador, String classe, String raca, Atributos atributos, Defesas defesas, Integer XP, Integer HP, Integer iniciativa, Integer level, Integer deslocamento, Pericias pericias){
        super.setAll(nome, atributos, defesas, XP, HP, iniciativa, level, deslocamento);
        this.nomeDoJogador = nomeDoJogador;
        this.classe = classe;
        this.raca = raca;
        this.pericias = pericias;
    }

    public void setAll(Personagem personagem){
        super.setAll(personagem.getNome(), personagem.getAtributos(), personagem.getDefesas(), personagem.getXP(), personagem.getHP(), personagem.getIniciativa(), personagem.getLevel(), personagem.getDeslocamento());
        this.nomeDoJogador = personagem.getNomeDoJogador();
        this.classe = personagem.getClasse();
        this.raca = personagem.getRaca();
        this.pericias = personagem.getPericias();
    }

    public Pericias getPericias() {
        return pericias;
    }

    public void setPericias(Pericias pericias) {
        this.pericias = pericias;
    }

    public boolean create() {
        JDialogCriaPersonagem criaPersonagem = new JDialogCriaPersonagem();
        criaPersonagem.setVisible(true);
        if(criaPersonagem.isPersonagemOK())
            this.setAll(criaPersonagem.getPersonagem());
        return criaPersonagem.isPersonagemOK();
    }

    public void show(){
        JFramePersonagem framePersonagem = new JFramePersonagem(this);
        framePersonagem.setVisible(true);
    }

    public void edit(){
        JDialogCriaPersonagem criaPersonagem = new JDialogCriaPersonagem(this);
        criaPersonagem.setVisible(true);
        if(criaPersonagem.isPersonagemOK()){
            this.setAll(criaPersonagem.getPersonagem());
        }
    }

    @Override
    public Creatable clone(){
        return new Personagem(this);
    }

    public String getClasse() {
        return classe;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public String getRaca() {
        return raca;
    }

}

