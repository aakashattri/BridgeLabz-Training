enum BookCategory { FICTION, NONFICTION, EDUCATIONAL }
enum ClothingCategory { MENS, WOMENS, KIDS }
enum GadgetCategory { MOBILE, LAPTOP, ACCESSORY }
class Product<T>{
    private String name;
    private double prize;
    private T category;
    Product(String name,double prize,T category){
        this.name=name;
        this.prize=prize;
        this.category=category;
    }
    public String getName() {
        return name;
    }
    public double getPrize() {
        return prize;
    }
    public T getCategory() {
        return category;
    }
    public void applyDiscount(double percentage) {
        prize=prize-(prize*percentage)/100;
    }
    @Override
    public String toString() {
        return name + " (" + category + ") - " + prize;
    }
}
class MarketplaceUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
}
public class DynamicOnlineMarketPlace {

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500.0, BookCategory.EDUCATIONAL);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 250.0, ClothingCategory.MENS);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 20000.0, GadgetCategory.MOBILE);
        System.out.println("Product Catalog:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(shirt, 5);
        MarketplaceUtil.applyDiscount(phone, 15);
        System.out.println("\nAfter Discounts:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}