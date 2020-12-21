
 // This contains all the features of the car for the simulator.


public class CarFeatures extends Vehicle implements Comparable<CarFeatures> {

    // standard variables
    private int model;
    private int maxRange;
    private boolean AWD;
    private double price;

    // these variables remain the same for all car types
    public static final int SEDAN = 0;
    public static final int SUV = 1;
    public static final int SPORTS = 2;
    public static final int COUPE = 3;


   // constructor methods for different variables
    public CarFeatures(String color, int power, int model, int maxRange, boolean AWD, double price) {
        super(color, power);
        this.model = model;
        this.maxRange = maxRange;
        this.AWD = AWD;
        this.price = price;
    }


    //returns boolean value if the drivetrain and car model are equal
    public boolean equals(Object other) {
        CarFeatures othCar = (CarFeatures) other;
        return super.equals(othCar) && this.model == othCar.model && this.AWD == othCar.AWD
    }

    //this method compares the price of the cars
    public int compareTo(CarFeatures other) {
        if (this.price < other.price){
            return -1;
        }else if(this.price > other.price){
            return 1;
        }
        return 0;
    }




    //this method converts integer model values to a string e.g. 0 inserted will return SEDAN
    public String modelType(int model){
        if(model == 0){
            return "SEDAN";
        }else if(model == 1){
            return "SUV";
        }else if(model == 2){
            return "SPORTS";
        }else if(model == 3){
            return "COUPE";
        }
        return "";
    }

    //converts the value of the drivetrain awd or 2wd to a string
    public String awdDisplay(boolean awd){
        if (awd){
            return "AWD";
        }else{
            return "2WD";
        }
    }

    //returns the car model
    public int getModel() {
        return model;
    }

    //the car model is set in this code here
    public void setModel(int model) {
        this.model = model;
    }

    // the max range integer is returned here
    public int getMaxRange() {
        return maxRange;
    }

    // the max range integer is set here
    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }


    //AWD value is returned here
    public boolean isAWD() {
        return AWD;
    }

    //value for AWD is set here
    public void setAWD(boolean aWD) {
        AWD = aWD;
    }

    //returns the price variable
    public double getPrice() {
        return price;
    }

    // the price variable is set here
    public void setthePrice(double price) {
        this.price = price;
    }
}
