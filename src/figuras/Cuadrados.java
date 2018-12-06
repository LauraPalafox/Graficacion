package figuras;
import java.awt.Graphics;
import java.util.ArrayList;

public class Cuadrados extends ArrayList<Cuadrado> implements Dibujable {

  @Override
  public void dibujar(Graphics g) {
      for (Cuadrado cuadrado : this) {
          cuadrado.dibujar(g);
      }
  }
}
