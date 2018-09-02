package NarayanMysql;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "xe", catalog = "")
public class CustomerEntity {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String cityRegion;
    private String ccNumber;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "City_region", nullable = false, length = 2)
    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }

    @Basic
    @Column(name = "cc_number", nullable = false, length = 20)
    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return id == that.id &&
                Objects.equals( name, that.name ) &&
                Objects.equals( email, that.email ) &&
                Objects.equals( phone, that.phone ) &&
                Objects.equals( address, that.address ) &&
                Objects.equals( cityRegion, that.cityRegion ) &&
                Objects.equals( ccNumber, that.ccNumber );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, name, email, phone, address, cityRegion, ccNumber );
    }
}
