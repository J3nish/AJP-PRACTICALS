package com.mycompany.mavenproject3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class examResult extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            // 1. Get student info from cookies
            String name = "", id = "", department = "";
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie c : cookies) {
                    if (c.getName().equals("name")) {
                        name = c.getValue();
                    } else if (c.getName().equals("id")) {
                        id = c.getValue();
                    } else if (c.getName().equals("department")) {
                        department = c.getValue();
                    }
                }
            }

            // 2. Get marks from request parameters
            int subj1 = Integer.parseInt(request.getParameter("subj1"));
            int subj2 = Integer.parseInt(request.getParameter("subj2"));
            int subj3 = Integer.parseInt(request.getParameter("subj3"));
            int subj4 = Integer.parseInt(request.getParameter("subj4"));
            int subj5 = Integer.parseInt(request.getParameter("subj5"));
            int subj6 = Integer.parseInt(request.getParameter("subj6"));

            // 3. Calculate total and percentage
            int totalMarks = subj1 + subj2 + subj3 + subj4 + subj5 + subj6;
            double percentage = totalMarks / 6.0;

            // 4. Determine grade
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "Fail";
            }

            // 5. Output HTML Result
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Student Result</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; display: flex; justify-content: center; align-items: center; height: 100vh; }");
            out.println(".result-container { background-color: white; padding: 40px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.2); }");
            out.println("h2 { text-align: center; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='result-container'>");
            out.println("<h2>Student Exam Result</h2>");
            out.println("<p><strong>Name:</strong> " + name + "</p>");
            out.println("<p><strong>ID:</strong> " + id + "</p>");
            out.println("<p><strong>Department:</strong> " + department + "</p>");
            out.println("<hr>");
            out.println("<p><strong>Total Marks:</strong> " + totalMarks + " / 600</p>");
            out.println("<p><strong>Percentage:</strong> " + String.format("%.2f", percentage) + "%</p>");
            out.println("<p><strong>Grade:</strong> " + grade + "</p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Result Generator Servlet";
    }
}
