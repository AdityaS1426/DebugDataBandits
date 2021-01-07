import java.util.TreeMap;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Map;

public class Transaction
{

    static int transactionID;
    static GregorianCalendar date;
    static Car car;
    static String salesPerson;
    static double price;
    public Map<String, Object> infoMap;

    public enum TransactionType
    {
        BUY, RETURN;
    }
    public static TransactionType type;

    /**
     * When a transaction object is made, a map for that transaction is created, where the given values are stored.
     */
    public Transaction(int transactionID2, GregorianCalendar date2, Car car2, String salesPerson2, TransactionType type2, double price2)
    {
        transactionID = transactionID2;
        date = date2;
        car = car2;
        salesPerson = salesPerson2;
        type = type2;
        price = price2;


        infoMap = new TreeMap<String, Object>();
        infoMap.put("ID", transactionID);
        infoMap.put("Date", date);
        infoMap.put("Car", car);
        infoMap.put("SP", salesPerson);
        infoMap.put("Type", type);
        infoMap.put("Price", price);

    }

    /**
     * Displays the transaction information.
     */
    public String display()
    {
        String formatdate = date.toZonedDateTime().format(DateTimeFormatter.ofPattern("d MMM uuuu"));
        return
                "------------------------------\n"
                        + "[Transaction]\t[ID: " + transactionID + "]\n"
                        + "\nDate:\t\t" + formatdate
                        + "\nType:\t\t" + type
                        + "\nSalesPerson:\t" + salesPerson
                        + "\nVIN:\t\t" + car.getVIN()
                        + "\nModel:\t\t" + car.getModel()
                        + "\nPrice:\t\t$" + price
                ;

    }

    /**
     * The following methods get the variable values from the map.
     */
    public GregorianCalendar getDate()
    {
        return (GregorianCalendar) infoMap.get("Date");
    }

    public Car getCar()
    {
        return (Car) infoMap.get("Car");
    }

    public double getPrice()
    {
        return (double) infoMap.get("Price");
    }
    public Transaction.TransactionType getType()
    {
        return (TransactionType) infoMap.get("Type");
    }
    public String getSalesPerson()
    {
        return (String) infoMap.get("SP");
    }

}