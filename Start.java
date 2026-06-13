class FoodItem {
    String name;
    double price;

    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Burger extends FoodItem {
    int patties;

    Burger(String name, double price, int patties) {
        super(name, price);
        this.patties = patties;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Patties: " + patties);
    }
}

class Pizza extends FoodItem {
    String size;

    Pizza(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

   @Override void showDetails() {
        super.showDetails();
        System.out.println("Size: " + size);
    }
}

public class Start {
    public static void main(String[] args) {

        Burger b = new Burger("Cheese Burger", 350, 2);
        Pizza p = new Pizza("Chicken Pizza", 850, "Large");

        b.showDetails();

        System.out.println();

        p.showDetails();
    }
}