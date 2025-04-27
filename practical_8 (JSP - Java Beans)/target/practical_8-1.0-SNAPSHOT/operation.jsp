<%-- 
    Document   : operation
    Created on : 5 Mar 2025, 1:46:59 pm
    Author     : Meet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mycompany.practical_8.Bank"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <jsp:useBean id="bank" class="com.mycompany.practical_8.Bank" scope="session"/>
        <%
            double amt = Double.parseDouble(request.getParameter("amount"));
            String operation = request.getParameter("operation");
              
            if(operation.equals("deposite")){
                bank.deposite(amt);
            }else if(operation.equals("withdraw")){
                bank.withdraw(amt);
            }
            %>
            
            <h1>Account Details!</h1>
            Account Number:<jsp:getProperty name="bank" property="acNo" /> <br>
            Holder Name:<jsp:getProperty name="bank" property="acHolderName" /> <br>
            Current Balance:<jsp:getProperty name="bank" property="balance" /> <br>
        
        <a href="bankHome.jsp" >Back to Home</a>
    </body>
</html>
