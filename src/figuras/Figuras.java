package figuras;

import javax.swing.JFrame;

public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulos puntos = new Circulos();
        Cuadrados cuadrados = new Cuadrados();
        Triangulos triangulos = new Triangulos();
        PanelFiguras panel = new PanelFiguras(triangulos,cuadrados,puntos);
        Controlador controlador = new Controlador(triangulos,cuadrados,puntos, panel);
        panel.addEventos(controlador);
        JFrame f = new JFrame("");
        f.setSize(1200, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.setVisible(true);
    }
    
}
