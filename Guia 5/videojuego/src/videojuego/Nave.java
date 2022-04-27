package videojuego;


public class Nave {
    
    private float x;
    private float y;
    
    public Nave()
    {
        this.x=0;
        this.y=0;
        
    }
    
    public Nave(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    
    public Nave(Nave ne)
    {
        this.x = ne.x;
        this.y = ne.y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public Nave Suma(Nave S)
    {
        float Sumx = this.x + S.getX();
        float Sumy = this.y + S.getY();
        
        Nave Cor = new Nave(Sumx,Sumy);
        
        return Cor;
    }
    
}
