package citysim.model.banking;

import java.util.ArrayList;

public class Bank {

    private final ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(){
        Account userAccount = new Account();
        this.accounts.add(userAccount);

        return userAccount;
    }

    public Account [] getAccounts(){

        Account [] accounts = new Account[this.accounts.size()];
        this.accounts.toArray(accounts);
        return accounts;
    }
}
