
import java.util.ArrayList;

abstract class WarehouseItem<T>{
    String name;
    WarehouseItem(String name) {
        // TODO Auto-generated constructor stub
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}
class Storage<T extends WarehouseItem> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}
class WarehouseUtil {
    public static void displayItems(ArrayList<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
public class SmartWareHouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage=new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Tablet"));

        Storage<Groceries> groceriesStorage=new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage=new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics in Warehouse:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries in Warehouse:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture in Warehouse:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}