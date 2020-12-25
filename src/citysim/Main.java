package citysim;

import citysim.tests.banking.BankTests;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to CitySim!");


        // run banking tests
        runBankingTests();
    }

    public static void runBankingTests() {

        BankTests tests = new BankTests();
        tests.testWithMenus();
        // tests.testWithoutMenus();
    }
}
