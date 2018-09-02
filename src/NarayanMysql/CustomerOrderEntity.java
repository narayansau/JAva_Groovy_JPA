package NarayanMysql;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer_order", schema = "xe", catalog = "")
public class CustomerOrderEntity {
    private int custId;
    private String name;
    private BigDecimal price;
    private String description;
    private Timestamp lastUpdate;

    @Id
    @Column(name = "cust_id", nullable = false)
    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
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
    @Column(name = "description", nullable = false, length = 45)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerOrderEntity that = (CustomerOrderEntity) o;
        return custId == that.custId &&
                Objects.equals( name, that.name ) &&
                Objects.equals( price, that.price ) &&
                Objects.equals( description, that.description ) &&
                Objects.equals( lastUpdate, that.lastUpdate );
    }

    @Override
    public int hashCode() {
        return Objects.hash( custId, name, price, description, lastUpdate );
    }
}
