
package Classes;

import Interfaces.Creatable;
import JDialogs.JDialogCriaCampanha;
import java.util.ArrayList;
import trabalho.JFrameCampanha;

public class Campanha implements Creatable{

    private String nome;
    private String descricao;
    private String recompensas;
    private ArrayList<Personagem> personagens;
    private ArrayList<Batalha> batalhas;
    private Integer XPTotal;
    private Integer XPAcumulado;

    public Campanha(){
        this("","","",new ArrayList<Personagem>(),new ArrayList<Batalha>(),0);
    }

    public Campanha(String nome, String descricao, String recompensas, ArrayList<Personagem> personagens, ArrayList<Batalha> batalhas, Integer XPTotal) {
        this.nome = nome;
        this.descricao = descricao;
        this.recompensas = recompensas;
        this.personagens = personagens;
        this.batalhas = batalhas;
        this.XPTotal = XPTotal;
        this.XPAcumulado = 0;
    }


    public Campanha(Campanha campanha) {
        nome = campanha.getNome();
        descricao = campanha.getDescricao();
        recompensas = campanha.getRecompensas();
        personagens = campanha.getPersonagens();
        batalhas = campanha.getBatalhas();
        XPTotal = campanha.getXPTotal();
        XPAcumulado = campanha.getXPAcumulado();
    }

    public Campanha(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        personagens = new ArrayList<Personagem>();
        batalhas = new ArrayList<Batalha>();
    }

    public void setAll(Campanha campanha){
        nome = campanha.getNome();
        descricao = campanha.getDescricao();
        recompensas = campanha.getRecompensas();
        personagens = campanha.getPersonagens();
        batalhas = campanha.getBatalhas();
        XPTotal = campanha.getXPTotal();
        XPAcumulado = campanha.getXPAcumulado();
    }

    public boolean equals(Campanha other){
        return (this.nome.equals(other.getNome()));
    }

    public Integer getXPAcumulado() {
        return XPAcumulado;
    }

    public String getRecompensas() {
        return recompensas;
    }

    public void setXPAcumulado(Integer XPAcumulado) {
        this.XPAcumulado = XPAcumulado;
    }

    public void adicionarXPAcumulado(Integer valor){
        XPAcumulado += valor;
    }

    public Integer getXPTotal() {
        return XPTotal;
    }

    public void setXPTotal(Integer XPTotal) {
        this.XPTotal = XPTotal;
    }

    public ArrayList<Batalha> getBatalhas() {
        return batalhas;
    }

    public void setBatalhas(ArrayList<Batalha> batalhas) {
        this.batalhas = batalhas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }

    public boolean create() {
        JDialogCriaCampanha criaCampanha = new JDialogCriaCampanha();
        criaCampanha.setVisible(true);
        if(criaCampanha.isCampanhaOK()){
            this.setAll(criaCampanha.getCampanha());
        }
        return criaCampanha.isCampanhaOK();
    }

    public void show() {
        JFrameCampanha campanha = new JFrameCampanha(this);
        campanha.setVisible(true);
    }

    public void edit() {
        JDialogCriaCampanha criaCampanha = new JDialogCriaCampanha(this);
        criaCampanha.setVisible(true);
        if(criaCampanha.isCampanhaOK()){
            this.setAll(criaCampanha.getCampanha());
        }
    }

    @Override
    public String toString(){
        return nome;
    }

    @Override
    public Creatable clone() {
        return new Campanha(this);
    }

}
