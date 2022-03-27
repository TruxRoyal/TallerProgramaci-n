package ModeloDAO1;

import Config.Conexion;
import Interface.CRUD;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gduba
 */
public class UsuarioDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario p = new Usuario();

    @Override
    public List listar() {
        ArrayList<Usuario> list = new ArrayList<>();
        String sql = "select * from usuario";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario per = new Usuario();
                per.setNroID(rs.getString("nroID"));
                per.setTipoID(rs.getString("tipoID"));
                per.setNombres(rs.getString("nombres"));
                per.setCorreo(rs.getString("correo"));
                per.setCelular(rs.getString("celular"));
                list.add(per);
                
            }
        } catch (Exception e) {

        }
        return list;
    }

    @Override
    public Usuario list(String nroID) {
        String sql = "select * from usuario where nroID="+nroID;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                p.setNroID(rs.getString("nroID"));
                p.setTipoID(rs.getString("tipoID"));
                p.setNombres(rs.getString("nombres"));
                p.setCorreo(rs.getString("correo"));
                p.setCelular(rs.getString("celular"));
                
            }
        } catch (Exception e) {

        }
        return p;
    }

    @Override
    public boolean add(Usuario per) {
        String sql = "insert into usuario(tipoID,nroID,nombres,correo,celular) values('" + per.getTipoID() + "','" + per.getNroID() + "','" + per.getNombres() + "','" + per.getCorreo() + "','" + per.getCelular() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean edit(Usuario per) {
      String sql = "update usuario set tipoID ='" + per.getTipoID() + "',nombres= '" + per.getNombres() + "',correo='" + per.getCorreo() + "',celular='" + per.getCelular() + "'where nroID='"+per.getNroID()+"'";  
      System.out.println(sql);
      try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean eliminar(String nroID) {
        String sql= "delete from usuario where nroID="+nroID;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return false;
    }

}
