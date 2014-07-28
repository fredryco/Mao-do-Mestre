package Classes;

import Interfaces.Creatable;
import JDialogs.JDialogCriaPersonagem;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import trabalho.Main;


public class Batalha implements Creatable{

  
    private ArrayList<Monstro> monstros;
    private ArrayList<Personagem> personagens;
    private ArrayList<Criatura> ordem;
    private int XPTotal;
    private String recompensa;
    private Estado estado;
    
    public Batalha () {
        this(new ArrayList<Monstro>(), new ArrayList<Personagem>(), new ArrayList<Criatura>(), 0, "", Estado.em_iminencia);
    }

    public Batalha(ArrayList<Monstro> monstros, ArrayList<Personagem> personagens, ArrayList<Criatura> ordem, int XPTotal, String recompensa, Estado estado) {
        this.monstros = monstros;
        this.personagens = personagens;
        this.ordem = ordem;
        this.XPTotal = XPTotal;
        this.recompensa = recompensa;
        this.estado = estado;
    }

    private Batalha(Batalha batalha) {
        this(batalha.getMonstros(), batalha.getPersonagens(), batalha.getOrdem(), batalha.getXPTotal(), batalha.getRecompensa(), batalha.getEstado());
    }


    public int getXPTotal () {
        return XPTotal;
    }

    public void setXPTotal (int val) {
        this.XPTotal = val;
    }

    public Estado getEstado () {
        return estado;
    }

    public void setEstado (Estado val) {
        this.estado = val;
    }

    public ArrayList<Monstro> getMonstros () {
        return monstros;
    }

    public void setMonstros (ArrayList<Monstro> val) {
        this.monstros = val;
    }

    public ArrayList<Criatura> getOrdem () {
        return ordem;
    }

    public void setOrdem (ArrayList<Criatura> val) {
        this.ordem = val;
    }

    public ArrayList<Personagem> getPersonagens () {
        return personagens;
    }

    public void setPersonagens (ArrayList<Personagem> val) {
        this.personagens = val;
    }

    public String getRecompensa () {
        return recompensa;
    }

    public void setRecompensa (String val) {
        this.recompensa = val;
    }

    public boolean create(){
        return true;
    }

    public void show(){
    }

    public void edit(){
    }

    public Creatable clone(){
        return new Batalha(this);
    }


}

