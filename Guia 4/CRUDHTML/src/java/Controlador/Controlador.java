package Controlador;

import Modelo.Usuario;
import ModeloDAO1.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author gduba
 */
public class Controlador extends HttpServlet {

    String listar = "vistas/listar.jsp";
    String add = "vistas/add.jsp";
    String edit = "vistas/edit.jsp";
    Usuario p =new Usuario();
    UsuarioDAO dao =new UsuarioDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            String tipoID=request.getParameter("txtTipoId");
            String nroID=request.getParameter("txtNID");
            String nombres=request.getParameter("txtNombre");
            String correo=request.getParameter("txtCorreo");
            String celular=request.getParameter("txtCelular");
            p.setNroID(nroID);
            p.setTipoID(tipoID);
            p.setNombres(nombres);
            p.setCorreo(correo);
            p.setCelular(celular);
            dao.add(p);
            acceso=listar;
        }else if (action.equalsIgnoreCase("editar")) {
            String nroID=request.getParameter("nroID");
            acceso=edit;
        }else if (action.equalsIgnoreCase("Actualizar")) {
            
            String nroID=request.getParameter("txtNID");
            
            String tipoID=request.getParameter("txtTipoId");
            String nombres=request.getParameter("txtNombre");
            String correo=request.getParameter("txtCorreo");
            String celular=request.getParameter("txtCelular");
            
            p.setNroID(nroID);
            p.setTipoID(tipoID);
            p.setNombres(nombres);
            p.setCorreo(correo);
            p.setCelular(celular);
            dao.edit(p);
            acceso=listar;
            
        }else if (action.equalsIgnoreCase("eliminar")) {
            String nroID=request.getParameter("nroID");
            p.setNroID(nroID);
            dao.eliminar(nroID);
            acceso=listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
