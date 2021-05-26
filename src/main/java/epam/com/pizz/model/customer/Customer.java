package epam.com.pizz.model.customer;

public class Customer {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String phone;
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Addr address;
    public Addr getAddress() {
        return address;
    }
    public void setAddress(Addr address) {
        this.address = address;
    }

    public Customer() {
    }
    public Customer(String name, String phone, Addr address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
