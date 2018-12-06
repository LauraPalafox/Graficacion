package figuras;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;

public class Controlador extends MouseAdapter implements ActionListener, MouseWheelListener {

    public Circulos circulos;
    private Circulo seleccionado;

    public Cuadrados cuadrados;
    public Cuadrado seleccionadoCua;

    public Triangulos triangulos;
    public Triangulo seleccionadoTria;

    public PanelFiguras panel;
    private boolean bandera;

    public int figura = 0;

    public Controlador(Triangulos triangulos, Cuadrados cuadrados, Circulos circulos, PanelFiguras panel) {
        this.triangulos = triangulos;
        this.cuadrados = cuadrados;
        this.circulos = circulos;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton origen = (JButton) e.getSource();
        switch (origen.getName()) {
            case "cuadrado":
                System.out.println("evento Cuadrado");
                figura = 1;
                break;
            case "circulo":
                System.out.println("evento circulo");
                figura = 2;
                break;
            case "triangulo":
                System.out.println("evento triangulo");
                figura = 3;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("Evento raton");
        int x = e.getX();
        int y = e.getY();
        System.out.println(x + " , " + y);
        int rojo = (int) (Math.random() * 256);
        int verde = (int) (Math.random() * 256);
        int azul = (int) (Math.random() * 256);

        if (figura == 1) {
            Cuadrado cuadrado = new Cuadrado(x, y, 50, new Color(rojo, verde, azul));
            cuadrados.add(cuadrado);
        }

        if (figura == 2) {
            Circulo punto = new Circulo(x, y, 25, new Color(rojo, verde, azul));
            circulos.add(punto);
        }

        if (figura == 3) {
            Triangulo triangulo = new Triangulo(x, y, 50, new Color(rojo, verde, azul));
            triangulos.add(triangulo);
        }
        panel.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Evento pressed");
        if (figura == 1) {
            for (Cuadrado p : cuadrados) {
                double d = p.distance(e.getX(), e.getY());
                if (d <= p.getLado()) {
                    bandera = true;
                    seleccionadoCua = p;
                    break;
                }
            }
        }
        if (figura == 2) {
            for (Circulo p : circulos) {
                double d = p.distance(e.getX(), e.getY());
                if (d <= p.getRadio()) {
                    bandera = true;
                    seleccionado = p;
                    break;
                }
            }
        }
        if (figura == 3) {
            for (Triangulo p : triangulos) {
                double d = p.distance(e.getX(), e.getY());
                if (d <= p.getLado() / 2) {
                    bandera = true;
                    seleccionadoTria = p;
                    break;
                }
            }
        }
        System.out.println(seleccionadoTria);
    }
    
    public void mouseWheelMoved(MouseWheelEvent mwe){
        System.out.println("Evento Rueda");
        int sentido = (int)mwe.getPreciseWheelRotation();
        System.out.println(sentido);
        
        if (figura == 1) {
             if(sentido==-1){
           seleccionadoCua.setLado(seleccionadoCua.getLado()-2);
             }else{
                  seleccionadoCua.setLado(seleccionadoCua.getLado()+2);
             }
             }
        
         if (figura == 2) {
             if(sentido==-1){
           seleccionado.setRadio(seleccionado.getRadio()-2);
             }else{
                 seleccionado.setRadio(seleccionado.getRadio()+2);
             }
        }
         
         if (figura == 3) {
             if(sentido==-1){
           seleccionadoTria.setLado(seleccionadoTria.x-2);
             }else{
                 seleccionadoTria.setLado(seleccionadoTria.x+2);
             }
        }
        panel.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        bandera = false;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (figura == 1) {
            if (bandera) {
                seleccionadoCua.x = e.getX();
                seleccionadoCua.y = e.getY();
                panel.repaint();
            }
        }
        if (figura == 2) {
            if (bandera) {
                seleccionado.x = e.getX();
                seleccionado.y = e.getY();
                panel.repaint();
            }
        }
        if (figura == 3) {
            if (bandera) {
                seleccionadoTria.x = e.getX();
                seleccionadoTria.y = e.getY();
                panel.repaint();
            }
        }

    }
}
