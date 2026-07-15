import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");
        Product p1 = SearchService.linearSearch(products, "Phone");
        System.out.println(p1);

        Arrays.sort(products, Comparator.comparing(product -> product.productName));

        System.out.println("\nBinary Search:");
        Product p2 = SearchService.binarySearch(products, "Phone");
        System.out.println(p2);
    }
}