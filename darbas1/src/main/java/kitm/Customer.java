package kitm;

import java.util.LinkedList;

public class Customer {
    private String name;
    private String email;

    LinkedList<Order> orderHistory = new LinkedList<>();

    public Customer(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void placeOrder(Order order)
    {
        if (findOrder(order.getId()) == null)
        {
            orderHistory.add(order);
        }
        else
        {
            System.out.println("This Order already exist");
        }
    }

    public Order findOrder(int ID)
    {
        for (Order i : orderHistory)
        {
            if (i.getId() == ID)
            {
                return i;
            }
        }

        return null;
    }

    public void getOrderStatistics()
    {
        for (Order i : orderHistory)
        {
            LinkedList<OrderItem> orderItems = i.getOrderItems();

            System.out.println("ID: " + i.getId());

            for (OrderItem j : orderItems)
            {
                Product product = j.getProduct();

                System.out.println("Name: " + product.getName() + " Quantity: " + j.getQuantity() + " Price: " + product.getPrice());
            }
        }
    }

}
