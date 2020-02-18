package ProductTest.java;

public final class Product {

    final String name;
    final String description;
    final double price;
    final int max;

    public Product(String name, String description, double price, int max) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.max = max;
    }

    public String toString(){
        return name + " " + description + " " + price +" " + max ;
    }

    public String getName() {
        System.out.print("Product name: ");
        return name;
    }

    public String getDescription() {
        System.out.print("Description: ");
        return description;
    }

    public double getPrice() {
        System.out.print("Price: ");
        return price;
    }

    public int getMax() {
        System.out.print("Max order: ");
        return max;
    }
}
