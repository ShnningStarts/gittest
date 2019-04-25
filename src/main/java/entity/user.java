package entity;

import java.util.Date;

public class user extends BaseData{
    private static final long serialVersionUID=1l;
    private Integer userId;
    private String name;
    private Boolean sex;
    private String nation;
   private Date brithday;
   private String status;
   private String phone;
   private String addId;
   public user(){
       super();
   }
   public user(String  certType){

   }

    public String getName() {
        return name;
    }

    public Boolean getSex() {
        return sex;
    }

    public Date getBrithday() {
        return brithday;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAddId() {
        return addId;
    }

    public String getNation() {
        return nation;
    }

    public String getPhone() {
        return phone;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setAddId(String addId) {
        this.addId = addId;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
