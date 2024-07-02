
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


public class CreateUserServlet extends HttpServlet {
@EJB CheckCalculationsInterface cci;
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        
        int num1 = cci.generateNumber();
        int num2 = cci.generateNumber();
        String question = cci.genearteQuestion(num1, num2);
        
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        
        initilaseSession(session, name, surname, question);
        
        RequestDispatcher disp = request.getRequestDispatcher("menu_options.jsp");
        disp.forward(request, response);
    }

    private void initilaseSession(HttpSession session, String name, String surname, String question) {
       int gamesplayed = 0, userguesses = 0, computerguesses = 0;
       List<UserAnswers> players = new ArrayList<>();
       List<Outcomes> computer = new ArrayList<>();
       
       session.setAttribute("name", name);
       session.setAttribute("surname", surname);
       session.setAttribute("gamesplayed", gamesplayed);
       session.setAttribute("userguesses", userguesses);
       session.setAttribute("computerguesses", computerguesses);
       session.setAttribute("players", players);
       session.setAttribute("computer", computer);
       session.setAttribute("question", question);
    }
}
