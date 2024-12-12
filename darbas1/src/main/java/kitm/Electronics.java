package kitm;

public class Electronics extends Product{

    private int warrantyPeriodDays;

    public Electronics(String productName, double price, String category, int stock, int warrantyPeriodDays)
    {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.warrantyPeriodDays = warrantyPeriodDays;
    }

    public Electronics(String productName, double price, String category, int stock)
    {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.warrantyPeriodDays = 0;
    }

    public void checkWarranty()
    {
        System.out.println("Warranty has this many days left: " + warrantyPeriodDays);
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return productName;
    }

    public String getCategory()
    {
        return category;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public void applyDiscount(double discount)
    {
        price = price - (price * discount);
    }

    public void applyBulkDiscount(int num, double discount)
    {
        if (num > 15)
        {
            price = price - (price * discount);
        }
    }
}
