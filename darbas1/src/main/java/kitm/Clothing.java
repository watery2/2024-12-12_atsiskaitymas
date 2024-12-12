package kitm;

public class Clothing extends Product{

    private String size;

    public Clothing(String productName, double price, String category, int stock, String size)
    {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.size = size;
    }

    public void getSizeDetail()
    {
        System.out.println("The size of the clothes is: " + size);
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
        if (num > 30)
        {
            price = price - (price * discount);
        }
    }
}
