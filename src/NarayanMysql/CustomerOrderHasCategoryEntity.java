package NarayanMysql;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer_order_has_category", schema = "xe", catalog = "")
@IdClass(CustomerOrderHasCategoryEntityPK.class)
public class CustomerOrderHasCategoryEntity {
    private int customerOrderCustId;
    private int categoryIdCategory;

    @Id
    @Column(name = "customer_order_cust_id", nullable = false)
    public int getCustomerOrderCustId() {
        return customerOrderCustId;
    }

    public void setCustomerOrderCustId(int customerOrderCustId) {
        this.customerOrderCustId = customerOrderCustId;
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
        CustomerOrderHasCategoryEntity that = (CustomerOrderHasCategoryEntity) o;
        return customerOrderCustId == that.customerOrderCustId &&
                categoryIdCategory == that.categoryIdCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash( customerOrderCustId, categoryIdCategory );
    }
}
