package figuras;

import java.awt.Graphics;
import java.util.ArrayList;

public class Triangulos  extends ArrayList<Triangulo> implements Dibujable{
    
     @Override
  public void dibujar(Graphics g) {
      for (Triangulo triangulo : this) {
          triangulo.dibujar(g);
      }
  }
    
}
