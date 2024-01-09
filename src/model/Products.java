
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author GANZA
 */
@Entity
public class Products implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_id")
    private Integer pId;
        @Column(name = "Product_name")
    private String pName;
    private Integer quantity;
    @Column(name = "Delivery_Date")
    private String dDate;
    @Column(name = "Expiry_Date")
    private String eDate;
    private Integer cp;
    private Integer sp;
    @ManyToMany(mappedBy = "products")
    private Set<Employees>employees=new HashSet<>();

    public Products() {
    }

    public Products(Integer pId) {
        this.pId = pId;
    }

    public Products(Integer pId, String pName, Integer quantity, String dDate, String eDate, Integer cp, Integer sp) {
        this.pId = pId;
        this.pName = pName;
        this.quantity = quantity;
        this.dDate = dDate;
        this.eDate = eDate;
        this.cp = cp;
        this.sp = sp;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Integer getSp() {
        return sp;
    }

    public void setSp(Integer sp) {
        this.sp = sp;
    }

    public Set<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employees> employees) {
        this.employees = employees;
    }
    
}
