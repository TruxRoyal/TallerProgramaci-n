package CallCenter;

/**
 *
 * @author gduba
 */
public class Usuario {
	private String nombre;
	private int[] Opciones;


    public Usuario(String nombre, int[] Servicio) {
        this.nombre = nombre;
        this.Opciones = Servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getServicioPlan() {
        return Opciones;
    }

    public void setServicioPlan(int[] Servicio) {
        this.Opciones = Opciones;
    }
        
}


