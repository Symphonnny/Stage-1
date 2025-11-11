import java.util.List;  
import java.util.ArrayList; 

public class Wishlist {
   
    private List<String> items;  

    public Wishlist() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) { // change to Product
        items.add(item);
    }

    public void removeItem(String item) { // change to Product
        items.remove(item);
    }

    public List<String> getItems() { // List<Product>
        return items;
    }

    public void setItems(List<String> items) { // List<Product>
        this.items = items;
    }

    public void clear() {
        items.clear();
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Nothing saved yet.");
        } else {
            System.out.println("In the wishlist:");
            for (String item : items) { //Product
                System.out.println(" - " + item);
            }
        }
    }


    public static void main(String[] args) {
        Wishlist list = new Wishlist();
        list.addItem("Laptop");
        list.addItem("Headphones");
        list.addItem("Watermelon"); 

        list.displayAll();

      
        list.removeItem("Headphones");
        System.out.println("\nremoving Headphones:");
        list.displayAll();


        list.clear();
        System.out.println("\nclearing the wishlist:");
        list.displayAll();
    }
}

class WishlistItem {
    private String productId;  // later should point to a Product
    private int quantity;

    public WishlistItem(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return productId + " (x" + quantity + ")";
    }
}
