package ha05.a1;

public class EComController {

    public static void main(String[] args) {
        ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);

        System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());

        //Solution for 3)
        Customer customer1 = new Customer(info, 123);
        System.out.println("Shipping to: " + customer1.getShippingInfo().getCity());
    }

}
