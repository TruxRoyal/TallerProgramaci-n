package videojuego;
import java.awt.Color;
import java.awt.Graphics;

public class GraficoProyectil extends Proyectil implements dibujar {

    Color color;

    public GraficoProyectil(Nave cor, float radio, Color colo) {
        super(cor, radio);
        this.color = colo;
    }

    @Override
    public void dubujar(Graphics d) {
        d.setColor(color);
        d.fillOval((int) (this.getX() - this.getRadio()), (int) (this.getY() - this.getRadio()), (int) (2 * this.getRadio()), (int) (2 * this.getRadio()));

    }

    void pintar(Color a) {
        this.color = a;
    }

}
