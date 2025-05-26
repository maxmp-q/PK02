package ha05.a1;

import ha05.a2.MissingShippingInfoException;

public class Profile {
    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if(shippingInfo == null){
            throw new MissingShippingInfoException("ShippingInfo is missing");
        }
        this.shippingInfo = shippingInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
