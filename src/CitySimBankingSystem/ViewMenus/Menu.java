package CitySimBankingSystem.ViewMenus;

import java.util.Scanner;

public class Menu {
    protected int getIntResponse(String [] options) {

        boolean done = false;
        int response = 0;

        do {
            // display options
            displayOptions(options);
            System.out.print("Make your selection: ");

            // wait for user input
            Scanner scan = new Scanner(System.in);

            // TODO: make sure input other than int can be handled
            response = scan.nextInt();

            // validate user input
            if (response < 1 || response > options.length) {
                System.err.println(response + " is not a valid selection. Please select again.");
            }
            else {
                // success -- we have a valid response
                done = true;
            }
        } while (!done);

        return response;
    }

    private void displayOptions(String [] options) {
        final int maxLength = 30;

        int menuOption = 1;
        // display options for
        System.out.println("------------- Menu");
        for (String option : options) {

            int fillerLength = maxLength - option.length();
            // create a filler with as many dots as required to get to max length
            String filler = java.nio.CharBuffer.allocate(fillerLength).toString().replace('\0', '.');

            System.out.println(option + filler + menuOption);
            menuOption++;
        }
    }
}
