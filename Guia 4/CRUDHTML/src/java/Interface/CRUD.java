package Interface;

import Modelo.Usuario;
import java.util.List;

/**
 * @author Duban Guzman
 */
public interface CRUD {

    public List listar();
    public Usuario list(String nroID);
    public boolean add(Usuario per);
    public boolean edit(Usuario per);
    public boolean eliminar(String nroID);
   
    
}
