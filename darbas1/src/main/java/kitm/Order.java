package kitm;

import java.util.LinkedList;

public class Order {

    private int orderID;
    LinkedList<OrderItem> orderItems = new LinkedList<>();

    public Order(int orderID)
    {
        this.orderID = orderID;
    }

    public int getId()
    {
        return orderID;
    }

    public LinkedList<OrderItem> getOrderItems()
    {
        return orderItems;
    }

    public void addProduct(Product product, int num)
    {
        if (product.getStock() - num >= 0)
        {
            orderItems.add(new OrderItem(product, num));
            product.setStock(product.getStock() - num);
        }
        else
        {
            System.out.println("We don't have that many in stock");
        }
    }

    public double calculateTotal()
    {
        double total = 0;

        for (OrderItem i : orderItems)
        {
            total += i.getSubtotal();
        }

        return total;
    }

    public void applyDiscount()
    {
        for (OrderItem i : orderItems)
        {
            i.applyDiscount();
        }
    }
}
