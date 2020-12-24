package citysim;


import citysim.banking.Bank;
import citysim.banking.Account;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to CitySim!");
        testBanking();
    }


    public static void testBanking(){
        double defaultMaximum = 100;


        Bank bank = new Bank();

        Account [] accounts = bank.getAccounts();
        Account account = bank.createAccount();

        account.deposit(defaultMaximum);
        double amount = 10;
        account.withdraw(amount);
        double balance = account.getBalance();
    }
}
