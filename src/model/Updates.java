
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author GANZA
 */
@Entity
public class Updates implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "updates_Number")
    private Integer updN;
   private String date;
   private String workUpdates;
   @OneToOne
   @JoinColumn(name = "Employer_ID")
   private Admin admin;

    public Updates() {
    }

    public Updates(Integer updN) {
        this.updN = updN;
    }

    public Updates(Integer updN, String date, String workUpdates, Admin admin) {
        this.updN = updN;
        this.date = date;
        this.workUpdates = workUpdates;
        this.admin = admin;
    }

    public Integer getUpdN() {
        return updN;
    }

    public void setUpdN(Integer updN) {
        this.updN = updN;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWorkUpdates() {
        return workUpdates;
    }

    public void setWorkUpdates(String workUpdates) {
        this.workUpdates = workUpdates;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
   
}
