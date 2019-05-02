package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category", schema = "elet", catalog = "")
public class CategoryEntity implements Serializable {
    private int categoryId;
    private String categoryName;
    private Integer categoryChildId;

    @Id
    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return categoryId;
    }

    private void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name", nullable = false, length = 20)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "category_child_id", nullable = true)
    public Integer getCategoryChildId() {
        return categoryChildId;
    }

    public void setCategoryChildId(Integer categoryChildId) {
        this.categoryChildId = categoryChildId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (categoryId != that.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categoryChildId != null ? !categoryChildId.equals(that.categoryChildId) : that.categoryChildId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categoryChildId != null ? categoryChildId.hashCode() : 0);
        return result;
    }
}
