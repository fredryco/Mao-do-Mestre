package Classes;

import Enumerations.Funcao;
import Enumerations.Tamanho;
import Interfaces.Creatable;
import JDialogs.JDialogCriaMonstro;


public class Monstro extends Criatura  implements Creatable{

    private Funcao funcao;
    private Tamanho tamanho;

    public Monstro (String nome, Integer HP, Integer XP, Integer iniciativa, Integer level, Integer deslocamento,Atributos atributos, Defesas defesas,Funcao funcao, Tamanho tamanho) {
        super(nome,atributos,defesas,HP,XP,iniciativa,level,deslocamento);
        this.funcao = funcao;
        this.tamanho = tamanho;
    }

    public Monstro(Monstro monstro) {
        this(monstro.getNome(), monstro.getHP(), monstro.getXP(), monstro.getIniciativa(), monstro.getLevel(), monstro.getDeslocamento(),monstro.getAtributos(), monstro.getDefesas(),monstro.getFuncao(), monstro.getTamanho());
    }

    public void setAll(Monstro monstro){
        super.setAll(monstro.getNome(),monstro.getAtributos(),monstro.getDefesas(),monstro.getHP(),monstro.getXP(), monstro.getIniciativa(),monstro.getLevel(),monstro.getDeslocamento());
        funcao = monstro.getFuncao();
        tamanho = monstro.getTamanho();
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public boolean create(){
        JDialogCriaMonstro criaMonstro = new JDialogCriaMonstro();
        criaMonstro.setVisible(true);
        if(criaMonstro.isMonstroOK())
            this.setAll(criaMonstro.getMonstro());
        return criaMonstro.isMonstroOK();
    }

    public void edit(){
        JDialogCriaMonstro criaMonstro = new JDialogCriaMonstro(this);
        criaMonstro.setVisible(true);
        if(criaMonstro.isMonstroOK()){
            this.setAll(criaMonstro.getMonstro());
        }
    }

    public void show(){
    }

    @Override
    public Creatable clone(){
        return new Monstro(this);
    }

}

