package Ejecuciones;
import java.awt.*;
import videojuego.*;
import java.util.ArrayList;

public class Main {
    
    public static int aletorio(int Max, int Min)
    {
        return (int) (Math.random() * (Max-Min));
    }
    
    public static void main(String[] args) {
        
        ventana ven = new ventana("Juegos de las naves espaciales");
        ArrayList Arreglo_Objetos = new ArrayList();
        Nave cor1 = new Nave(250,250);//asteroides
        Nave cor2 = new Nave(500,300);//proyectil
        
        //MiNave
        Nave cor3 = new Nave(475,475);
        Nave cor4 = new Nave(400,575);
        Nave cor5 = new Nave(550,575);
        
        //GraficoAsteroide rec = new GraficoAsteroide(cor1,50,50,Color.red);
        //GraficoProyectil cir = new GraficoProyectil(cor2,20,Color.black);
        GraficoMiNave nave = new GraficoMiNave(cor3,cor4,cor5,Color.black);
        //Arreglo_Objetos.add(rec);
        //Arreglo_Objetos.add(cir);
        
        int rango =aletorio(800,50);
        Nave salida = new Nave(rango,0);
        GraficoAsteroide Aste1 = new GraficoAsteroide(salida,25,25,Color.blue);
        int rango2 =aletorio(800,50);
        Nave salida2 = new Nave(rango2,0);
        GraficoAsteroide Aste2 = new GraficoAsteroide(salida2,25,25,Color.blue);
        int rango3 =aletorio(800,50);
        Nave salida3 = new Nave(rango3,0);
        GraficoAsteroide Aste3 = new GraficoAsteroide(salida3,25,25,Color.blue);
        int rango4 =aletorio(800,50);
        Nave salida4 = new Nave(rango4,0);
        GraficoAsteroide Aste4 = new GraficoAsteroide(salida4,25,25,Color.blue);
        int rango5 =aletorio(800,50);
        Nave salida5 = new Nave(rango5,0);
        GraficoAsteroide Aste5 = new GraficoAsteroide(salida5,25,25,Color.blue);
        Arreglo_Objetos.add(Aste1);
        Arreglo_Objetos.add(Aste2);
        Arreglo_Objetos.add(Aste3);
        Arreglo_Objetos.add(Aste4);
        Arreglo_Objetos.add(Aste5);
        
        Arreglo_Objetos.add(nave);
        
        panelVG panelJuego = new panelVG(Arreglo_Objetos);
        panelJuego.refNave(nave);
        panelJuego.refAst(Aste1, Aste2, Aste3, Aste4, Aste5);
        
        ven.add(panelJuego);
        ven.setSize(800,600);
        ven.setVisible(true);
        panelJuego.iniciar();
        
    }
    
}
