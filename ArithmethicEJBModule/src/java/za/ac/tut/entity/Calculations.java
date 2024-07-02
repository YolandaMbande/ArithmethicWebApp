
package za.ac.tut.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author yolan
 */
@Entity
public class Calculations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String surname;
    
    private Integer gamesplayed;
    private Integer correctanswers;
    private Integer wronganswers;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<Outcomes> outcomes;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<UserAnswers> useranswers;

    public Calculations() {
    }

    public Calculations(Long id, String name, String surname, Integer gamesplayed, Integer correctanswers, Integer wronganswers, List<Outcomes> outcomes, List<UserAnswers> useranswers) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gamesplayed = gamesplayed;
        this.correctanswers = correctanswers;
        this.wronganswers = wronganswers;
        this.outcomes = outcomes;
        this.useranswers = useranswers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGamesplayed() {
        return gamesplayed;
    }

    public void setGamesplayed(Integer gamesplayed) {
        this.gamesplayed = gamesplayed;
    }

    public Integer getCorrectanswers() {
        return correctanswers;
    }

    public void setCorrectanswers(Integer correctanswers) {
        this.correctanswers = correctanswers;
    }

    public Integer getWronganswers() {
        return wronganswers;
    }

    public void setWronganswers(Integer wronganswers) {
        this.wronganswers = wronganswers;
    }

    public List<Outcomes> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(List<Outcomes> outcomes) {
        this.outcomes = outcomes;
    }

    public List<UserAnswers> getUseranswers() {
        return useranswers;
    }

    public void setUseranswers(List<UserAnswers> useranswers) {
        this.useranswers = useranswers;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calculations)) {
            return false;
        }
        Calculations other = (Calculations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entity.Calculations[ id=" + id + " ]";
    }
    
}
