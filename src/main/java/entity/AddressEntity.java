package entity;

import javax.persistence.*;

@Entity
@Table(name = "address", schema = "ele", catalog = "")
public class AddressEntity {
    private int addId;
    private String provice;
    private String addDefinition;

    @Id
    @Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Basic
    @Column(name = "provice")
    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    @Basic
    @Column(name = "add_definition")
    public String getAddDefinition() {
        return addDefinition;
    }

    public void setAddDefinition(String addDefinition) {
        this.addDefinition = addDefinition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressEntity that = (AddressEntity) o;

        if (addId != that.addId) return false;
        if (provice != null ? !provice.equals(that.provice) : that.provice != null) return false;
        if (addDefinition != null ? !addDefinition.equals(that.addDefinition) : that.addDefinition != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addId;
        result = 31 * result + (provice != null ? provice.hashCode() : 0);
        result = 31 * result + (addDefinition != null ? addDefinition.hashCode() : 0);
        return result;
    }
}
