package entity;

public class category {
    int categoryId;
    String cateName;
    public category(){}
    public category(int id){
        categoryId=id;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCateName() {
        return cateName;
    }

}
