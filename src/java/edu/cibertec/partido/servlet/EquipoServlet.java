/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.partido.servlet;

import edu.cibertec.partido.dao.bean.EquipoBean;
import edu.cibertec.partido.service.PartidoService;
import edu.cibertec.partido.service.impl.PartidoServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JavaWeb-LM
 */
public class EquipoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion.equals("consultar")) {
            //1. Llamar al service
            PartidoService partidoService = new PartidoServiceImpl();

            //2. Recibir la lista de Productos
            List<EquipoBean> lista = partidoService.listarPartido();
            List<EquipoBean> listaimpar = partidoService.listarPartidoImpar();
            List<EquipoBean> listapares = partidoService.listarPartidoPar();
            //3. Enviar al JSP
            request.setAttribute("listaPartPar", listapares);
            request.setAttribute("listaPartImpar", listaimpar);
            request.setAttribute("listaPart", lista);

            //4. Ejecutar JSP
            RequestDispatcher dispa = getServletContext().
                    getRequestDispatcher("/partido/mantPartido.jsp");
            dispa.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
