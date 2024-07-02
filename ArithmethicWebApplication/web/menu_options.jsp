<%-- 
    Document   : menu_options
    Created on : 02 Jul 2024, 13:02:53
    Author     : yolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ask Question Page</title>
    </head>
    <body>
        <h1>Ask Question?</h1>
         <%
            String name = (String)session.getAttribute("name");
            String surname = (String)session.getAttribute("surname");
            String question = (String) session.getAttribute("question");
        %>
        <h1>Menu Options!</h1>
        <p>
            Hello, <b><%=name%> <%=surname%></b>, please select any option you want to perform:
        </p>
        <form action="AnswerServlet.do" method="POST">
            <table>
                <tr>
                    <td>Question :</td>
                    <td><b><%= question%></b></td>
                </tr>
                
                <tr>
                    <td>Your Answer :</td>
                    <td><input type="text" name="answer" required=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET ANSWER"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
