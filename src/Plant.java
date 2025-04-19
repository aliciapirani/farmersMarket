public class Plant extends Product {
    
	private String flowerColor;
	private double inchesWaterNeededPerWeek; 
	private int hoursSunlightNeededPerDay;
	
	//constructor 
	public Plant(String name, double price, int stock, String flowerColor, double inchesWaterNeededPerWeek, int hoursSunlightNeededPerDay) { 
		super(name, price, stock);
		this.flowerColor = flowerColor; 
		this.inchesWaterNeededPerWeek = inchesWaterNeededPerWeek; 
		this.hoursSunlightNeededPerDay = hoursSunlightNeededPerDay;
	}
	
	//generate getters and setters
	public String getFlowerColor() {
		return flowerColor;
	}

	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}

	public double getInchesWaterNeededPerWeek() {
		return inchesWaterNeededPerWeek;
	}

	public void setInchesWaterNeededPerWeek(double inchesWaterNeededPerWeek) {
		this.inchesWaterNeededPerWeek = inchesWaterNeededPerWeek;
	}

	public int getHoursSunlightNeededPerDay() {
		return hoursSunlightNeededPerDay;
	}

	public void setHoursSunlightNeededPerDay(int hoursSunlightNeeded) {
		this.hoursSunlightNeededPerDay = hoursSunlightNeeded;
	}
	
	
	//print method from product that has been overridden based on plant class
	@Override
	public String toString() { 
		String outputString = "";
		outputString += super.toString();
		outputString += "Flower Color: " + flowerColor + "\n" + "Inches of water needed per week: " + inchesWaterNeededPerWeek +" inches" + "\n" + "Hours of sunlight needed per day: " + hoursSunlightNeededPerDay + " hours" + "\n";
		return outputString;
		
	}

}
