package Enumerations;

/**
 *
 * @author Frederico
 */
public enum Raridade {
    
    normal,
    
    magico,
    
    raro;
 
    
     public static Raridade getRaridade(String raridade){
        switch(raridade.toLowerCase().charAt(0)){
            case 'n': return normal;
            case 'm': return magico;
            case 'r': return raro;
            default: return null;
        }
    }
    
    
    
    
}
