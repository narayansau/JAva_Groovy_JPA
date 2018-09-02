package NarayanMysql;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CustomerOrderHasCategoryEntityPK implements Serializable {
    private int customerOrderCustId;
    private int categoryIdCategory;

    @Column(name = "customer_order_cust_id", nullable = false)
    @Id
    public int getCustomerOrderCustId() {
        return customerOrderCustId;
    }

    public void setCustomerOrderCustId(int customerOrderCustId) {
        this.customerOrderCustId = customerOrderCustId;
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
        CustomerOrderHasCategoryEntityPK that = (CustomerOrderHasCategoryEntityPK) o;
        return customerOrderCustId == that.customerOrderCustId &&
                categoryIdCategory == that.categoryIdCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash( customerOrderCustId, categoryIdCategory );
    }
}
