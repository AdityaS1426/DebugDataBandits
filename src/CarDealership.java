import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class CarDealership
{
    ArrayList<Car> cars;
    SalesTeam salesTeam;
    AccountingSystem accountingSystem;

    // These are filters to sort the cars.
    boolean electricFilter = false;
    boolean priceFilter = false;
    double  priceMin    = 0;
    double  priceMax    = 0;
    boolean AWDFilter = false;

    /**
     * Constructor initializes the variables.
     */
    public CarDealership()
    {
        cars = new ArrayList<Car>();
        salesTeam = new SalesTeam();
        accountingSystem = new AccountingSystem();
    }

    /**
     * Adds cars to the ArrayList.
     */
    public void addCars(ArrayList<Car> newCars)
    {
        cars.addAll(newCars);
        newCars.clear();
    }

    /**
     * Buys the car with the corresponding VIN number.
     * Removes it from the cars list.
     */
    public String buyCar(int VIN)
    {
        Iterator<Car> carIter = cars.iterator();
        Car car = null;
        while (carIter.hasNext())
        {
            Car iter = carIter.next();
            if (iter.getVIN()==VIN)
            {
                car = iter;
                carIter.remove();
            }
        }

        GregorianCalendar date;
        int year = 2019;
        int month = (int)(Math.random()*12);
        int day = (int)(Math.random()*((31-1)+1));
        date = new GregorianCalendar(year, month, day);
        return accountingSystem.add(date, car, salesTeam.getRandom(), Transaction.TransactionType.BUY, car.getPrice());
    }

    /**
     * Returns the car with the corresponding transaction ID.
     * Adds it back to the cars list.
     */
    public String returnCar(int id)
    {
        Transaction transaction = AccountingSystem.getTransaction(id);
        GregorianCalendar date = transaction.getDate();
        int month = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);
        int returnDay = (int)(Math.random()*(28-day)+day);

        Car car = transaction.getCar();
        GregorianCalendar returnDate = new GregorianCalendar(2019, month, returnDay);
        cars.add(car);
        return accountingSystem.add(returnDate, car, salesTeam.getRandom(), Transaction.TransactionType.RETURN, car.getPrice());
    }

    /**
     * Displays all the cars available.
     */
    public void displayInventory()
    {
        System.out.println("VIN\tMANUFACTURER\tCOLOR\tMODEL\tPRICE\t\tSAFETY\tRANGE");
        System.out.println("\t\t\t\t\t\t\tRATING");

        for (int i = 0; i < cars.size(); i++)
        {
            Car car = cars.get(i);
            System.out.println(car.display());
        }
        System.out.println("");
    }

    /**
     * Clears all the filters.
     */
    public void filtersClear()
    {
        electricFilter = false;
        priceFilter = false;
        AWDFilter = false;
    }

    /**
     * Filters by price.
     */
    public void filterByPrice(double min, double max)
    {
        priceFilter = true;
        priceMin    = min;
        priceMax    = max;

        for (int i = 0; i < cars.size(); i++)
        {
            if (cars.get(i).getPrice() >= min && cars.get(i).getPrice() <= max)
            {
                System.out.println(cars.get(i).display());
            }
        }

    }

    /**
     * Filters by electric type.
     */
    public void filterByElectric()
    {
        electricFilter = true;

        for (int i = 0; i < cars.size(); i++)
        {
            if (cars.get(i).getElectric())
            {
                System.out.println(cars.get(i).display());
            }
        }

    }
    /**
     * Filter by drivetrain.
     */
    public void filterByAWD()
    {
        AWDFilter = true;
    }

    /**
     * Sorts the cars by their prices.
     */
    public void sortByPrice()
    {
        Collections.sort(cars);
    }

    /**
     * Sorts the cars by their safety rating.
     */
    private class SafetyRatingComparator implements Comparator<Car>
    {
        public int compare(Car a, Car b)
        {
            if      (a.safetyRating < b.safetyRating) return  1;
            else if (a.safetyRating > b.safetyRating) return -1;
            else                                      return  0;
        }
    }

    public void sortBySafetyRating()
    {
        Collections.sort(cars,new SafetyRatingComparator());
    }

    /**
     * Sorts the cars by their max range.
     */
    private class RangeComparator implements Comparator<Car>
    {
        public int compare(Car a, Car b)
        {
            if      (a.maxRange < b.maxRange) return  1;
            else if (a.maxRange > b.maxRange) return -1;
            else                              return  0;
        }
    }

    public void sortByMaxRange()
    {
        Collections.sort(cars,new RangeComparator());
    }

}