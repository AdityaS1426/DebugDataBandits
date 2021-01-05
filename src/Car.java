// This class is for Car, which contains the elements of a car.
public class Car extends Vehicle implements Comparable<Car> {

    // Instance Variables
    private int model;
    private int maxRange;
    private double safetyRating;
    private boolean AWD;
    private double price;

    // Constant Variables for Car Types
    public static final int SEDAN = 0;
    public static final int SUV = 1;
    public static final int SPORTS = 2;
    public static final int MINIVAN = 3;

    // Constructors
    public Car(String mfr, String color, int power, int numWheels, int model, int maxRange, double safetyRating, boolean AWD, double price) {
        super(mfr, color, power, numWheels);
        this.model = model;
        this.maxRange = maxRange;
        this.safetyRating = safetyRating;
        this.AWD = AWD;
        this.price = price;
    }

    // Returns whether or not two cars are of the same type.
    // Boolean value if model and AWD are the same & both are equal.
    public boolean equals(Object other) {
        Car othCar = (Car) other;
        return super.equals(othCar) && this.model == othCar.model && this.AWD == othCar.AWD && this.safetyRating == othCar.safetyRating;
    }

     // This method for compares the prices.
     // The integers are 0, 1, & -1.
    public int compareTo(Car other) {
        if (this.price < other.price){
            return -1;
        }else if(this.price > other.price){
            return 1;
        }
        return 0;
    }

    // This displays cars in a formatted manner.
    // This is a formatted string.
    public String display() {
        return String.format("%s %-9s %-5d %-6.2f %-5s $%-10.2f %-15s", super.display(), modelType(this.model), this.maxRange, this.safetyRating, awdDisplay(this.AWD), this.price, super.powerType());
    }

    // This is a helper method to convert the model value to a string.
    // This is a string representing the model type.
    public String modelType(int model){
        if(model == 0){
            return "SEDAN";
        }else if(model == 1){
            return "SUV";
        }else if(model == 2){
            return "SPORTS";
        }else if(model == 3){
            return "MINIVAN";
        }
        return "";
    }

    // This helper method coverts AWD value to a string.
    public String awdDisplay(boolean awd){
        if (awd){
            return "AWD";
        }else{
            return "2WD";
        }
    }

    // Returns the model.
    public int getModel() {
        return model;
    }

    // The model is set here.
    public void setModel(int model) {
        this.model = model;
    }

    // Returns the variable "maxRange".
    public int getMaxRange() {
        return maxRange;
    }

    // The variable "maxRange" is set.
    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    // Returns the variable "safetyRating".
    public double getSafetyRating() {
        return safetyRating;
    }

    // The variable "safetyRating" is set.
    public void setSafetyRating(double safetyRating) {
        this.safetyRating = safetyRating;
    }

    // Returns the variable "AWD".
    public boolean isAWD() {
        return AWD;
    }

    // The variable "AWD" is set.
    public void setAWD(boolean aWD) {
        AWD = aWD;
    }

    // Returns the variable "price".
    public double getPrice() {
        return price;
    }

    // The variable "price" is set.
    public void setPrice(double price) {
        this.price = price;
    }
}
