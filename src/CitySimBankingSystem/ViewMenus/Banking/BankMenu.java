package CitySimBankingSystem.ViewMenus.Banking;

import CitySimBankingSystem.ViewMenus.Menu;

public class BankMenu extends Menu {

    public BankMenuOption getResponse() {

        // display options
        String [] options = new String[] {
                "Create Account",
                "Display Account",
                "Select Account",
                "Exit"
        };

        // get response
        int response = super.getIntResponse(options);

        // convert integer response to enum
        BankMenuOption [] enumValues =  BankMenuOption.values();
        BankMenuOption selectedOption = enumValues[response];

        return selectedOption;
    }
}