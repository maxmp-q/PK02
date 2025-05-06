package ha04.a1.abstracts;

public abstract class Article {

    public int discountThreshold;
    public int householdLimit;

    public abstract int getBulkDiscount();
    public abstract boolean showWarning();
}
