public class Main {

    public static void main(String[] args) {

        //Object Creation for a class
        TradingAccountPage accountPage = new TradingAccountPage();

        accountPage.openDriver();

        accountPage.openAccountPage();

        accountPage.enterTitle();

        accountPage.enterFirstName();

        accountPage.enterLastName();

        accountPage.enterEmail();

        accountPage.enterMobile();

        accountPage.enterPostCode();

        accountPage.clickPostCodeLookupButton();

        accountPage.driverWait();

        accountPage.clickBritishNationalButton();

        //Passing Parameter
        accountPage.enterDOB("17/01/1980");

    }
}
