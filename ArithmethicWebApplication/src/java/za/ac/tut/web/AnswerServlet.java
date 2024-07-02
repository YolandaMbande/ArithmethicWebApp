/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entity.Outcomes;
import za.ac.tut.entity.UserAnswers;
import za.ac.tut.model.CheckCalculationsInterface;


public class AnswerServlet extends HttpServlet {
@EJB CheckCalculationsInterface cci;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String answer  = request.getParameter("answer");
        int num1 = (int)session.getAttribute("num1");
        int num2 = (int)session.getAttribute("num2");
        
        String correctAnswer = cci.getAnswer(num1, num2);
        UserAnswers user = createUserAnswers(answer);
        Outcomes outcomes = createOutcome(correctAnswer);
        
        String outcome = cci.determineOutcome(user.getAnswers(), outcomes.getOutcomes());
        
        updateSession(session , outcome, user, outcomes);
        
        RequestDispatcher disp = request.getRequestDispatcher("round_outcome.jsp");
        disp.forward(request, response);
    }

    private Outcomes createOutcome(String outcome) {
        Outcomes o = new Outcomes();
        o.setOutcomes(outcome);
        return o;
    }

    private void updateSession(HttpSession session, String outcome, UserAnswers correctAnswer, Outcomes outcomes) {
        int gamesplayed = (int) session.getAttribute("gamesplayed"), userguesses = (int) session.getAttribute("userguesses"), computerguesses = (int) session.getAttribute("computerguesses");
       List<UserAnswers> players = (List<UserAnswers>) session.getAttribute("players");
       List<Outcomes> computer = (List<Outcomes>)session.getAttribute("computer");
       
       if(outcome.equals("Correct")){
           userguesses++;
           session.setAttribute("userguesses", userguesses);
       }else{
           computerguesses++;
           session.setAttribute("computerguesses", computerguesses);
       }
       gamesplayed++;
       session.setAttribute("gamesplayed", gamesplayed);
       
       players.add(correctAnswer);
       session.setAttribute("players", players);
       
       computer.add(outcomes);
       session.setAttribute("computer", computer);
    }

    private UserAnswers createUserAnswers(String answer) {
        UserAnswers ua = new UserAnswers();
        ua.setAnswers(answer);
        return ua;
    }
}
