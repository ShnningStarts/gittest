package entity;

public class goods {
    Long goodsId;
    String name;
    String cateId;
    int number;
    String descption;
    String userId;

    public goods(){}
    public  goods(int id){
        goodsId=(long)id;

    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public void setDescption(String descption) {
        this.descption = descption;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public String getCateId() {
        return cateId;
    }

    public String getDescption() {
        return descption;
    }

    public String getUserId() {
        return userId;
    }
}
