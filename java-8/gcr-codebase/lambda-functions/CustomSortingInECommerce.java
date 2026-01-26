package java8.lambda_functions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    Product(String name, double price, double rating) {
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    public String toString() {
        return name+" ₹"+price+" ⭐"+rating;
    }
}
public class CustomSortingInECommerce {
    public static void main(String[] args) {
        List<Product> products=Arrays.asList(
                new Product("Mobile",15000,4.5),
                new Product("Laptop", 55000,4.8),
                new Product("Headphones",2000,4.2)
        );
        products.sort((p1, p2)->Double.compare(p1.price,p2.price));
        System.out.println("Sorted by Price: "+products);
        products.sort((p1, p2) ->Double.compare(p2.rating,p1.rating));
        System.out.println("Sorted by Rating: "+products);
    }
}

