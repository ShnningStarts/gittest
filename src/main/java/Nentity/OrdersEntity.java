package Nentity;

import javassist.SerialVersionUID;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "orders", schema = "elet", catalog = "")
public class OrdersEntity  implements Serializable {
    public static final long SerialVersionUID=1l;
    private long ordersId;
    private long ordersSourceAddress;
    private long ordersDestinationAddress;
    private int ordersSenderTelephone;
    private int ordersReciverTelephone;
    private int ordersTotalPrice;
    private long ordersGoodsId;
    private Timestamp ordersCreateTime;
    private Timestamp ordersUserPayTime;
    private Timestamp ordersSenderMailTime;
    private Timestamp ordersSucceesTime;
    private int ordersMailPrice;
    private AddressEntity ordersSource;
    private AddressEntity destinatonAddress;
    private List<GoodsEntity> goods;

    OrdersEntity(){}
    OrdersEntity(Long id){
        ordersId=id;
    }

    public List<GoodsEntity> getGoods() {
        return goods;
    }

    public AddressEntity getDestinatonAddress() {
        return destinatonAddress;
    }

    public AddressEntity getOrdersSource() {
        return ordersSource;
    }

    public void setDestinatonAddress(AddressEntity destinatonAddress) {
        this.destinatonAddress = destinatonAddress;
    }

    public void setGoods(List<GoodsEntity> goods) {
        this.goods = goods;
    }

    public void setOrdersSource(AddressEntity ordersSource) {
        this.ordersSource = ordersSource;
    }


    @Id
    @Column(name = "orders_id", nullable = false)
    public long getOrdersId() {
        return ordersId;
    }

    private void setOrdersId(long ordersId) {
        this.ordersId = ordersId;
    }

    @Basic
    @Column(name = "orders_source_address", nullable = false)
    public long getOrdersSourceAddress() {
        return ordersSourceAddress;
    }

    public void setOrdersSourceAddress(long ordersSourceAddress) {
        this.ordersSourceAddress = ordersSourceAddress;
    }

    @Basic
    @Column(name = "orders_destination_address", nullable = false)
    public long getOrdersDestinationAddress() {
        return ordersDestinationAddress;
    }

    public void setOrdersDestinationAddress(long ordersDestinationAddress) {
        this.ordersDestinationAddress = ordersDestinationAddress;
    }

    @Basic
    @Column(name = "orders_sender_telephone", nullable = false)
    public int getOrdersSenderTelephone() {
        return ordersSenderTelephone;
    }

    public void setOrdersSenderTelephone(int ordersSenderTelephone) {
        this.ordersSenderTelephone = ordersSenderTelephone;
    }

    @Basic
    @Column(name = "orders_reciver_telephone", nullable = false)
    public int getOrdersReciverTelephone() {
        return ordersReciverTelephone;
    }

    public void setOrdersReciverTelephone(int ordersReciverTelephone) {
        this.ordersReciverTelephone = ordersReciverTelephone;
    }

    @Basic
    @Column(name = "orders_total_price", nullable = false)
    public int getOrdersTotalPrice() {
        return ordersTotalPrice;
    }

    public void setOrdersTotalPrice(int ordersTotalPrice) {
        this.ordersTotalPrice = ordersTotalPrice;
    }

    @Basic
    @Column(name = "orders_goods_id", nullable = false)
    public long getOrdersGoodsId() {
        return ordersGoodsId;
    }

    public void setOrdersGoodsId(long ordersGoodsId) {
        this.ordersGoodsId = ordersGoodsId;
    }

    @Basic
    @Column(name = "orders_create_time", nullable = false)
    public Timestamp getOrdersCreateTime() {
        return ordersCreateTime;
    }

    public void setOrdersCreateTime(Timestamp ordersCreateTime) {
        this.ordersCreateTime = ordersCreateTime;
    }

    @Basic
    @Column(name = "orders_user_pay_time", nullable = false)
    public Timestamp getOrdersUserPayTime() {
        return ordersUserPayTime;
    }

    public void setOrdersUserPayTime(Timestamp ordersUserPayTime) {
        this.ordersUserPayTime = ordersUserPayTime;
    }

    @Basic
    @Column(name = "orders_sender_mail_time", nullable = false)
    public Timestamp getOrdersSenderMailTime() {
        return ordersSenderMailTime;
    }

    public void setOrdersSenderMailTime(Timestamp ordersSenderMailTime) {
        this.ordersSenderMailTime = ordersSenderMailTime;
    }

    @Basic
    @Column(name = "orders_succees_time", nullable = false)
    public Timestamp getOrdersSucceesTime() {
        return ordersSucceesTime;
    }

    public void setOrdersSucceesTime(Timestamp ordersSucceesTime) {
        this.ordersSucceesTime = ordersSucceesTime;
    }

    @Basic
    @Column(name = "orders_mail_price", nullable = false)
    public int getOrdersMailPrice() {
        return ordersMailPrice;
    }

    public void setOrdersMailPrice(int ordersMailPrice) {
        this.ordersMailPrice = ordersMailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (ordersId != that.ordersId) return false;
        if (ordersSourceAddress != that.ordersSourceAddress) return false;
        if (ordersDestinationAddress != that.ordersDestinationAddress) return false;
        if (ordersSenderTelephone != that.ordersSenderTelephone) return false;
        if (ordersReciverTelephone != that.ordersReciverTelephone) return false;
        if (ordersTotalPrice != that.ordersTotalPrice) return false;
        if (ordersGoodsId != that.ordersGoodsId) return false;
        if (ordersMailPrice != that.ordersMailPrice) return false;
        if (ordersCreateTime != null ? !ordersCreateTime.equals(that.ordersCreateTime) : that.ordersCreateTime != null)
            return false;
        if (ordersUserPayTime != null ? !ordersUserPayTime.equals(that.ordersUserPayTime) : that.ordersUserPayTime != null)
            return false;
        if (ordersSenderMailTime != null ? !ordersSenderMailTime.equals(that.ordersSenderMailTime) : that.ordersSenderMailTime != null)
            return false;
        if (ordersSucceesTime != null ? !ordersSucceesTime.equals(that.ordersSucceesTime) : that.ordersSucceesTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ordersId ^ (ordersId >>> 32));
        result = 31 * result + (int) (ordersSourceAddress ^ (ordersSourceAddress >>> 32));
        result = 31 * result + (int) (ordersDestinationAddress ^ (ordersDestinationAddress >>> 32));
        result = 31 * result + ordersSenderTelephone;
        result = 31 * result + ordersReciverTelephone;
        result = 31 * result + ordersTotalPrice;
        result = 31 * result + (int) (ordersGoodsId ^ (ordersGoodsId >>> 32));
        result = 31 * result + (ordersCreateTime != null ? ordersCreateTime.hashCode() : 0);
        result = 31 * result + (ordersUserPayTime != null ? ordersUserPayTime.hashCode() : 0);
        result = 31 * result + (ordersSenderMailTime != null ? ordersSenderMailTime.hashCode() : 0);
        result = 31 * result + (ordersSucceesTime != null ? ordersSucceesTime.hashCode() : 0);
        result = 31 * result + ordersMailPrice;
        return result;
    }
}
