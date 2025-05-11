package ha05.a1;

public class ShippingInfo {
    private String city;
    private int zipcode;
    private String country;

    public ShippingInfo(String city, int zipcode, String country) {
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
