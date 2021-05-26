package epam.com.pizz.model.customer;

public class Addr {
    /*** опирался на систему Kladr */
    private String region;
    private String city;
    private String street;
    private String house_number;
    private int apartment_number;

    public Addr() {
    }
    public Addr(String region, String city, String street, String house_number, int apartment_number) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.apartment_number = apartment_number;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse_number() {
        return house_number;
    }
    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public int getApartmentNumber() {
        return apartment_number;
    }
    public void setApartmentNumber(int apartment_number) {
        this.apartment_number = apartment_number;
    }
}
