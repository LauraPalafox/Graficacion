package figuras;

import java.awt.Graphics;
import java.util.ArrayList;

public class Circulos extends ArrayList<Circulo> implements Dibujable {

  @Override
  public void dibujar(Graphics g) {
      for (Circulo punto : this) {
          punto.dibujar(g);
      }
  }
}
