package kitm;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct()
    {
        return product;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getSubtotal()
    {
        return quantity * product.getPrice();
    }

    public void applyDiscount()
    {
        product.applyDiscount(0.1);
        product.applyBulkDiscount(quantity, 0.2);
    }
}
