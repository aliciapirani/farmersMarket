public class Main {
    public static void main(String[] args) {
        
          //testing run method in market.java with pre-loaded data we added 
          Plant tulips = new Plant("Tulip", 1.60, 5, "Pink", 0.14, 6); 
          Plant roses = new Plant("Roses", 1.80, 6, "Red", 2.00, 6); 
          Plant lilies = new Plant("Lilies", 1.80, 4, "White", 1.00, 6); 
        
          Jewelry necklaces = new Jewelry("Beaded Necklace", 29.99, 3, "String and Beads");
          Jewelry bracelets = new Jewelry("Engraved Bracelet", 49.99, 2, "Sterling Silver");
          Jewelry earrings = new Jewelry("Flower Earrings", 19.99, 5, "Yellow Gold");
        
          Produce lettuce = new Produce("Lettuce", 1.50, 5, false);
          Produce carrots = new Produce("Carrots", 0.25, 7, true);
          Produce onions = new Produce("Onions", 0.95, 6, false);
          Produce apples = new Produce("Apples", 0.60, 8, true);
          Produce bananas = new Produce("Bananas", 0.35, 10, true);
          Produce pears = new Produce("Pears", 0.95, 4, false);

          Market market = new Market(); 

     	  Vendor flowerAndPlantShop = new Vendor("Flower & Plant Shop"); 
     	  Vendor jewelryShop = new Vendor("Jewelry Shop"); 
     	  Vendor produceShop = new Vendor("Produce Shop"); 

     	  market.addVendor(flowerAndPlantShop);
     	  market.addVendor(jewelryShop);
     	  market.addVendor(produceShop);
     	  
     	  flowerAndPlantShop.addProduct(tulips);
     	  flowerAndPlantShop.addProduct(roses);
     	  flowerAndPlantShop.addProduct(lilies);
     	  
     	  jewelryShop.addProduct(necklaces);
     	  jewelryShop.addProduct(bracelets);
     	  jewelryShop.addProduct(earrings);
     	 
     	  produceShop.addProduct(lettuce);  
     	  produceShop.addProduct(carrots);;  
     	  produceShop.addProduct(onions);
     	  produceShop.addProduct(apples);
     	  produceShop.addProduct(bananas);
     	  produceShop.addProduct(pears);
          	 
     	  market.run();   
    
    }
}
