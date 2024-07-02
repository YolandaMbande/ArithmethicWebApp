/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model;

import javax.ejb.Local;

/**
 *
 * @author yolan
 */
@Local
public interface CheckCalculationsInterface {
    
    public int generateNumber();
    
    public String genearteQuestion(int num1, int num2);
    
    public String getAnswer(int num1, int num2);
    
    public String determineOutcome(String userAnswer, String correct);
}
