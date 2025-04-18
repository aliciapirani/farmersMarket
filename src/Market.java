import java.util.ArrayList;
import java.util.HashMap;
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
			else if (role == 2) vendorMenu();
		}
		
		System.out.println("Thank you for visiting our Farmers Market!");
	}
	
	//customer menu
	private void customerMenu() {
	    //esure Customer object is properly initialized
	    System.out.println("Enter your name: ");
	    String customerName = scnr.nextLine(); //prompt customer to enter their name
	    Customer customer = new Customer(customerName);  //initialize the customer with the provided name

	    while (true) {
	        System.out.println("\n" + "Welcome " + customerName + "! Please make a selection from the list below.");
	        System.out.println("1. View Vendors and Products");
	        System.out.println("2. Leave a Product Review or View Average Review Score");
	        System.out.println("3. Back");
	        System.out.println("Choose: ");
	        int choice = scnr.nextInt();
	        scnr.nextLine(); //consume the newline character
	        
	        if (choice == 3) break;

	        else if (choice == 1) {
	            if (vendors.isEmpty()) {
	                System.out.println("No vendors available.");
	                continue;
	            }

	            System.out.println("\nVendor List: ");
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
	            System.out.println("\nProduct from " + selectedVendor.getName() + ":");
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

	                //call addReview method from product class and pass the customer object
	                selectedProduct.addReview(customer, rating);  
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
	    Vendor vendor = new Vendor("Vendor1"); //add real vendor objects when integrated with the main system
	    
	    	while (true) { 
	    		System.out.println("\n" + "Welcome Vendor! Please make a selection from the list below.");
	    		System.out.println("1. View Inventory");
	    		System.out.println("2. Sell Product");
	    		System.out.println("3. View Product Reviews and Average Rating");
	    		System.out.println("4. Back");
	    		System.out.print("Choose: ");
	    		int choice = scnr.nextInt();
	    		scnr.nextLine();  //consume the newline character
	        
	        if (choice == 4) {
	        	break;  //go back to the main menu
	        	}

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
			
	        } else if (choice == 2) {
	            if (vendors.isEmpty()) {
	                System.out.println("No vendors available.");
	                continue;
	            }

	            System.out.println("\nVendor List:");
	            for (int i = 0; i < vendors.size(); i++) {
	                System.out.println((i + 1) + ". " + vendors.get(i).getName());
	            }

	            System.out.println("Select your vendor number: ");
	            int vendorIndex = scnr.nextInt() - 1;
	            scnr.nextLine();

	            if (vendorIndex < 0 || vendorIndex >= vendors.size()) {
	                System.out.println("Invalid vendor selection.");
	                continue;
	            }

	            Vendor selectedVendor = vendors.get(vendorIndex);
	            HashMap<String, Product> inventory = selectedVendor.getInventory();

	            if (inventory.isEmpty()) {
	                System.out.println("Your inventory is empty.");
	                continue;
	            }

	            ArrayList<Product> productList = new ArrayList<>(inventory.values());

	            System.out.println("\nSelect a product to sell:");
	            for (int i = 0; i < productList.size(); i++) {
	                Product p = productList.get(i);
	                System.out.printf("%d. %s (Stock: %d)\n", i + 1, p.getName(), p.getStock());
	            }

	            System.out.print("Enter product number to sell: ");
	            int productIndex = scnr.nextInt() - 1;
	            scnr.nextLine();

	            if (productIndex < 0 || productIndex >= productList.size()) {
	                System.out.println("Invalid product selection.");
	                continue;
	            }

	            Product selectedProduct = productList.get(productIndex);
	            selectedVendor.sellProduct(selectedProduct.getName());
	        } else if (choice == 3) {
	            if (vendors.isEmpty()) {
	                System.out.println("No vendors available.");
	                continue;
	            }

	            //list vendors
	            System.out.println("\nVendor List:");
	            for (int i = 0; i < vendors.size(); i++) {
	                System.out.println((i + 1) + ". " + vendors.get(i).getName());
	            }

	            //select vendor
	            System.out.print("Select vendor by number: ");
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

	            //list products
	            System.out.println("\nProducts:");
	            for (int i = 0; i < productList.size(); i++) {
	                System.out.println((i + 1) + ". " + productList.get(i).getName());
	            }

	            //select product
	            System.out.print("Select product by number: ");
	            int productIndex = scnr.nextInt() - 1;
	            scnr.nextLine();

	            if (productIndex < 0 || productIndex >= productList.size()) {
	                System.out.println("Invalid product selection.");
	                continue;
	            }

	            Product selectedProduct = productList.get(productIndex);

	            //displays reviews and average rating for products
	            double avgRating = selectedProduct.getAverageRating();
	            if (avgRating == 0) {
	                System.out.println("This product has not received any reviews yet.");
	            } else {
	                System.out.printf("Average rating for %s: %.2f stars\n", selectedProduct.getName(), avgRating);
	                System.out.println("All ratings:");
	                for (int rating : selectedProduct.reviews) {
	                    System.out.println("- " + rating + " stars");
	                }
	            }
	        }
	    }
	}
}