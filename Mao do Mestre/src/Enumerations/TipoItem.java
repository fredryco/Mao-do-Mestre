/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Enumerations;

/**
 *
 * @author Frederico
 */
public enum TipoItem {
    
    armadeumamao,
    
    armadeduasmaos,
    
    armadura,
    
    escudo,
    
    joia,
    
    utilitario;
    
    public static TipoItem getTipoItem(String tipoItem){
        switch(tipoItem.toLowerCase().charAt(0)){
            case 'o': return armadeumamao;
            case 't': return armadeduasmaos;
            case 'd': return armadura;
            case 'e': return escudo;
            case 'j': return joia;
            case 'u': return utilitario;
            default: return null;
        }
    
    
    
    
}

    /**
     *
     * @return
     */
    public static TipoItem getRandomTipoItem() {
          return values()[(int) (Math.random() * values().length)];
      }

    
    
}