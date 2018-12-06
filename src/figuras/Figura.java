package figuras;

import java.awt.BasicStroke;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

class Figura extends JPanel {
    int x;
    int y;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;       
        dibujarCuadrado(g2);
    }
    
    public void dibujarCuadrado(Graphics2D g2) {
        
        g2.setColor(Color.BLUE);
        g2.fillRect(110, 300, 650, 200);
    }
    
}
