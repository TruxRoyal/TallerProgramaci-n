package videojuego;
import static Ejecuciones.Main.aletorio;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class panelVG extends JPanel implements KeyListener{
    
    ArrayList p;
    ArrayList ast = new ArrayList();
    
    GraficoMiNave nave;
    
    Nave movimientoIzq = new Nave(-25,0);
    Nave movimientoDer = new Nave(25,0);
    Nave movimientoNulo = new Nave(0,0);
    int ContadorAste = 5;
    
    public panelVG(ArrayList vec)
    {
       this.p = vec;
       this.addKeyListener(this);
       setFocusable(true);
    }
    
    public void paint(Graphics g)
    {
        
        Dimension d = getSize();
        Image imagen = createImage(d.width,d.height);
        Graphics buff = imagen.getGraphics();
        
        dibujar dibu;
        for (int i = 0; i < p.size(); i++) {
            
            dibu = (dibujar)p.get(i);
            dibu.dubujar(buff);
        }
        
        g.drawImage(imagen, 0, 0, null);
    }
    
    public void update(Graphics g)
    {
        paint(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int tecla = e.getKeyCode();
        
        if (tecla == KeyEvent.VK_LEFT) {
            this.nave.mover(movimientoIzq);
        }
        
        if (tecla == KeyEvent.VK_RIGHT) {
            this.nave.mover(movimientoDer);
        }
        
        if (tecla==KeyEvent.VK_Q) {
            GraficoProyectil bala = nave.Bala();
            nave.balas.add(bala);
            p.add(bala);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
          int tecla = e.getKeyCode();
        
        if (tecla == KeyEvent.VK_LEFT) {
            this.nave.mover(movimientoNulo);
        }
        
        if (tecla == KeyEvent.VK_RIGHT) {
            this.nave.mover(movimientoNulo);
        }
        
        if (tecla==KeyEvent.VK_Q) {
           
        }
    }
    
    public void refNave(GraficoMiNave k)
    {
        this.nave = k;
    }
    
    public void refAst(GraficoAsteroide a, GraficoAsteroide b, 
            GraficoAsteroide c, GraficoAsteroide d, GraficoAsteroide e)
    {
      ast.add(a);
      ast.add(b);
      ast.add(c);
      ast.add(d);
      ast.add(e);
        }
    
    public void colision()
    {
        
        for(int i = 0; i < nave.balas.size(); i++) 
        {
            GraficoProyectil bala = (GraficoProyectil) nave.balas.get(i);
            for (int j = 0; j < ast.size(); j++) {
                GraficoAsteroide aste = (GraficoAsteroide) ast.get(j);
                
                Nave corbala = new Nave(bala.getX(),bala.getY());
                Nave Derecha = new Nave(aste.getX()+30,aste.getY());
                Nave Izquierda = new Nave(aste.getX()-15,aste.getY());
                Nave medio = new Nave(aste.getX(),aste.getY());
                
                if (corbala.getX() > Izquierda.getX() && corbala.getX() < Derecha.getX() 
                        && corbala.getY() < medio.getY()) 
                {
                    aste.pintar(Color.white);
                    bala.pintar(Color.white);
                    bala.setY(-100);
                    aste.setY(-100);
                    nave.balas.remove(bala);
                    ast.remove(aste);
                    ContadorAste--;
                }
            }
        }
    }
    
    public void iniciar()
    {
        while(true)
        {
            try{
                if (!nave.balas.isEmpty()) {
                    nave.Ciclo();
                }
                
                int i;
                for(i=0;i<ast.size();i++)
                {
                 GraficoAsteroide rec = (GraficoAsteroide) ast.get(i);
                 rec.Ciclo();
                 if (rec.getY() > 525) 
                 {
                    int rango = aletorio(800,50);
                    rec.setY(0);
                    rec.setX(rango);
                 }   
                }        
                if (ContadorAste < 5) {
                    int rango = aletorio(800,50);
                    Nave inicio = new Nave(rango,0);
                    GraficoAsteroide nuevo = new GraficoAsteroide(inicio,25,25,Color.red);
                    ast.add(nuevo);
                    p.add(nuevo);
                    nuevo.Ciclo();
                    ContadorAste++;
                }
                colision();
                
            Thread.sleep(50);
            }catch(InterruptedException err) {
                System.out.println(err);
            }
            repaint();
        }
    }

    private int aleatoria(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    } 

