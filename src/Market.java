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

	private void customerMenu() {
		// TODO Auto-generated method stub
		
	}
	
	private void vendorMenu() {
		// TODO Auto-generated method stub
		
	}
}