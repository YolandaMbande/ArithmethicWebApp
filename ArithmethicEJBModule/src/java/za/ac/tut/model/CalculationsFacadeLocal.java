/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Calculations;

/**
 *
 * @author yolan
 */
@Local
public interface CalculationsFacadeLocal {

    void create(Calculations calculations);

    void edit(Calculations calculations);

    void remove(Calculations calculations);

    Calculations find(Object id);

    List<Calculations> findAll();

    List<Calculations> findRange(int[] range);

    int count();
    
}
