import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

// This class is for Transaction which containes all elements of a Tansaction

public class Transaction {
    // Instance Variables
    private int transactionid;
    private GregorianCalendar date;
    private String salesPerson;
    private Car car;
    private String type;
    private double price;


    // Constructor Method
    public Transaction(int transactionid, GregorianCalendar date, Car car, String salesPerson, String type, double price){
        this.transactionid = transactionid;
        this.date = date;
        this.car = car;
        this.salesPerson = salesPerson;
        this.type = type;
        this.price = price;
    }

    // A String of formatted text for the transaction to be displayed.
    public String display() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM dd, yyyy");
        return "Date: "+ sdf.format(date.getTime()) + "     Sales Person: " + salesPerson + "\nTransaction ID: " + transactionid + "          Sale Type: " + type + "\nItem:\n------------------------------------------------\nCar VIN: " +car.getVIN() + "                          $" + String.format("%.2f",price) + "\n------------------------------------------------";
    }

    // Returns the transaction ID.
    public int getTransactionid() {
        return transactionid;
    }

    // The transaction ID to be set.
    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }

    // Return the data.
    public GregorianCalendar getDate() {
        return date;
    }

    // The date to be set.
    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    // Return the sales person.
    public String getSalesPerson() {
        return salesPerson;
    }

    // The sales person to be set.
    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    // The car to be set.
    public void setCar(Car car) {
        this.car = car;
    }

    // Returns the type.
    public String getType() {
        return type;
    }

    // The type to be set.
    public void setType(String type) {
        this.type = type;
    }

   // Return the price.
    public double getPrice() {
        return price;
    }

    // The price to be set.
    public void setPrice(double price) {
        this.price = price;
    }

    // Return the car.
    public Car getCar() {
        return car;
    }
}