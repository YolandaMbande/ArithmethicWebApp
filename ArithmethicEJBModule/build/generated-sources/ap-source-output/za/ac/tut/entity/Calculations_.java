package za.ac.tut.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entity.Outcomes;
import za.ac.tut.entity.UserAnswers;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-02T13:18:58")
@StaticMetamodel(Calculations.class)
public class Calculations_ { 

    public static volatile SingularAttribute<Calculations, Integer> correctanswers;
    public static volatile ListAttribute<Calculations, Outcomes> outcomes;
    public static volatile SingularAttribute<Calculations, String> surname;
    public static volatile SingularAttribute<Calculations, String> name;
    public static volatile SingularAttribute<Calculations, Integer> gamesplayed;
    public static volatile SingularAttribute<Calculations, Integer> wronganswers;
    public static volatile SingularAttribute<Calculations, Long> id;
    public static volatile ListAttribute<Calculations, UserAnswers> useranswers;

}