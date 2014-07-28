
package Imagens;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ManipulaImagem extends JPanel{

    private Image imagem = new ImageIcon(getClass().getResource("/Imagens/Ficha.png")).getImage();
    

    public ManipulaImagem(){
        setOpaque(false);
        setLayout(new FlowLayout());
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imagem, 0, 0, this);
    }


}
