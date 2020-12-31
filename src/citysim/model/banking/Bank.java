package citysim.model.banking;

import java.util.ArrayList;

public class Bank {

    private int accountNumberSeed = 1;
    private final ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount() {
        String accountNumber = generateAccountNumber();

        Account userAccount = new Account(accountNumber);
        this.accounts.add(userAccount);

        return userAccount;
    }

    public Account [] getAccounts() {

        Account [] accounts = new Account[this.accounts.size()];
        this.accounts.toArray(accounts);
        return accounts;
    }

    public Account findAccount(String accountNumber) {
        // need to compare the accountNumber to the get.Account number
        // Must figure out how to make sure that it uses that specific set of Accounts and that Bank

        Account foundAccount = null;
        Account[] accounts = getAccounts();

        for (int i = 0; (i < accounts.length) && (foundAccount == null); i++) {
            String number = accounts[i].getNumber();

            if ((number != null) && number.equals(accountNumber)) {
                foundAccount = accounts[i];
            }
        }

        return foundAccount;
    }

    private String generateAccountNumber() {
        String accountNumber =  "CSB-" + String.format("%04d", this.accountNumberSeed);
        this.accountNumberSeed++;
        return accountNumber;
    }
}
