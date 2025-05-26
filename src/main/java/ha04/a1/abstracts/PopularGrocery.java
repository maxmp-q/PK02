package ha04.a1.abstracts;

public abstract class PopularGrocery extends GroceryItem {
    public int popularityLevel;
    public int quantity;

    public PopularGrocery(int popularityLevel){
        super();
        this.popularityLevel = popularityLevel;
        this.isPopular = true;
    }

    public boolean showWarning(){
        return quantity > householdLimit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

