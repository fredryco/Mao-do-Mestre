package trabalho;

import Classes.*;
import java.util.ArrayList;
import javax.swing.JTextField;

public class Main {

    public static Principal principal;
    public static JFrameJogaDados jogaDados;
    public static JFrameCriaBatalha criaBatalha;
    public static JFrameBatalha batalha;
    public static ArrayList<Campanha> campanhas;

    public static void inicializar() {
        principal = new Principal();
        principal.setVisible(true);
        jogaDados = new JFrameJogaDados();
        jogaDados.setVisible(false);
        batalha = new JFrameBatalha();
        batalha.setVisible(false);
    }

    public static JFrameCriaBatalha getCriaBatalha() {
        return criaBatalha;
    }

    public static ArrayList<Campanha> getCampanhas() {
        return campanhas;
    }

    public static Principal getPrincipal() {
        return principal;
    }

    public static JFrameBatalha getBatalha() {
        return batalha;
    }

    public static JFrameJogaDados getJogaDados() {
        return jogaDados;
   }


    public static void main(String[] args) {
        inicializar();
    }
}
