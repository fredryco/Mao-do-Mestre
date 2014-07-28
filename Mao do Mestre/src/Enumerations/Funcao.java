package Enumerations;


public enum Funcao {

    artilheiro,

    bruto,

    controlador,

    guerrilheiro,

    espreitador,

    soldado;

    public static Funcao getFuncao(String funcao){
        switch(funcao.toLowerCase().charAt(0)){
            case 'a': return artilheiro;
            case 'b': return bruto;
            case 'c': return controlador;
            case 'g': return guerrilheiro;
            case 'e': return espreitador;
            case 's': return soldado;
            default: return null;
        }
    }
}

