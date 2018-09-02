package NarayanMysql;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "xe", catalog = "")
@IdClass(ProductEntityPK.class)
public class ProductEntity {
    private int id;
    private String name;
    private BigDecimal price;
    private String description;
    private Timestamp lastUpdate;
    private int categoryIdCategory;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Description", nullable = false, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "last_update", nullable = true)
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Id
    @Column(name = "Category_idCategory", nullable = false)
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
        ProductEntity that = (ProductEntity) o;
        return id == that.id &&
                categoryIdCategory == that.categoryIdCategory &&
                Objects.equals( name, that.name ) &&
                Objects.equals( price, that.price ) &&
                Objects.equals( description, that.description ) &&
                Objects.equals( lastUpdate, that.lastUpdate );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, name, price, description, lastUpdate, categoryIdCategory );
    }
}
