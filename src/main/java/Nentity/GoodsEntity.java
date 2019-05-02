package Nentity;

import javassist.SerialVersionUID;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "goods", schema = "elet", catalog = "")
public class GoodsEntity implements Serializable {
    public static final  long SerialVersionUID=1l;
    private Integer goodsId;
    private Integer goodsCategoryId;
    private String goodsName;
    private String goodsDescription;
    private Integer goodsPrice;
    private Integer goodsUserId;
GoodsEntity(){}
GoodsEntity(Integer id){goodsId=id;}
    @Id
    @Column(name = "goods_id", nullable = false)
    public Integer getGoodsId() {
        return goodsId;
    }

    private void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_category_id", nullable = false)
    public Integer getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Integer goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    @Basic
    @Column(name = "goods_name", nullable = true, length = 20)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_description", nullable = false, length = -1)
    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    @Basic
    @Column(name = "goods_price", nullable = false)
    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Basic
    @Column(name = "goods_user_id", nullable = true)
    public Integer getGoodsUserId() {
        return goodsUserId;
    }

    public void setGoodsUserId(Integer goodsUserId) {
        this.goodsUserId = goodsUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (goodsId != that.goodsId) return false;
        if (goodsCategoryId != that.goodsCategoryId) return false;
        if (goodsPrice != that.goodsPrice) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (goodsDescription != null ? !goodsDescription.equals(that.goodsDescription) : that.goodsDescription != null)
            return false;
        if (goodsUserId != null ? !goodsUserId.equals(that.goodsUserId) : that.goodsUserId != null) return false;

        return true;
    }

    @Override
    public Integer hashCode() {
        Integer result = goodsId;
        result = 31 * result + goodsCategoryId;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsDescription != null ? goodsDescription.hashCode() : 0);
        result = 31 * result + goodsPrice;
        result = 31 * result + (goodsUserId != null ? goodsUserId.hashCode() : 0);
        return result;
    }
}
