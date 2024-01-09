
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author GANZA
 */
@Entity
public class Opinions implements Serializable{
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "Eid")
    private Integer Eid;
    private String names;
    private Integer telNumber;
    private String email;
    private String opinion;
     
    @ManyToOne
        @JoinColumn(name = "eid")
    private Employees employees;

    public Opinions() {
    }

    public Opinions(Integer Eid) {
        this.Eid = Eid;
    }

    public Opinions(Integer Eid, String names, Integer telNumber, String email, String opinion, Employees employees) {
        this.Eid = Eid;
        this.names = names;
        this.telNumber = telNumber;
        this.email = email;
        this.opinion = opinion;
        this.employees = employees;
    }

    public Integer getEid() {
        return Eid;
    }

    public void setEid(Integer Eid) {
        this.Eid = Eid;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Integer getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(Integer telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    
}
