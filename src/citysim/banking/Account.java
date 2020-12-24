package citysim.banking;

public class Account {
    private double amount = 0;

    public void deposit(double amount) {
        this.amount = this.amount + amount;
        //will the variable money remain the same as it goes into the next method?
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
    //Must write method that comes up with new names when initializing new accounts
}
