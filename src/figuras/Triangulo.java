package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Triangulo extends Point implements Dibujable {

    private Color color;
    private int lado;

    public Triangulo(int x, int y, int lado, Color color) {
        super(x, y);
        this.lado = lado;
        this.color = color;
    }

    public Triangulo() {
        this(0, 0, 0, Color.BLACK);
    }

    @Override
    public void dibujar(Graphics g) {
        int posX[] = {x-25, x + lado, x};
        int posY[] = {y-25, y, y + lado};
        g.setColor(getColor());
        g.fillPolygon(posX, posY, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(posX, posY, 3);
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
