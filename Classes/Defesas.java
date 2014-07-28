package Classes;


public class Defesas {

    private Integer CA;
    private Integer fortitude;
    private Integer reflexo;
    private Integer vontade;

    public Defesas(Integer CA, Integer fortitude, Integer reflexos, Integer vontade) {
        this.CA = CA;
        this.fortitude = fortitude;
        this.reflexo = reflexos;
        this.vontade = vontade;
    }

    Defesas(){
        this(0,0,0,0);
    }

    public Integer getCA() {
        return CA;
    }

    public void setCA(Integer CA) {
        this.CA = CA;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public void setFortitude(Integer fortitude) {
        this.fortitude = fortitude;
    }

    public Integer getReflexo() {
        return reflexo;
    }

    public void setReflexo(Integer reflexos) {
        this.reflexo = reflexos;
    }

    public Integer getVontade() {
        return vontade;
    }

    public void setVontade(Integer vontade) {
        this.vontade = vontade;
    }
    
}

