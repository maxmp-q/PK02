package ha05.a1;

import ha05.a2.InvalidCustomerException;
import ha05.a2.InvalidShippingInfoException;
import ha05.a2.MissingShippingInfoException;

public class EComController {

    public static void main(String[] args) {
//        ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
//        Profile profile = new Profile(info);
//        Customer customer = new Customer(profile, 123);
//
//        System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
//
//        //Solution for 3)
//        Customer customer1 = new Customer(info, 123);
//        System.out.println("Shipping to: " + customer1.getShippingInfo().getCity());

        //Solution for a2
        try {
            ShippingInfo info2 = new ShippingInfo("Munich", 80331, "Germany");
            Profile profile2 = new Profile(info2);
            Customer customer2 = new Customer(profile2, 123);
            System.out.println("Shipping to: " + customer2.getProfile().getShippingInfo().getCity());
        } catch (InvalidShippingInfoException |
                 MissingShippingInfoException |
                 InvalidCustomerException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
