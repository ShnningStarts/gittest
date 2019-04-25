package entity;

public class admin {
    int adminId;
    String name;
    public admin(){

    }
    public  admin(int id){
        this.adminId=id;
    }
    public void setId(int id) {
        this.adminId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return adminId;
    }

}
