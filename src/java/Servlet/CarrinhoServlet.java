/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import com.bean.TabelaCarrinhoBean;
import com.util.AdicionarItensCarrinho;
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

/**
 *
 * @author marco.junior
 */
@WebServlet(name = "CarrinhoServlet", urlPatterns = {"/CarrinhoServlet"})
public class CarrinhoServlet extends HttpServlet {

    ArrayList listaCarrinho = new ArrayList();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         if(request.getParameter("action").equals("Incluir")){
                String produto = request.getParameter("produto");
                String valor = request.getParameter("valor");
		String img = request.getParameter("imagem");
                		
                HttpSession session = request.getSession(true);                                
                listaCarrinho.add("&"+produto+"&"+valor+"&"+img);
                                
                int tamanhoLista = listaCarrinho.size();
                session.setAttribute("lista", listaCarrinho);  
                session.setAttribute("tamanhoLista", tamanhoLista);
                request.getRequestDispatcher("index.jsp").forward(request,response);
         }
         
         if(request.getParameter("action").equals("carrinho"))
         {
             String user = request.getParameter("user");
             
             request.setAttribute("usuario", user);
             
             request.getRequestDispatcher("CarrinhoCompra.jsp").forward(request, response);   
         }
        
                   if(request.getParameter("action").equals("deslogar"))
          {
              try{
              String user = null;
              listaCarrinho.clear();
              HttpSession session = request.getSession(false);            
              session.setAttribute("usuario", user);
              request.getRequestDispatcher("index.jsp").forward(request, response);
              }catch(Exception ex)
              {
                  
              }
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
