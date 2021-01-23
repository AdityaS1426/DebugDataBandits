package CitySimBankingSystem.TestBanking;

import java.util.*;

// importing views
import CitySimBankingSystem.ViewMenus.Banking.AccountMenu;
import CitySimBankingSystem.ViewMenus.Banking.BankMenuOption;
import CitySimBankingSystem.ViewMenus.Banking.AccountMenuOption;
import CitySimBankingSystem.ViewMenus.Banking.BankMenu;

// importing models
import CitySimBankingSystem.Model.Banking.Bank;
import CitySimBankingSystem.Model.Banking.Account;

public class BankTests {
    private Bank bank;

    public BankTests() {
        this.bank = new Bank();
    }

    public void testWithMenus() {

        boolean done = false;

        do {
            done = displayBankingMenu();
        } while (!done);
    }

    public  void testWithoutMenus() {
        testBanking();
    }

    public boolean displayBankingMenu() {
        BankMenu bankMenu = new BankMenu();
        BankMenuOption response = bankMenu.getResponse();

        boolean done = false;

        switch (response) {
            case None:
                // display error??
                break;
            case CreateAccount:
                // create an account
                runCreateAccount();
                break;
            case DisplayAccounts:
                // display accounts
                runDisplayAccounts();
                break;
            case SelectAccount:
                // select an account
                runSelectAccount();
                break;
            case Exit:
                // done
                done = true;
                break;
        }

        return done;
    }

    public void displayAccountMenu(Account activeAccount) {
        AccountMenu accountMenu = new AccountMenu();
        AccountMenuOption response = accountMenu.getResponse();
        //the account is initialized


        switch (response) {
            case None:
                // create an account
                break;
            case Deposit: runDeposit(activeAccount);
                // create an account
                break;
            case Withdrawal: runWithdrawal(activeAccount);
                // display accounts
                break;
            case Balance: runDisplayBalance(activeAccount);
                // select an account
                break;
        }
    }

    public void runCreateAccount() {
        Account userAccount = this.bank.createAccount();
    }

    public void runDisplayAccounts() {
        //remember the return type of that method has to match that of which you are assigning it to
        Account [] accounts = this.bank.getAccounts();
        for(int i = 0; i < accounts.length; i++) {
            // Account account = accounts[i];
            // System.out.println(account.getNumber());
            System.out.println(accounts[i].getNumber());
        }
    }

    public void runSelectAccount() {
        // prompt user for account number
        System.out.println("What account would you like to select? Please enter the account number...");
        Scanner scan = new Scanner(System.in);
        String accountNumber = scan.nextLine();
        Account account = this.bank.findAccount(accountNumber);

        if (account != null) {
            displayAccountMenu(account);
        }
        else {
            // NOTE: let the user know the account number was not found
        }
    }

    public void runDeposit(Account activeAccount) {
        // prompt user for deposit
        System.out.println("How much money would you like to deposit?");
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        activeAccount.deposit(value);
    }

    public void runWithdrawal(Account activeAccount) {
        // prompt user for withdrawal
        System.out.println("How much money would you like to withdraw?");
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        activeAccount.withdraw(value);
    }

    public void runDisplayBalance(Account activeAccount) {
        System.out.println(activeAccount.getBalance());
    }

    public void testBanking(){
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
