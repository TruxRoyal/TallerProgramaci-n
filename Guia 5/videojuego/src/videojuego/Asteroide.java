package videojuego;


public class Asteroide extends Nave{
    
    private float lado1;
    private float lado2;
    
    public Asteroide()
    {
        super();
        this.lado1=0;
        this.lado2=0;
        
    }
    
    public Asteroide(Nave cor, float x, float y)
    {
        super(cor);
        this.lado1= x;
        this.lado2= y;
    }
    
    public Asteroide(Asteroide ne)
    {
        super(ne.getX(),ne.getY());
        this.lado1=ne.lado1;
        this.lado2=ne.lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }
    
    
}
