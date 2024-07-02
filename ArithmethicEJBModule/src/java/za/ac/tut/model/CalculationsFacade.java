/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entity.Calculations;

/**
 *
 * @author yolan
 */
@Stateless
public class CalculationsFacade extends AbstractFacade<Calculations> implements CalculationsFacadeLocal {

    @PersistenceContext(unitName = "ArithmethicEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalculationsFacade() {
        super(Calculations.class);
    }
    
}
