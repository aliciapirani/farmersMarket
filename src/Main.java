public class Main {
    public static void main(String[] args) {
        
    //testing inherited plant, jewelry, and produce classes with their overridden print info methods
          Plant tulip = new Plant("Tulip", 1.60, 5, "Pink", 0.14, 6); 
        
          Jewelry necklace = new Jewelry("Diamond Necklace", 599.00, 2, "White gold and natural diamond");
        
          Produce lettuce = new Produce("Lettuce", 2.99, 5, false);

//        System.out.println(tulip);
//        System.out.println(necklace);
//        System.out.println(lettuce);

          Market market = new Market(); 

          
     	  Vendor flowerShop = new Vendor("Flower Shop"); 

     	  market.addVendor(flowerShop);
     	  
     	  flowerShop.addProduct(tulip);
     	  
     	  
//          flowerShop.sellProduct("tulip");
         
         
          
     	 
     	  market.run();
         
        
        
       

        

    }
}
