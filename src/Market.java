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
		while (true) { 
			System.out.println("\n" + "Welcome Customer! Please make a selection from the list below.");
			System.out.println("1. View Vendors and Products");
			System.out.println("2. Leave a Product Review");
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
				//LEFT OFF HERE
				
			}
			
			System.out.println("Thank you for visiting our Farmers Market!");
		}
			
	}
	
	//vendor menu
	private void vendorMenu() {
		
	}
}