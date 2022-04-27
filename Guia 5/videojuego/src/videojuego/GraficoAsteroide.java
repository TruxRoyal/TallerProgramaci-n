package videojuego;

import java.awt.*;

public class GraficoAsteroide extends Asteroide implements dibujar {

    Color color;

    public GraficoAsteroide(Nave cor, float x, float y, Color colo) {
        super(cor, x, y);
        this.color = colo;
    }

    @Override
    public void dubujar(Graphics d) {
        d.setColor(color);
        d.fillRect((int) this.getX(), (int) this.getY(), (int) this.getLado1(), (int) this.getLado2());
    }
    
    public void Ciclo()
    {
        float x = this.getY();
        this.setY(x += 10);
    }

    void pintar(Color a) {
        this.color = a;
    }

}
