package Enumerations;


public enum Tamanho {

    miudo,

    pequeno,

    medio,

    grande,

    enorme,

    imenso;

    public static Tamanho getTamanho(String tamanho){
        switch(tamanho.toLowerCase().charAt(0)){
            case 'm': return tamanho.toLowerCase().charAt(1) == 'i'? miudo:medio;
            case 'p': return pequeno;
            case 'g': return grande;
            case 'e': return enorme;
            case 'i': return imenso;
            default: return null;
        }
    }
}

