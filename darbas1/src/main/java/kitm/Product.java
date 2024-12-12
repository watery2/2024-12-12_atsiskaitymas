package kitm;

public abstract class Product implements Discauntable{

    protected String productName;
    protected double price;
    protected String category;
    protected int stock;

    public abstract double getPrice();
    public abstract String getName();
    public abstract String getCategory();
    public abstract int getStock();
    public abstract void setStock(int stock);

    public abstract void applyDiscount(double discount);

    public abstract void applyBulkDiscount(int num, double discount);
}
