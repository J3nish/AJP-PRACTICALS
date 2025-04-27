<%-- 
    Document   : bankHome
    Created on : 5 Mar 2025, 1:28:16 pm
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
        <jsp:useBean id="bank" class="com.mycompany.practical_8.Bank" scope="session"/>
        <jsp:setProperty name="bank" property="*" />

        <h1>Account Details!</h1>
        Account Number: <jsp:getProperty name="bank" property="acNo" /> <br>
        Holder Name: <jsp:getProperty name="bank" property="acHolderName" /> <br>
        Current Balance: <jsp:getProperty name="bank" property="balance" /> <br>

        
         <div class="container">
        <h2>Login Page</h2>
            <form method="POST" action="operation.jsp">
                <label for="amount">Amount : </label>
                <input type="text" id="amount" name="amount" autocomplete="off" required >

                <label for="operation">Operation</label>
                <select name="operation">
                    <option value="deposite">deposit</option>
                    <option value="withdraw">withdraw</option>
                </select>
                
                <button type="submit" name="submit">Submit</button>
            </form>
        </div>
    </body>
</html>
