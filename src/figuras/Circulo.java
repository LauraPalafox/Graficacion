package figuras;

import java.awt.*;

public class Circulo extends Point implements Dibujable {

    private int radio;
    private Color color;

    public Circulo(int x, int y, int radio, Color color) {
        super(x, y);
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
        this(0, 0, 0, Color.BLACK);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
        g.setColor(Color.BLACK);
        g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
