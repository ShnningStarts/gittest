package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address", schema = "elet", catalog = "")
public class AddressEntity implements Serializable {
    private long addressId;
    private String addressNation;
    private String addressProvice;
    private String addressCity;
    private String addressArea;
    private String addressDetail;
    private long addressUserId;
    AddressEntity(){}
    AddressEntity(Long id){
        addressId=id;
    }
    @Id
    @Column(name = "address_id", nullable = false)
    public long getAddressId() {
        return addressId;
    }

    private void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "address_nation", nullable = false, length = 30)
    public String getAddressNation() {
        return addressNation;
    }

    public void setAddressNation(String addressNation) {
        this.addressNation = addressNation;
    }

    @Basic
    @Column(name = "address_provice", nullable = false, length = 30)
    public String getAddressProvice() {
        return addressProvice;
    }

    public void setAddressProvice(String addressProvice) {
        this.addressProvice = addressProvice;
    }

    @Basic
    @Column(name = "address_city", nullable = false, length = 30)
    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    @Basic
    @Column(name = "address_area", nullable = false, length = 30)
    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    @Basic
    @Column(name = "address_detail", nullable = false, length = -1)
    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    @Basic
    @Column(name = "address_user_id", nullable = false)
    public long getAddressUserId() {
        return addressUserId;
    }

    public void setAddressUserId(long addressUserId) {
        this.addressUserId = addressUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressEntity that = (AddressEntity) o;

        if (addressId != that.addressId) return false;
        if (addressUserId != that.addressUserId) return false;
        if (addressNation != null ? !addressNation.equals(that.addressNation) : that.addressNation != null)
            return false;
        if (addressProvice != null ? !addressProvice.equals(that.addressProvice) : that.addressProvice != null)
            return false;
        if (addressCity != null ? !addressCity.equals(that.addressCity) : that.addressCity != null) return false;
        if (addressArea != null ? !addressArea.equals(that.addressArea) : that.addressArea != null) return false;
        if (addressDetail != null ? !addressDetail.equals(that.addressDetail) : that.addressDetail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (addressId ^ (addressId >>> 32));
        result = 31 * result + (addressNation != null ? addressNation.hashCode() : 0);
        result = 31 * result + (addressProvice != null ? addressProvice.hashCode() : 0);
        result = 31 * result + (addressCity != null ? addressCity.hashCode() : 0);
        result = 31 * result + (addressArea != null ? addressArea.hashCode() : 0);
        result = 31 * result + (addressDetail != null ? addressDetail.hashCode() : 0);
        result = 31 * result + (int) (addressUserId ^ (addressUserId >>> 32));
        return result;
    }
}
