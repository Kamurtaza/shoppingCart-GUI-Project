package my.shoppingcart;

public class Node {
    //Data
    String name;
    double price;
    String[] availableColors;
    boolean hasColor;
    
    //Pointers
    Node next;
    Node prev;
    
    //Constructors
    public Node(double price, String name, String[] availableColors, boolean hasColor) {
        this.price = price;
        this.name = name;
        this.availableColors = availableColors;
        this.hasColor = hasColor;
    }
    
    public Node() {}
    
    //Getters
    public String itemString() {
        return "Item name: " + this.name + "\nItem price: $" + this.price;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public String[] getAvailableColors() {
        return this.availableColors;
    }
}
