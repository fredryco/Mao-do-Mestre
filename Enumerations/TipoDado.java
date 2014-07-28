
package Enumerations;

public enum TipoDado {

    d4,

    d6,

    d8,

    d10,

    d12,

    d20;

    public int getValor(){
        return ((int) Integer.parseInt(this.toString().substring(1)));
    }
}
