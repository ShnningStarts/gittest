package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orders", schema = "ele", catalog = "")
public class OrdersEntity {
    private long ordersId;
    private String fromAdd;
    private String destAdd;
    private Timestamp createDate;
    private String senderName;
    private String reciveName;
    private String senderTele;
    private Timestamp reciveTele;
    private Timestamp arriveDate;

    @Id
    @Column(name = "orders_id")
    public long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(long ordersId) {
        this.ordersId = ordersId;
    }

    @Basic
    @Column(name = "from_add")
    public String getFromAdd() {
        return fromAdd;
    }

    public void setFromAdd(String fromAdd) {
        this.fromAdd = fromAdd;
    }

    @Basic
    @Column(name = "dest_add")
    public String getDestAdd() {
        return destAdd;
    }

    public void setDestAdd(String destAdd) {
        this.destAdd = destAdd;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "sender_name")
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "recive_name")
    public String getReciveName() {
        return reciveName;
    }

    public void setReciveName(String reciveName) {
        this.reciveName = reciveName;
    }

    @Basic
    @Column(name = "sender_tele")
    public String getSenderTele() {
        return senderTele;
    }

    public void setSenderTele(String senderTele) {
        this.senderTele = senderTele;
    }

    @Basic
    @Column(name = "recive_tele")
    public Timestamp getReciveTele() {
        return reciveTele;
    }

    public void setReciveTele(Timestamp reciveTele) {
        this.reciveTele = reciveTele;
    }

    @Basic
    @Column(name = "arrive_date")
    public Timestamp getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Timestamp arriveDate) {
        this.arriveDate = arriveDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (ordersId != that.ordersId) return false;
        if (fromAdd != null ? !fromAdd.equals(that.fromAdd) : that.fromAdd != null) return false;
        if (destAdd != null ? !destAdd.equals(that.destAdd) : that.destAdd != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (senderName != null ? !senderName.equals(that.senderName) : that.senderName != null) return false;
        if (reciveName != null ? !reciveName.equals(that.reciveName) : that.reciveName != null) return false;
        if (senderTele != null ? !senderTele.equals(that.senderTele) : that.senderTele != null) return false;
        if (reciveTele != null ? !reciveTele.equals(that.reciveTele) : that.reciveTele != null) return false;
        if (arriveDate != null ? !arriveDate.equals(that.arriveDate) : that.arriveDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ordersId ^ (ordersId >>> 32));
        result = 31 * result + (fromAdd != null ? fromAdd.hashCode() : 0);
        result = 31 * result + (destAdd != null ? destAdd.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (senderName != null ? senderName.hashCode() : 0);
        result = 31 * result + (reciveName != null ? reciveName.hashCode() : 0);
        result = 31 * result + (senderTele != null ? senderTele.hashCode() : 0);
        result = 31 * result + (reciveTele != null ? reciveTele.hashCode() : 0);
        result = 31 * result + (arriveDate != null ? arriveDate.hashCode() : 0);
        return result;
    }
}
