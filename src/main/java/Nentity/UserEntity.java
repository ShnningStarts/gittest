package Nentity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import Nentity.*;
import javassist.SerialVersionUID;
import

@Entity
@Table(name = "user", schema = "elet", catalog = "")
public class UserEntity<t> implements Serializable {
    public static final long SerialVersionUID=1l;
    private Long userId;
    private String userName;
    private int userAge;
    private Timestamp userCreateTime;
    private String userEmail;
    private byte userSex;
    private Integer userTele;
    private Long userAddress;
    private List<AddressEntity> address;
    @Transient
    private List<GoodsEntity> goods;
    @Transient
    private List<OrdersEntity> orders;

UserEntity(){}
UserEntity(Long id){userId=id;}
    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public List<AddressEntity> getAddress() {
        return address;
    }

    public List<GoodsEntity> getGoods() {
        return goods;
    }

    public List<OrdersEntity> getOrders() {
        return orders;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserAddress(Long userAddress) {
        this.userAddress = userAddress;
    }

    public void setAddress(List<AddressEntity> address) {
        this.address = address;
    }


    private void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_age", nullable = false)
    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Basic
    @Column(name = "user_create_time", nullable = false)
    public Timestamp getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Timestamp userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    @Basic
    @Column(name = "user_email", nullable = false, length = 20)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_sex", nullable = false)
    public byte getUserSex() {
        return userSex;
    }

    public void setUserSex(byte userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_tele", nullable = false)
    public int getUserTele() {
        return userTele;
    }

    public void setUserTele(int userTele) {
        this.userTele = userTele;
    }

    @Basic
    @Column(name = "user_address", nullable = false)
    public long getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(long userAddress) {
        this.userAddress = userAddress;
    }

    public List<entity.GoodsEntity>(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userAge != that.userAge) return false;
        if (userSex != that.userSex) return false;
        if (userTele != that.userTele) return false;
        if (userAddress != that.userAddress) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userCreateTime != null ? !userCreateTime.equals(that.userCreateTime) : that.userCreateTime != null)
            return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + userAge;
        result = 31 * result + (userCreateTime != null ? userCreateTime.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (int) userSex;
        result = 31 * result + userTele;
        result = 31 * result + (int) (userAddress ^ (userAddress >>> 32));
        return result;
    }
}
