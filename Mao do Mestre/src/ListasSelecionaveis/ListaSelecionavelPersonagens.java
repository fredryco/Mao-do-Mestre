
package ListasSelecionaveis;

import Classes.Personagem;
import java.awt.Rectangle;
import java.util.ArrayList;

public class ListaSelecionavelPersonagens extends ListaSelecionavel{

    public ListaSelecionavelPersonagens(ArrayList<Personagem> listaPersonagens) {
        super(new Personagem(), listaPersonagens, true);
        this.setMenuItemName(1, "Ver ficha");
        this.setBorder("Personagens");
    }

    public ListaSelecionavelPersonagens(){
        this(new ArrayList<Personagem>());
    }

}
