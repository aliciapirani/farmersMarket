import java.util.ArrayList;
import java.util.Scanner;

public class Market {

	private ArrayList<Vendor> vendors = new  ArrayList<>();
	private Scanner scnr = new Scanner(System.in);
	
	//add a new vendor object to the arrayList of vendors 
	public void addVendor(Vendor vendor) { 
		vendors.add(vendor);
	}
	
	//choose if you are a customer or vendor 
	public void run() { 
		System.out.println("Welcome to our Farmers Market!" + "\n" + "Created by: Alicia Pirani, Ella Tedesco, and Peyton Strickland." + "\n");
		
		while (true) { 
			System.out.println("Are you a:");
			System.out.println("1. Customer");
			System.out.println("2. Vendor");
			System.out.println("3. Exit");
			System.out.println("Selected: ");
			int role = scnr.nextInt();
			scnr.nextLine();
			
			if (role == 3) break;
			else if (role == 1) customerMenu();
			else if (role == 1) vendorMenu();
		}
		
		System.out.println("Thank you for visiting our Farmers Market!");
	}

	//customer menu 
	private void customerMenu() {
		Customer customer = new Customer("Guest");

		while (true) { 
			System.out.println("\n" + "Welcome Customer! Please make a selection from the list below.");
			System.out.println("1. View Vendors and Products");
			System.out.println("2. Leave a Product Review or View Reviews");
			System.out.println("3. Back");
			System.out.println("Choose: ");
			int choice = scnr.nextInt();
			scnr.nextLine();
			
			if (choice == 3) break;
			
			else if (choice == 1) {
				if (vendors.isEmpty()) {
					System.out.println("No vendors available.");
					continue;
				} 
				
				System.out.println("\n" + "Vendor List: ");
				for (int i = 0; i < vendors.size(); i++) {
					System.out.println((i + 1) + ". " + vendors.get(i).getName());
				}
				
				System.out.println("Select vendor by number: ");
				int vendorIndex = scnr.nextInt() - 1;
				scnr.nextLine();
				
				if (vendorIndex < 0 || vendorIndex >= vendors.size()) {
					System.out.println("Invalid vendor selection.");
					continue;
				}
				
				Vendor selectedVendor = vendors.get(vendorIndex);
				System.out.println("\n" + "Product from " + selectedVendor.getName() + ":");
				selectedVendor.displayInventory();
			}
			
			else if (choice == 2) {
			    if (vendors.isEmpty()) {
			        System.out.println("No vendors available.");
			        continue;
			    }

			    System.out.println("\nVendor List:");
			    for (int i = 0; i < vendors.size(); i++) {
			        System.out.println((i + 1) + ". " + vendors.get(i).getName());
			    }

			    System.out.println("Select vendor by number: ");
			    int vendorIndex = scnr.nextInt() - 1;
			    scnr.nextLine();

			    if (vendorIndex < 0 || vendorIndex >= vendors.size()) {
			        System.out.println("Invalid vendor selection.");
			        continue;
			    }

			    Vendor selectedVendor = vendors.get(vendorIndex);
			    ArrayList<Product> productList = new ArrayList<>(selectedVendor.getInventory().values());

			    if (productList.isEmpty()) {
			        System.out.println("No products available from this vendor.");
			        continue;
			    }

			    System.out.println("\nProducts:");
			    for (int i = 0; i < productList.size(); i++) {
			        System.out.println((i + 1) + ". " + productList.get(i).getName());
			    }

			    System.out.println("Select product by number: ");
			    int productIndex = scnr.nextInt() - 1;
			    scnr.nextLine();

			    if (productIndex < 0 || productIndex >= productList.size()) {
			        System.out.println("Invalid product selection.");
			        continue;
			    }

			    Product selectedProduct = productList.get(productIndex);

			    System.out.println("Would you like to:");
			    System.out.println("1. Leave a review");
			    System.out.println("2. View average rating");
			    int reviewChoice = scnr.nextInt();
			    scnr.nextLine();

			    if (reviewChoice == 1) {
			        System.out.println("Enter a rating from 1 to 5: ");
			        int rating = scnr.nextInt();
			        scnr.nextLine();

			     // Allow customer to leave review even without purchase
                    customer.leaveReview(selectedProduct, rating);
                } else if (reviewChoice == 2) {
                    double avg = selectedProduct.getAverageRating();
                    if (avg == 0) {
                        System.out.println("No reviews yet for this product.");
                    } else {
                        System.out.printf("Average rating: %.2f stars\n", avg);
                    }
                } else {
                    System.out.println("Invalid option.");
                }
            }
        }
    }

	
	//vendor menu
	private void vendorMenu() {
		
	}
}