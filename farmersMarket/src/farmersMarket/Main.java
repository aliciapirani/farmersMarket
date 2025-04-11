package farmersMarket;

public class Main {
    public static void main(String[] args) {
        
    //testing inherited plant, jewelry, and produce classes with their overridden print info methods
    Plant tulip = new Plant(); 
    
    tulip.setName("Tulip");
    tulip.setDescription("Cup-shaped flowers that bloom in the Spring season.");
    tulip.setPrice(1.60);
    tulip.setFlowerColor("Pink");
    tulip.setHoursSunlightNeeded(6);
    tulip.setInchesWaterNeeded(0.14);
    
    tulip.printProductInfo();
    System.out.println();
    
    Jewelry necklace = new Jewelry(); 
    
    necklace.setName("Diamond Necklace");
    necklace.setDescription("Half carat natural diamond pendant necklace.");
    necklace.setPrice(599.00);
    necklace.setMaterial("White gold and natural diamond");
    
    necklace.printProductInfo();
    System.out.println();
    
    Produce lettuce = new Produce();
    
    lettuce.setName("Lettuce"); 
    lettuce.setDescription("Leafy green vegetable. Comes in different types such as romaine, iceberg, and butterhead");
    lettuce.setPrice(2.99);
    lettuce.setOrganic(false);
    
    lettuce.printProductInfo();

    }
}
