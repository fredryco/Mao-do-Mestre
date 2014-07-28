package Classes;

import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A1FD7746-D373-14E3-B4A7-2019AE392600]
// </editor-fold> 
public class Atributos {


    private Integer forca;
    private Integer constituicao;
    private Integer destreza;
    private Integer inteligencia;
    private Integer sabedoria;
    private Integer carisma;

    public Atributos(Integer forca, Integer constituicao, Integer destreza, Integer inteligencia, Integer sabedoria, Integer carisma) {
        this.forca = forca;
        this.constituicao = constituicao;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
    }

    Atributos() {
        this(0,0,0,0,0,0);
    }

    public Integer getCarisma() {
        return carisma;
    }

    public void setCarisma(Integer carisma) {
        this.carisma = carisma;
    }

    public Integer getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(Integer constituicao) {
        this.constituicao = constituicao;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(Integer sabedoria) {
        this.sabedoria = sabedoria;
    }

    @Override
    public String toString(){
        return "Atributos: \n" + "\tForça: " + this.forca + "\n\tConstituição: " + this.constituicao;
    }

    public ArrayList<String> toArrayListString(){
        ArrayList<String> arrayListString = new ArrayList<String>();

        arrayListString.add("Atributos: ");
        arrayListString.add("   For: " + forca);
        arrayListString.add("   Con: " + constituicao);
        arrayListString.add("   Des: " + destreza);
        arrayListString.add("   Int: " + inteligencia);
        arrayListString.add("   Sab: " + sabedoria);
        arrayListString.add("   Car: " + carisma);

        return arrayListString;
    }

}

