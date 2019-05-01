package entity;

import java.util.Date;
import entity.user;

public class orders {
    Long orderId;
    String fromAdd;
    String destAdd;
    Date createDate;
    Date arriveDate;
    String senderName;
    String reciveName;
    Integer senderTele;
    Integer reciveTele;
    user cus;

    private   orders(Long id){
        this.orderId=id;
    }

    public user getCus() {
        return cus;
    }

    public void setCus(user cus) {
        this.cus = cus;
    }

    public orders(){}

    public Date getCreateDate() {
        return createDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public Integer getReciveTele() {
        return reciveTele;
    }

    public Integer getSenderTele() {
        return senderTele;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getDestAdd() {
        return destAdd;
    }

    public String getFromAdd() {
        return fromAdd;
    }

    public String getReciveName() {
        return reciveName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public void setDestAdd(String destAdd) {
        this.destAdd = destAdd;
    }

    public void setFromAdd(String fromAdd) {
        this.fromAdd = fromAdd;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setReciveName(String reciveName) {
        this.reciveName = reciveName;
    }

    public void setReciveTele(Integer reciveTele) {
        this.reciveTele = reciveTele;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setSenderTele(Integer senderTele) {
        this.senderTele = senderTele;
    }
}
