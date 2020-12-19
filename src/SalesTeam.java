import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;



// This class is for SalesTeam which containes all elements of a SalesTeam
public class SalesTeam {

    // Instance Variables
    private LinkedList<String> salesPeople;
    private ListIterator<String> iterator;
    private ArrayList<Integer> numSales = new ArrayList<Integer>();

    // Constructor Methods
    public SalesTeam(){
        salesPeople = new LinkedList<String>();
        salesPeople.addLast("Joe");
        salesPeople.addLast("Mary");
        salesPeople.addLast("James");
        salesPeople.addLast("Tim");
        salesPeople.addLast("Ben");
        salesPeople.addLast("Alice");
    }

    // Gets a random sales person from the list of sales people.
    // Return sales person.
    public String getSalesPerson(){
        int ranPerson = (int)(Math.random()*(salesPeople.size()));
        iterator = salesPeople.listIterator(ranPerson);
        String person =  iterator.next();
        return person;
    }

    // Gets all the sales people as a String.
    // Return SalesPeopleString.
    public String getAllSalesPeople(){
        iterator = salesPeople.listIterator();
        String salesPeopleString = "";
        for (int i = 0; i < salesPeople.size(); i++){
            salesPeopleString += "\n" + (i+1) + ". " + iterator.next();
        }
        return salesPeopleString;
    }

    // Finds sales person based on the index.
    public String findSalesPerson(int index){
        iterator = salesPeople.listIterator(index);
        String person = iterator.next();
        return person;
    }

    // Return the sales people.
    public LinkedList<String> getSalesPeople() {
        return salesPeople;
    }

    // The sales people to be set.
    public void setSalesPeople(LinkedList<String> salesPeople) {
        this.salesPeople = salesPeople;
    }

    // Returns the iterator.
    public ListIterator<String> getIterator() {
        return iterator;
    }

    // The iterator is to be set.
    public void setIterator(ListIterator<String> iterator) {
        this.iterator = iterator;
    }

    // Return numSales.
    public ArrayList<Integer> getNumSales() {
        return numSales;
    }

    // numSales to be set.
    public void setNumSales(ArrayList<Integer> numSales) {
        this.numSales = numSales;
    }
}
