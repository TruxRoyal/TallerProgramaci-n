package videojuego;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;

public class ventana extends JFrame implements WindowListener{
    
    public ventana(String title)
    {
        
        super(title);
        setSize(500,500);
        addWindowListener(this);
        setBackground(Color.white);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
