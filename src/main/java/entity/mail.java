package entity;

public class mail {
    Long userId;
    public  mail(){}
    public  mail(long id){
        userId=id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
