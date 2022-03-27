package Modelo;

/**
 * @author Duban Guzman
 */
public class Usuario {

    String tipoID;
    String nroID;
    String nombres;
    String correo;
    String celular;

    public Usuario() {
    }

    public Usuario(String tipoID, String nroID, String nombres, String correo, String celular) {
        this.tipoID = tipoID;
        this.nroID = nroID;
        this.nombres = nombres;
        this.correo = correo;
        this.celular = celular;
    }

    
    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public String getNroID() {
        return nroID;
    }

    public void setNroID(String nroID) {
        this.nroID = nroID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
