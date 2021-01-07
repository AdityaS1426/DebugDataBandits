import java.lang.Math;
public class Vehicle
{
    public enum PowerSource
    {
        GAS_ENGINE, DIESEL_ENGINE, ELECTRIC_MOTOR;
    }

    public PowerSource power;
    String manuf;
    String color;
    int    numWheels;
    int VIN; // Vehicle Identification Number

    /**
     * Constructor initializes the variables. The VIN is randomly generated.
     */
    public Vehicle()
    {
        this.manuf = "";
        VIN = 100 + (int)(Math.random() * 400);
    }

    public Vehicle(String manuf, String color, int numWheels, PowerSource power)
    {
        this.manuf     = manuf;
        this.color     = color;
        this.numWheels = numWheels;
        this.power     = power;
        VIN = 100 + (int)(Math.random() * 400);
    }

    /**
     * Displays the vehicle information.
     */
    public String display()
    {
        if (manuf.length() < 4)
        {
            return VIN + "\t" + manuf + "     \t" + color;
        }
        return VIN + "\t" + manuf + "    \t" + color;
    }

    /**
     * Checks if vehicles are equal to each other.
     */
    public boolean equals(Object other)
    {
        Vehicle otherV = (Vehicle) other;
        return power == otherV.power && manuf.equals(otherV.manuf) && numWheels == otherV.numWheels;
    }

    public int getVIN()
    {
        return this.VIN;
    }
}
