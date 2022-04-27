package videojuego;

public class Proyectil extends Nave {

    private float radio;

    public Proyectil() {
        super();
        this.radio = 0;
    }

    public Proyectil(Nave cor, float r) {
        super(cor);
        this.radio = r;
    }

    public Proyectil(Proyectil po) {
        super(po);
        this.radio = po.radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Nave getCentro() {
        Nave no = new Nave(this.getX(), this.getY());
        return no;
    }
}
