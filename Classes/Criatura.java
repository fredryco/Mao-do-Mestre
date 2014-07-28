package Classes;

import Interfaces.Creatable;

public abstract class Criatura{


    private String nome;
    private Atributos atributos;
    private Defesas defesas;
    private Integer XP;
    private Integer HP;
    private Integer iniciativa;
    private Integer level;
    private Integer deslocamento;

    public Criatura(String nome, Atributos atributos, Defesas defesas, Integer XP, Integer HP, Integer iniciativa, Integer level, Integer deslocamento) {
        this.nome = nome;
        this.atributos = atributos;
        this.defesas = defesas;
        this.XP = XP;
        this.HP = HP;
        this.iniciativa = iniciativa;
        this.level = level;
        this.deslocamento = deslocamento;
    }

    public Criatura(String nome){
        this.nome = nome;
    }

    public Criatura(){
        atributos = new Atributos();
        defesas = new Defesas();
    }

    public void setAll(String nome, Atributos atributos, Defesas defesas, Integer XP, Integer HP, Integer iniciativa, Integer level, Integer deslocamento){
        this.nome = nome;
        this.atributos = atributos;
        this.defesas = defesas;
        this.XP = XP;
        this.HP = HP;
        this.iniciativa = iniciativa;
        this.level = level;
        this.deslocamento = deslocamento;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getXP() {
        return XP;
    }

    public Integer getDeslocamento() {
        return deslocamento;
    }

    public Integer getIniciativa() {
        return iniciativa;
    }

    public Integer getLevel() {
        return level;
    }

    public String getNome() {
        return nome;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public Defesas getDefesas() {
        return defesas;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public void setXP(Integer XP) {
        this.XP = XP;
    }

    public void addXP(Integer XP){
        this.XP += XP;
    }

    public void addHP(Integer HP){
        this.HP += HP;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public void setDeslocamento(Integer deslocamento) {
        this.deslocamento = deslocamento;
    }

    public void setIniciativa(Integer iniciativa) {
        this.iniciativa = iniciativa;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setdefesas(Defesas defesas) {
        this.defesas = defesas;
    }

    @Override
    public String toString(){
        return nome;
    }

}

