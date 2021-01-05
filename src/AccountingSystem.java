//This class is for the AccountingSystem, which contains all elements of an AccountingSystem.
import java.util.*;
public class AccountingSystem {
    // Instance Variables
    private SalesTeam team;
    private int transid;
    private int lastid;
    private Map<Integer, Transaction> transactions;
    private Set<Integer> keySet;
    private Iterator<Integer>  iterator;


    // Constructor Method
    public AccountingSystem(){
        team = new SalesTeam();
        transactions = new TreeMap<Integer, Transaction>();
        keySet = transactions.keySet();
        iterator = keySet.iterator();
    }


    public String add(GregorianCalendar date, Car car, String salesPerson, String type, double salePrice){
        transid = (int)(Math.random()*(500))+100;
        lastid = transid;
        Transaction transaction = new Transaction(transid,date,car,salesPerson,type,salePrice);
        transactions.put(transid,transaction);
        return transaction.display();
    }

    // Finds transaction by ID.
    public Transaction getTransaction(int id1){
        iterator = keySet.iterator();
        while(iterator.hasNext()){
            int id = iterator.next();
            if (id1 == id){
                Transaction transaction = transactions.get(id);
                return transaction;
            }
        }
        return null;
    }

    // Shows all transactions.
    public String displayAllTransactions(){
        String result = "";
        iterator = keySet.iterator();
        if(transactions.size() > 0){
            while(iterator.hasNext()){
                int id = iterator.next();
                Transaction transaction = transactions.get(id);
                result += transaction.display() + "\n";
            }
        }else{
            throw new IllegalArgumentException("There Are No Transactions!");
        }
        return result;
    }

    // Shows all transactions for the month.
    public String displayMonthTransactions(int month){
        String result = "";
        iterator = keySet.iterator();
        if(transactions.size() > 0){
            while(iterator.hasNext()){
                int id = iterator.next();
                Transaction transaction = transactions.get(id);
                if (month == transaction.getDate().get(Calendar.MONTH)){
                    result += transaction.display() + "\n";
                }
            }
        }else{
            throw new IllegalArgumentException("There Are No Transactions");
        }
        return result;
    }

    // Calculates the total of all transactions.
    public double getTotalSales(){
        double total = 0.0;
        iterator = keySet.iterator();
        if(transactions.size() > 0){
            while(iterator.hasNext()){
                int id = iterator.next();
                total += transactions.get(id).getPrice();
            }
        }else{
            throw new IllegalArgumentException("There Are No Transactions!");
        }
        return total;
    }

    // Gets average sales.
    public double getAverageSalesPerMonth(){
        return getTotalSales()/12;
    }

    // Finds the number of vehicle returns.
    public int getTotalCarReturns(){
        int total = 0;
        iterator = keySet.iterator();
        if(transactions.size() > 0){
            while(iterator.hasNext()){
                int id = iterator.next();
                if (transactions.get(id).getType().equals("RET")){
                    total += 1;
                }
            }
        }else{
            throw new IllegalArgumentException("There Are No Transactions!");
        }
        return total;
    }

    // Find the total car sales with returns. (If the car is bought but returned, it doesn't count as a sale.
    public int getTotalCarsSold(){
        int total = 0;
        iterator = keySet.iterator();
        if(transactions.size() > 0){
            while(iterator.hasNext()){
                int id = iterator.next();
                if (transactions.get(id).getType().equals("BUY")){
                    total += 1;
                }
            }
        }else{
            throw new IllegalArgumentException("There Are No Transactions!");
        }
        return total;
    }

    // Finds the month with the most amount of cars sold.
    public String getHighestSalesMonth(){
        String text = "";

        ArrayList<Integer> monthsales = new ArrayList<Integer>();
        String[] months = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};

        if(transactions.size() > 0){
            for(int i = 0; i < 12; i++){
                iterator = keySet.iterator();
                int monthCount = 0;
                while(iterator.hasNext()){
                    int id = iterator.next();
                    if(transactions.get(id).getDate().get(Calendar.MONTH) == i){
                        if (transactions.get(id).getType().equals("BUY")){
                            monthCount += 1;
                        }
                        if (transactions.get(id).getType().equals("RET")){
                            monthCount -= 1;
                        }
                    }
                }
                monthsales.add(monthCount);
            }

            // Get the max value in  the ArrayList.
            int max = 0;
            max = Collections.max(monthsales);
            // Get the month which has the highest sales, but if it's a tie, return the latest month with that tie.
            for(int i = 0; i < monthsales.size(); i++){
                if (monthsales.get(i) == max){
                    text += "\n" + months[i] + ": " + max + " car(s)";
                }
            }

        }else{
            throw new IllegalArgumentException("There Are No Transactions!");
        }
        return text;
    }

    // Find the number of transactions in the month.
    public int getNumTransactionsOfMonth(int month){
        int counter = 0;
        iterator = keySet.iterator();
        while(iterator.hasNext()){
            int id = iterator.next();
            if (month == transactions.get(id).getDate().get(Calendar.MONTH)){
                if (transactions.get(id).getType().equals("BUY")){
                    counter += 1;
                }
                if (transactions.get(id).getType().equals("RET")){
                    counter -= 1;
                }
            }
        }
        return counter;
    }

    // Finds the most successful salesmen; there are multiple, but it prints all of them.
    public String getTopSalesPerson(){
        String text = "";
        ArrayList<Integer> numSales = new ArrayList<Integer>();
        if(transactions.size() > 0){
            for(int i = 0; i < team.getSalesPeople().size(); i++){
                int value = 0;
                iterator = keySet.iterator();
                while(iterator.hasNext()){
                    int id = iterator.next();
                    String person = transactions.get(id).getSalesPerson();
                    if(person.equals(team.findSalesPerson(i)) && transactions.get(id).getType().equals("BUY")){
                        value ++;
                    }

                }
                numSales.add(value);
            }

            // Get max value in ArrayList.
            int max = 0;
            for(int i = 0; i < numSales.size(); i++){
                if (numSales.get(i) > max){
                    max = numSales.get(i);
                }
            }

            // Adds all salesmen & the number of cars sold as a String if the number of cars sold is a tie.
            for(int i = 0; i < numSales.size(); i++){
                if (numSales.get(i) == max){
                    text += "\nName: " + team.findSalesPerson(i) + "\nNum Cars Sold: " + max;
                }
            }
        }else{
            throw new IllegalArgumentException("There Are No Transactions!");
        }
        return text;
    }

    public SalesTeam getTeam() {
        return team;
    }

    public void setTeam(SalesTeam team) {
        this.team = team;
    }

    // Return the ID.
    public int getId() {
        return transid;
    }

    // The ID is to be set.
    public void setId(int id) {
        this.transid = id;
    }

    // The transactions are to be set.
    public void setTransactions(Map<Integer, Transaction> transactions) {
        this.transactions = transactions;
    }

    public Set<Integer> getKeySet() {
        return keySet;
    }

    public void setKeySet(Set<Integer> keySet) {
        this.keySet = keySet;
    }

    // Return the interator.
    public Iterator<Integer> getIterator() {
        return iterator;
    }

    public void setIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    // Return the transactions.
    public Map<Integer, Transaction> getTransactions() {
        return transactions;
    }

    // Return the ID.
    public int getTransid() {
        return transid;
    }

    public void setTransid(int transid) {
        this.transid = transid;
    }

    public int getLastid() {
        return lastid;
    }

    public void setLastid(int lastid) {
        this.lastid = lastid;
    }
}

