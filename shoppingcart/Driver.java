package my.shoppingcart;

public class Driver {
    
    //Initialize empty list; to be used with wishlist and cart on startup
    public LinkedList createEmptyList() {
        LinkedList emptyList = new LinkedList();
        return emptyList;
    }
    
    
    //Creates new node object from given arguments and adds it to the end of the list
    public void pushBack(LinkedList list, double price, String name, String[] availableColors, boolean hasColor) {
        Node newNode = new Node();
        newNode.price = price;
        newNode.name = name;
        newNode.availableColors = availableColors;
        newNode.hasColor = hasColor;
        
        if (list.head == null) {
            list.head = newNode;
            newNode.next = list.head;
            newNode.prev = list.head;
        }
        else {
            Node temp = new Node();
            temp = list.head;
            while (temp.next != list.head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = list.head;
            newNode.prev = temp;
            list.head.prev = newNode;
        }
    }
    
    //Same as above, accepts node object as argument
    public void pushBack(LinkedList list, Node node) {
        Node newNode = new Node();
        newNode.price = node.price;
        newNode.name = node.name;
        newNode.availableColors = node.availableColors;
        newNode.hasColor = node.hasColor;
        
        if (list.head == null) {
            list.head = newNode;
            newNode.next = list.head;
            newNode.prev = list.head;
        }
        else {
            Node temp = new Node();
            temp = list.head;
            while (temp.next != list.head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = list.head;
            newNode.prev = temp;
            list.head.prev = newNode;
        }
    }
    
    //Remove specified node from any specified point in the list
    public void removeNodeAt(LinkedList list, int pos) {
        Node temp = list.head;
        int numElements = countNodes(list);
        
        if (pos == 1) {
            if (numElements == 1) {
                list.head = null;
            }
            else {
                list.head = temp.next;
                temp.prev.next = list.head;
                temp.next.prev = temp.prev;
            }
        }
        else {
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
    
    //Creates a new node object and inserts it into the list at the specified position pos
    public void pushAt(LinkedList list, Node node, int pos, boolean hasColor) {
        Node temp = list.head;
        int numElements = countNodes(list);
        Node newNode = new Node();
        newNode.price = node.price;
        newNode.name = node.name;
        newNode.availableColors = node.availableColors;
        newNode.hasColor = node.hasColor;
        
        if (pos == 1) {
            list.head = newNode;
            temp.prev.next = list.head;
            temp.next.prev = temp.prev;
        }
        else {
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            temp.prev.next = newNode;
            temp.next.prev = newNode;
        }
    }
    
    //Creates initial list of items to display
    public LinkedList createTestList() {
        LinkedList list = createEmptyList();
        pushBack(list, 109.94, "Shoes", setDefaultAvailableColors(), true);
        pushBack(list, 6.91, "Chocolate", setDefaultAvailableColors(), false);
        pushBack(list, 9.89, "Poster", setDefaultAvailableColors(), true);
        pushBack(list, 56.99, "Table", setDefaultAvailableColors(), true);
        pushBack(list, 897.91, "Laptop", setDefaultAvailableColors(), true);
        pushBack(list, 24.49, "Backpack", setDefaultAvailableColors(), true);
        pushBack(list, 8.94, "Phone Case", setDefaultAvailableColors(), true);
        pushBack(list, 90.94, "Wire Cutters", setDefaultAvailableColors(), true);
        pushBack(list, 4.94, "Mug", setDefaultAvailableColors(), true);
        pushBack(list, 89.19, "Speaker", setDefaultAvailableColors(), false);
        pushBack(list, 59.85, "1TB SSD", setDefaultAvailableColors(), false);
        pushBack(list, 19.99, "Encyclopedia", setDefaultAvailableColors(), false);
        pushBack(list, 5.97, "Pillow", setDefaultAvailableColors(), true);
        pushBack(list, 240.84, "Mayonnaise", setDefaultAvailableColors(), false);
        return list;
    }
    
    //Counts total number of nodes present in the list
    public int countNodes(LinkedList list) {
        Node temp = new Node();
        temp = list.head;
        int i = 0;
        if (temp != null) {
            i++;
            temp = temp.next;
        }
        while (temp != list.head) {
            i++;
            temp = temp.next;
        }
        return i;
    }
    
    //Returns the name value of the node at position pos
    public String getNameAt(LinkedList list, int pos) {
        Node temp = list.head;
        int numElements = countNodes(list);
        
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        
        return temp.getName();
    }
    
    //Returns the node object at position pos
    public Node returnNodeAt(LinkedList list, int pos) {
        Node temp = list.head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    //Used when creating item objects
    //Sets default values for availableColors String array
    public String[] setDefaultAvailableColors() {
        String[] colors = {"Choose color:", "Red", "Blue", "Green", "Yellow", "Purple", "Orange", "Black", "Gray"};
        return colors;
    }
    
    //Returns total cost of all nodes in list based on price and quantity
    public double getTotalValue(LinkedList list) {
        Node temp = list.head;
        double total = 0.00;
        if (temp != null) {
            total += temp.getPrice();
            temp = temp.next;
        }
        while (temp != list.head) {
            total += temp.getPrice();
            temp = temp.next;
        }
        return total;
    }
    
    //Prints name and price of node at given position
    public void printNode(LinkedList list, int pos) {
        Node temp = list.head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        System.out.printf("Name: %s\nPrice: $%.2f\n\n", temp.getName(), temp.getPrice());
    }
    
}
