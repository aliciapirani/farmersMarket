public class Customer {

    private String name;

    //constructor
    public Customer(String name) {
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //method to leave a review for a product
    public void leaveReview(Product product, int rating) {
        product.addReview(null, rating);  //adds the review if it's valid
        System.out.println("Thank you for leaving a review for " + product.getName());
    } 
   }
