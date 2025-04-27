<%-- 
    Document   : redirect
    Created on : 9 Mar 2025, 10:55:12 pm
    Author     : Meet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    // Get the URL parameter from the form
    String url = request.getParameter("url");

    // Check if the URL is not empty or null
    if (url != null && !url.trim().isEmpty()) {
        try { 
            // Redirect to the entered URL
            response.sendRedirect(url);
            return; // Stop further execution
        } catch (Exception e) {
            out.println("<h3 style='color:red;'>Invalid URL! Please enter a valid URL.</h3>");
        }
    } else {
        out.println("<h3 style='color:red;'>URL field cannot be empty!</h3>");
    }
%>
    </body>
</html>
