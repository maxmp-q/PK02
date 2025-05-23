package ha05.a1;

import ha05.a2.InvalidCustomerException;

public class Customer {
    private Profile profile;
    private int id;

    //Here solution for 3)
    private ShippingInfo shippingInfo;
    private int id2;

    //Here are solutions for a2
    public Customer(Profile profile, int id) {
        if(profile == null || id < 0){
            throw new InvalidCustomerException("Profile is missing or id is negative");
        }
        this.profile = profile;
        this.id = id;
    }

    //new constructor
    public Customer(ShippingInfo shippingInfo, int id2){
        this.shippingInfo = shippingInfo;
        this.id2 = id2;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }
}
