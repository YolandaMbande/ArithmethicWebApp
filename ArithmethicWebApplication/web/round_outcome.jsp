<%-- 
    Document   : round_outcome
    Created on : 02 Jul 2024, 13:36:43
    Author     : yolan
--%>

<%@page import="za.ac.tut.entity.Outcomes"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.UserAnswers"%>
<%@page import="za.ac.tut.entity.UserAnswers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Answer Page</title>
    </head>
    <body>
        <h1>Answer Page</h1>
            
        <h1>Session Attributes</h1>
        <table border="1">
            <tr>
                <th>Attribute</th>
                <th>Value</th>
            </tr>
            <tr>
                <td>Games Played</td>
                <td><%= session.getAttribute("gamesplayed") %></td>
            </tr>
            <tr>
                <td>User Guesses</td>
                <td><%= session.getAttribute("userguesses") %></td>
            </tr>
            <tr>
                <td>Computer Guesses</td>
                <td><%= session.getAttribute("computerguesses") %></td>
            </tr>
        </table>

        <h2>Players</h2>
        <table border="1">
            <tr>
                <th>Index</th>
                <th>Player Answer</th>
            </tr>
            <%
                List<UserAnswers> players = (List<UserAnswers>) session.getAttribute("players");
                if (players != null) {
                    for (int i = 0; i < players.size(); i++) {
                    String answer = players.get(i).getAnswers();
            %>
            <tr>
                <td><%= i %></td>
                <td><%= answer %></td>
            </tr>
            <%
                    }
                }
            %>
        </table>

        <h2>Computer Outcomes</h2>
        <table border="1">
            <tr>
                <th>Index</th>
                <th>Outcome</th>
            </tr>
            <%
                List<Outcomes> computer = (List<Outcomes>) session.getAttribute("computer");
                if (computer != null) {
                    for (int i = 0; i < computer.size(); i++) {
                    String answer = computer.get(i).getOutcomes();
            %>
            <tr>
                <td><%= i %></td>
                <td><%= answer %></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
        <p>
            <a href="user_form.html">Play again.</a>
        </p>
       
    </body>
</html>
