import java.util.HashMap;
import java.util.Map;

public class Vendor {
   private String name;
   private HashMap<String, Product> inventory;
   private int totalItemsSold;
   public Vendor(String name) {
       this.name = name;
       this.inventory = new HashMap<>();
       this.totalItemsSold = 0;
   }
   public void addProduct(Product product) {
       inventory.put(product.getName(), product);
   }
   //decrease quantity instead of deleting
   public Product sellProduct(String productName) {
       Product product = inventory.get(productName);
       if (product == null) {
           System.out.println("Product not found.");
           return null;
       }
       if (product.getStock() > 1) {
           product.setStock(product.getStock() - 1);
           totalItemsSold++;
           System.out.println("Sold 1 unit of " + productName + ". Remaining stock: " + product.getStock());
       } else {
           inventory.remove(productName);
           totalItemsSold++;
           System.out.println("Sold final unit of " + productName + ". Product removed from inventory.");
       }
       return product;
   }
   public void displayInventory() {
       if (inventory.isEmpty()) {
           System.out.println("No products available.");
           return;
       }
       for (Map.Entry<String, Product> entry : inventory.entrySet()) {
           System.out.println(entry.getValue());
       }
   }
   public void displayProductReviews() {
       System.out.println("Product reviews feature coming soon!");
   }
   public void displayTotalSales() {
       System.out.println("Total items sold by " + name + ": " + totalItemsSold);
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public HashMap<String, Product> getInventory() {
       return inventory;
   }
}
