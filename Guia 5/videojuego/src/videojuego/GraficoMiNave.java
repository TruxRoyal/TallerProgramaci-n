package videojuego;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class GraficoMiNave extends MiNave implements dibujar{

    Color color;
    
    public GraficoMiNave(Nave a, Nave b, Nave c, Color colo)
    {
        super(a,b,c);
        this.color=colo;
    }
    
    @Override
    public void dubujar(Graphics d) {
        
        d.setColor(color);
        int x[] = {(int) this.getX(), (int) cor1.getX(), (int) cor2.getX()};
        int y[] = {(int) this.getY(), (int) cor1.getY(), (int) cor2.getY()};
        Polygon p = new Polygon(x,y,3);
        d.fillPolygon(p);
    }
    
    public void pintar(Graphics d, Color colo) {
        
        d.setColor(colo);
        int x[] = {(int) this.getX(), (int) cor1.getX(), (int) cor2.getX()};
        int y[] = {(int) this.getY(), (int) cor1.getY(), (int) cor2.getY()};
        Polygon p = new Polygon(x,y,3);
        d.fillPolygon(p);
    }
    
    public GraficoProyectil Bala()
    {
        Nave salida = new Nave(this.getX(),this.getY());
        GraficoProyectil bala = new GraficoProyectil(salida,10,Color.red);
        return bala;
    }
    
    public void Ciclo()
    {
        for (int i = 0; i < this.balas.size(); i++) {
            GraficoProyectil y = (GraficoProyectil) this.balas.get(i);
            float x = y.getY();
            y.setY(x -= 5);
            
        }
    }
    
}
