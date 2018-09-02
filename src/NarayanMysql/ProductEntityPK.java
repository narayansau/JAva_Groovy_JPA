package NarayanMysql;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProductEntityPK implements Serializable {
    private int id;
    private int categoryIdCategory;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "Category_idCategory", nullable = false)
    @Id
    public int getCategoryIdCategory() {
        return categoryIdCategory;
    }

    public void setCategoryIdCategory(int categoryIdCategory) {
        this.categoryIdCategory = categoryIdCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntityPK that = (ProductEntityPK) o;
        return id == that.id &&
                categoryIdCategory == that.categoryIdCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, categoryIdCategory );
    }
}
