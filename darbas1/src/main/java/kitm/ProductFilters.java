package kitm;

import java.util.ArrayList;

public class ProductFilters {

    public static ArrayList<Product> filterByCategory(ArrayList<Product> products, String category)
    {
        ArrayList<Product> filtered = new ArrayList<>();

        for (Product i : products)
        {
            if (i.getCategory().equals(category))
            {
                filtered.add(i);
            }
        }

        return filtered;
    }

    public static ArrayList<Product> filterByPrice(ArrayList<Product> products, double min, double max)
    {
        ArrayList<Product> filtered = new ArrayList<>();

        for (Product i : products)
        {
            if (i.getPrice() > min && i.getPrice() < max)
            {
                filtered.add(i);
            }
        }

        return filtered;

    }
}
