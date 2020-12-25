package citysim.tests.banking;

// importing views
import citysim.view.menus.banking.AccountMenu;
import citysim.view.menus.banking.BankMenuOption;
import citysim.view.menus.banking.AccountMenuOption;
import citysim.view.menus.banking.BankMenu;

// importing models
import citysim.model.banking.Bank;
import citysim.model.banking.Account;

public class BankTests {

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

    public void displayAccountMenu() {
        AccountMenu accountMenu = new AccountMenu();
        AccountMenuOption response = accountMenu.getResponse();

        switch (response) {
            case None:
                // create an account
                break;
            case Deposit:
                // create an account
                break;
            case Withdrawal:
                // display accounts
                break;
            case Balance:
                // select an account
                break;
        }
    }

    public void runCreateAccount() {
        Bank bank = new Bank();
        Account account = bank.createAccount();

        // display account number
    }

    public void runDisplayAccounts() {

    }

    public void runSelectAccount() {
        displayAccountMenu();
    }

    public void runDeposit() {
    }

    public void runWithdrawal() {
    }

    public void runDisplayBalance() {
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
