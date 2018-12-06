package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cuadrado extends Point implements Dibujable {

    private Color color;
    private int lado;

    public Cuadrado(int x, int y, int lado, Color color) {
        super(x, y);
        this.lado = lado;
        this.color = color;
    }

    public Cuadrado() {
        this(0, 0, 0, Color.BLACK);
    }

    @Override
    public void dibujar(Graphics g) {

        
        g.setColor(color);
        g.fillRect(x-25, y-25, getLado(), getLado());
        g.setColor(Color.BLACK);
        g.drawRect(x-25, y-25, getLado(), getLado());
        
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

}
