package videojuego;
import java.util.ArrayList;

public class MiNave extends Nave {

    public Nave cor1 = new Nave();//Izquierda
    public Nave cor2 = new Nave();//Derecha
    ArrayList balas = new ArrayList();

    public MiNave() {
        super();
        this.cor1.setX(0);
        this.cor1.setY(0);

        this.cor2.setX(0);
        this.cor2.setY(0);
    }

    public MiNave(Nave a, Nave b, Nave c) {
        super(a.getX(), a.getY());
        this.cor1.setX(b.getX());
        this.cor1.setY(b.getY());

        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
    }

    public MiNave(MiNave c) {
        super(c.getX(), c.getY());
        this.cor1.setX(c.getX());
        this.cor1.setY(c.getY());

        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
    }

    public void SetVertice(Nave na, int lado) {
        if (lado==1) {
            this.setX(na.getX());
            this.setY(na.getY());

        }
        if (lado==2) {
            this.cor1.setX(na.getX());
            this.cor1.setY(na.getY());
        }
        if (lado==3) {
            this.cor2.setX(na.getX());
            this.cor2.setY(na.getY());
        }
    }
    
    public void mover(Nave nacor)
    {
        SetVertice((this.Suma(nacor)),1);
        SetVertice((this.cor1.Suma(nacor)),2);
        SetVertice((this.cor2.Suma(nacor)),3);
    }
}
