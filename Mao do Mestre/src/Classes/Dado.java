package Classes;

import Enumerations.TipoDado;
import java.util.ArrayList;

public class Dado {

    private int multiplicador;
    private TipoDado tipo;

    public Dado(int multiplicador, TipoDado tipo) {
        this.multiplicador = multiplicador;
        this.tipo = tipo;
    }

    public static Integer rolar(String tipo, int multiplicador){
        int somaTotal = 0;

        while(multiplicador-- > 0)
            somaTotal += (int) (Math.random() * Integer.parseInt(tipo.substring(1)) + 1 );

        return somaTotal;
    }

    public static Integer rolar(TipoDado tipo, int multiplicador){
        return rolar(tipo.toString(),multiplicador);
    }

    public static Integer rolar(ArrayList<Dado> lista){
        int somaTotal = 0;

        for(Dado dado:lista){
            somaTotal += Dado.rolar(dado.getTipo(), dado.getMultiplicador());
        }

        return somaTotal;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public TipoDado getTipo() {
        return tipo;
    }
}
