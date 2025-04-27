<%-- 
    Document   : createAccount
    Created on : 5 Mar 2025, 1:24:48 pm
    Author     : Meet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
    .container {
      background-color: #fff;
      padding: 55px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      width: 300px;
    }
    h2 {
      text-align: center;
      margin-bottom: 20px;
    }
    label {
      display: block;
      margin: 10px 0 5px;
    }
    input {
      width: 100%;
      padding: 8px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }
    button {
      width: 100%;
      padding: 10px;
      background-color: #5cb85c;
      border: none;
      border-radius: 5px;
      color: white;
      font-size: 16px;
      cursor: pointer;
    }
    button:hover {
      background-color: #4cae4c;
    }
        </style>
    </head>
    <body>
         <div class="container">
        <h2>Login Page</h2>
           <form method="POST" action="bankHome.jsp">
                <label for="acNo">Account No</label>
                <input type="text" id="acNo" name="acNo" required>

                <label for="acHolderName">Holder Name</label>
                <input type="text" id="acHolderName" name="acHolderName" required>

                <label for="balance">Balance</label>
                <input type="text" id="balance" name="balance" required>

                <button type="submit" name="submit">Submit</button>
           </form>

</div>
    </body>
</html>
