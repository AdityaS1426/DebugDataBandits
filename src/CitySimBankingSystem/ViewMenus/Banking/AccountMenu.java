package CitySimBankingSystem.ViewMenus.Banking;

import CitySimBankingSystem.ViewMenus.Menu;

public class AccountMenu extends Menu {

    public AccountMenuOption getResponse() {
        // display options
        String [] options = new String[] {
                "Deposit",
                "Withdrawal",
                "Balance",
        };

        // get response
        int response = super.getIntResponse(options);

        // convert integer response to enum
        AccountMenuOption [] enumValues =  AccountMenuOption.values();
        AccountMenuOption selectedOption = enumValues[response];

        return selectedOption;
    }
}
