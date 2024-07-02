
package za.ac.tut.model;

import javax.ejb.Stateless;

@Stateless
public class CheckCalculationImplementor implements CheckCalculationsInterface {

    @Override
    public int generateNumber() {
       int number = (int) Math.floor(Math.random()* 100);
       return number;
    }

    @Override
    public String genearteQuestion(int num1, int num2) {
        String question = num1 + " + "+ num2;
        return question;
    }

    @Override
    public String getAnswer(int num1, int num2) {
       int sum = num1 + num2;
       return Integer.toString(sum);
    }

    @Override
    public String determineOutcome(String userAnswer, String correct) {
        String outcome = "Wrong";
        if(userAnswer.equals(correct)){
            outcome = "Correct";
        }
        return outcome;
    }
    
}
