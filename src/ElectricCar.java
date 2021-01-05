// This class contains all the elements of an electric car.
public class ElectricCar extends Car {

    // Instance Variables
    private int rechargeTime;
    private String batteryType;

    // Constructor Methods
    public ElectricCar(String mfr, String color, int power, int numWheels, int model, int maxRange, double safetyRating, boolean AWD, double price, int rechargeTime, String batteryType) {
        super(mfr, color, power, numWheels, model, maxRange, safetyRating, AWD, price);
        this.rechargeTime = rechargeTime;
        this.batteryType = batteryType;
    }

    // Displays cars in a formatted manner.
    // Displays as a string variable.
    public String display() {
        return String.format("%s %-3d %s", super.display(), this.rechargeTime, this.batteryType);
    }

    // Returns the variable "batteryType".
    public String getBatteryType() {
        return batteryType;
    }

    // The variable "batteryType" is set.
    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

   // Returns the variable "rechargeTime".
    public int getRechargeTime() {
        return rechargeTime;
    }

    // The variable "rechargeTime" is set.
    public void setRechargeTime(int rechargeTime) {
        this.rechargeTime = rechargeTime;
    }
}