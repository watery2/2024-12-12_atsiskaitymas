package kitm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Electronics electronics1 = new Electronics("Computer", 500.25, "Electronics", 45, 120);
        Electronics electronics2 = new Electronics("Mouse", 100.50, "Electronics", 12, 60);
        Electronics electronics3 = new Electronics("Moniter", 250.40, "Electronics", 21);

        Clothing clothing1 = new Clothing("Sweater", 45, "Clothing", 3, "m");
        Clothing clothing2 = new Clothing("Pants", 64.50, "Clothing", 13, "s");
        Clothing clothing3 = new Clothing("Shirt", 20.50, "Clothing", 15, "xl");

        StoreManager storeManager = new StoreManager();

        storeManager.addProduct(electronics1);
        storeManager.addProduct(electronics2);
        storeManager.addProduct(electronics3);

        storeManager.addProduct(clothing1);
        storeManager.addProduct(clothing2);
        storeManager.addProduct(clothing3);

        Customer customer1 = new Customer("Jack", "Jack@gmail.com");
        Order order1 = new Order(123);
        order1.addProduct(electronics1, 20);
        order1.addProduct(electronics1, 6);
        order1.addProduct(clothing2, 10);
        customer1.placeOrder(order1);

        Order order2 = new Order(1234);
        order2.addProduct(electronics2, 20);
        order2.addProduct(electronics3, 6);
        order2.addProduct(clothing1, 3);

        customer1.placeOrder(order2);

        storeManager.addCustomer(customer1);

        storeManager.generateReport();

        storeManager.removerOutOfStock();

        storeManager.generateReport();

        ArrayList<Product> filterdedBycategory = ProductFilters.filterByCategory(storeManager.getProducts(), "Clothing");

        for (Product i : filterdedBycategory)
        {
            System.out.println(i.getName() + " " + i.getPrice() + "$");
        }

        ArrayList<Product> filterdedByPrice = ProductFilters.filterByPrice(storeManager.getProducts(), 30, 260);

        for (Product i : filterdedByPrice )
        {
            System.out.println("| " + i.getCategory() + " | " + i.getName() + " " + i.getPrice() + "$");
        }
    }
}