package citysim.model.banking;

import java.util.*;

public class Account {
    private double amount = 0;

    private String number;

    public Account(String number) {
        this.number = number;
    }
    public Account () {

    }

    public String getNumber() {
        return this.number;
    }

    public void deposit(double amount) {
        this.amount = this.amount + amount;
        //will the variable money remain the same as it goes into the next method?--yes
    }

    public void withdraw(double amount) {

        if (amount > this.amount || amount < 0) {
            // cannot do that
            throw new IndexOutOfBoundsException( amount + " is out of bounds, because the account has " + this.amount + " dollars");
        }

        this.amount = this.amount - amount;
    }

    public double getBalance() {
        return this.amount;
    }

}
