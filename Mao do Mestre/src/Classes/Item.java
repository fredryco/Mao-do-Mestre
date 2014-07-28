/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;
import Enumerations.Raridade;
import Enumerations.TipoItem;
import JDialogs.JDialogSortearItem;
/**
 *
 * @author Frederico
 */
public class Item {
    
    private Raridade raridade;
    private TipoItem tipoItem;
    
    
    public Item (Raridade raridade, TipoItem tipoItem){
        this.raridade = raridade;
        this.tipoItem = tipoItem;
    }
    
    

    
    

    public Raridade getRaridade() {
        return raridade;
    }

    public void setRaridade(Raridade raridade) {
        this.raridade = raridade;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }
    
    
    
    
}
