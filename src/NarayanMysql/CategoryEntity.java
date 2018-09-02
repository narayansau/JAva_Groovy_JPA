package NarayanMysql;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "xe", catalog = "")
public class CategoryEntity {
    private int idCategory;
    private String name;

    @Id
    @Column(name = "idCategory", nullable = false)
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return idCategory == that.idCategory &&
                Objects.equals( name, that.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( idCategory, name );
    }
}
