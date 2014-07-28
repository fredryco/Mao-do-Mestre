
package ListasSelecionaveis;

import Classes.Personagem;
import Interfaces.Creatable;
import Mensagens.JDialogMensagemDeErro;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class ListaSelecionavel{

    private JList listaSelecionavel;
    private DefaultListModel modeloDaLista;
    private ArrayList<Creatable> listaDeElementos;

    private JPopupMenu menuPopUp;
    private JMenuItem menuItemPopUp;
    private ArrayList<String> menuOpcoesPopUp;

    private Creatable type;

    public ListaSelecionavel(Creatable type){
        listaSelecionavel = new JList();
        modeloDaLista = new DefaultListModel();
        listaDeElementos = new ArrayList<Creatable>();
        this.type = type;
    }

    public ListaSelecionavel(final Creatable type, ArrayList listaDeElementos, boolean addPopUpDefault){
        this(type);
        this.listaDeElementos = listaDeElementos;

        for(Object elemento:listaDeElementos){
            modeloDaLista.addElement(elemento);
        }
        listaSelecionavel.setModel(modeloDaLista);

        if(addPopUpDefault){
            menuPopUp = new JPopupMenu();
            menuOpcoesPopUp = new ArrayList<String>();
            menuOpcoesPopUp.add("Adicionar");
            menuOpcoesPopUp.add("Inspecionar");
            menuOpcoesPopUp.add("Editar");
            menuOpcoesPopUp.add("Remover");

            for(String elemento:menuOpcoesPopUp){
                menuItemPopUp = new JMenuItem(elemento);
                menuItemPopUp.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent evt){executar(menuLastClickedIndex(evt));}});
                menuPopUp.add(menuItemPopUp);
            }
            listaSelecionavel.setComponentPopupMenu(menuPopUp);
        }
        listaSelecionavel.setBorder(BorderFactory.createEtchedBorder());
        listaSelecionavel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if(evt.getClickCount() > 1)
                    try{
                        getSelectedElement().show();
                    }catch(Exception e){
                        Creatable novoItem = type.clone();
                        if(novoItem.create())
                            adicionarItem(novoItem);
                    }
            }
        });
    }

    public ListaSelecionavel(Creatable type, ArrayList listaDeElementos, ArrayList<String> opcoesMenu){
        this(type, listaDeElementos, false);

        menuOpcoesPopUp = opcoesMenu;
        for(String elemento:menuOpcoesPopUp){
            menuItemPopUp = new JMenuItem(elemento);
            menuItemPopUp.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent evt){executar(menuLastClickedIndex(evt));}});
            menuPopUp.add(menuItemPopUp);
        }

        listaSelecionavel.setComponentPopupMenu(menuPopUp);
        listaSelecionavel.setBorder(BorderFactory.createEtchedBorder());
        
    }


    public void executar(Integer inteiro){
        switch(inteiro){
            case 0:{
                Creatable novoItem = type.clone();
                if(novoItem.create())
                    adicionarItem(novoItem);
                break;
            }
            case 1:{
                if(listaSelecionavel.isSelectionEmpty())
                    JDialogMensagemDeErro.executar("Selecione algum item primeiro!");
                else{
                    int[] indicesAMostrar = listaSelecionavel.getSelectedIndices();
                    for(int i = 0; i < indicesAMostrar.length; i++){
                        listaDeElementos.get(indicesAMostrar[i]).show();
                    }
                }
                break;
            }
            case 2:{
                if(listaSelecionavel.isSelectionEmpty())
                    JDialogMensagemDeErro.executar("Selecione algum item primeiro!");
                else if(listaSelecionavel.getSelectedIndices().length > 1)
                    JDialogMensagemDeErro.executar("Só é possível editar um elemento por vez!");
                else
                    listaDeElementos.get(listaSelecionavel.getSelectedIndex()).edit();
                break;
            }
            case 3:{
                removerItensSelecionados();
                break;
            }
            default:{
                opcoesAdicionais(inteiro);
            }
        }
    }

    public void opcoesAdicionais(Integer inteiro){
    }

    public Integer menuLastClickedIndex(ActionEvent evt){
        Integer index = 0;
        String leitor,menuItemNome = "";
        leitor = evt.getSource().toString();
        for(int i = (leitor.length() - 2); leitor.charAt(i) != '='; i--){
            menuItemNome = leitor.charAt(i) + menuItemNome;
        }

        index = menuOpcoesPopUp.indexOf(menuItemNome);

        return index;
    }

    public void removerItensSelecionados(){
        int[] indicesARemover = listaSelecionavel.getSelectedIndices();
        for(int i = 0; i < indicesARemover.length; i++){
            listaDeElementos.remove(indicesARemover[i]);
            modeloDaLista.remove(indicesARemover[i]);
        }
        listaSelecionavel.setModel(modeloDaLista);
    }

    public void adicionarItem(Creatable objeto){
        listaDeElementos.add(objeto);
        modeloDaLista.addElement(objeto);
        listaSelecionavel.setModel(modeloDaLista);
    }

    public void adicionarItens(ArrayList listaObjetos){
        for(Object objeto:listaObjetos){
            listaDeElementos.add((Creatable) objeto);
            modeloDaLista.addElement(objeto);
            listaSelecionavel.setModel(modeloDaLista);
        }
    }

    public Creatable getSelectedElement(){
        return listaDeElementos.get(listaSelecionavel.getSelectedIndex());
    }

    public static void main(String args[]){
        ListaSelecionavel listaVisual = new ListaSelecionavel(new Personagem(),new ArrayList<Personagem>(),true);

        JFrame frameTeste = new JFrame();
        frameTeste.setBounds(1, 1, 100, 300);
        listaVisual.getListaSelecionavel().setBounds(5, 5, 50, 200);
        frameTeste.add(listaVisual.getListaSelecionavel());
        frameTeste.setVisible(true);
        listaVisual.getListaSelecionavel().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personagens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 14))); // NOI18N


        for(ActionListener action:listaVisual.getItemMenuPopUp(2).getActionListeners())
            listaVisual.getItemMenuPopUp(2).removeActionListener(action);
        listaVisual.getItemMenuPopUp(2).addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent evt){ System.out.println("MUAHUAHUAHA");}});

    }

    public JList getListaSelecionavel() {
        return listaSelecionavel;
    }

    public ArrayList getListaDeElementos(){
        return listaDeElementos;
    }

    public ArrayList<String> getMenuOpcoesPopUp() {
        return menuOpcoesPopUp;
    }

    public JPopupMenu getMenuPopUp() {
        return menuPopUp;
    }

    public JMenuItem getItemMenuPopUp(Integer inteiro){
        return (JMenuItem) this.getMenuPopUp().getComponent(inteiro);
    }

    public void setMenuItemName(final int i, String valor){
        JMenuItem item = this.getItemMenuPopUp(i);
        item.setText(valor);
        item.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent evt){executar(i);}});
    }

    public void setBorder(String nome){
        this.getListaSelecionavel().setBorder(javax.swing.BorderFactory.createTitledBorder(null, nome, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 14))); // NOI18N
    }
}

