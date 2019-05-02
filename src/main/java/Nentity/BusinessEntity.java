package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "business", schema = "elet", catalog = "")
public class BusinessEntity implements Serializable {
    private int businessId;
    private Integer businessPersonal;
    BusinessEntity(){}
    BusinessEntity(int id){
        businessId=id;
    }
    @Id
    @Column(name = "business_id", nullable = false)
    public int getBusinessId() {
        return businessId;
    }

    private void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    @Basic
    @Column(name = "business_personal", nullable = true)
    public Integer getBusinessPersonal() {
        return businessPersonal;
    }

    public void setBusinessPersonal(Integer businessPersonal) {
        this.businessPersonal = businessPersonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessEntity that = (BusinessEntity) o;

        if (businessId != that.businessId) return false;
        if (businessPersonal != null ? !businessPersonal.equals(that.businessPersonal) : that.businessPersonal != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = businessId;
        result = 31 * result + (businessPersonal != null ? businessPersonal.hashCode() : 0);
        return result;
    }
}
