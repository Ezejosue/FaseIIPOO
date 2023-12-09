/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import beans.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelosDAO.EnlistarUsuariosDao;

/**
 *
 * @author GUASI
 */
@WebServlet(name = "MostrarUsuariosServlet", urlPatterns = {"/MostrarUsuariosServlet"})
public class MostrarUsuariosServlet extends HttpServlet {

    modelosDAO.EnlistarUsuariosDao EnlistarUsuarios = new modelosDAO.EnlistarUsuariosDao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Usuario> MostrarUsuarios = new ArrayList<>();
        MostrarUsuarios = EnlistarUsuarios.obtenerUsuarios();
        HttpSession misesion = request.getSession();
        misesion.setAttribute("MostrarUsuarios", MostrarUsuarios);

        //RequestDispatcher dispatcher = request.getRequestDispatcher("/views/enlistarUsurios.jsp");
        //dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
