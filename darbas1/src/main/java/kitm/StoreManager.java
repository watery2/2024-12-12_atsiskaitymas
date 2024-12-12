package kitm;

import java.util.LinkedList;
import java.util.ArrayList;

public class StoreManager {

    private ArrayList<Product> products = new ArrayList<>();
    private LinkedList<Customer> customers = new LinkedList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public void generateReport()
    {
        for (Customer i : customers)
        {
            System.out.println(i.getName() + " " + i.getEmail());

            i.getOrderStatistics();
        }

        System.out.println("Products");

        for (Product i : products)
        {
            System.out.println("| " + i.getCategory()+ " | " + i.getName() + " Price: " + i.getPrice() + " Stock: " + i.getStock());
        }
    }

    public void removerOutOfStock()
    {
        int i = 0;
        while (i != products.size())
        {
            if (products.get(i).getStock() == 0)
            {
                System.out.println("Removed" + products.get(i).getName());

                products.remove(i);

                i = 0;
                continue;
            }

            i++;
        }

    }
}
