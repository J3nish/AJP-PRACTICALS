/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Meet
 */
public class examInsert extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        String name,id,department;
        
        try(PrintWriter out = response.getWriter()){
            name=request.getParameter("name");
            id=request.getParameter("id");
            department=request.getParameter("department");
            
            Cookie c1,c2,c3;
            
            c1 = new Cookie("name",name);
            c2 = new Cookie("id",id);
            c3 = new Cookie("department",department);
            
            response.addCookie(c1);
            response.addCookie(c2);
            response.addCookie(c3);
            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet examInsert</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<form method=\"POST\" action=\"examResult\">");
            out.println("<h1>Student : " + name + "</h1> <br> <hr>");
            out.println("<center> <b> Enter marks for six subject [out of 100] </center>");
            out.println("Enter Marks for Subject 1 <input type=\"text\" name=\"subj1\" required><br><br>");
            out.println("Enter Marks for Subject 2 <input type=\"text\" name=\"subj2\" required><br><br>");
            out.println("Enter Marks for Subject 3 <input type=\"text\" name=\"subj3\" required><br><br>");
            out.println("Enter Marks for Subject 4 <input type=\"text\" name=\"subj4\" required><br><br>");
            out.println("Enter Marks for Subject 5 <input type=\"text\" name=\"subj5\" required><br><br>");
            out.println("Enter Marks for Subject 6 <input type=\"text\" name=\"subj6\" required><br><br>");
            out.println("<input type=\"submit\" value=\"generated result\">");
            
            out.println("</body>");
            out.println("</html>");
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
