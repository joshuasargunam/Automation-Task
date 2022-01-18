import org.openqa.selenium.By;

//used inheritance concept to call Helper class
public class TradingAccountPage extends Helper{


    public void openAccountPage(){
        driver.get("https://www.ii.co.uk/account-opening/trading-account");
    }

    public void enterTitle(){
        driver.findElement(By.id("TRADING_title")).sendKeys("MR");
    }

    public void enterFirstName(){
        driver.findElement(By.cssSelector("[data-id='input_First_name']")).sendKeys("Josh");
    }

    public void enterLastName(){
        driver.findElement(By.id("TRADING_lastName")).sendKeys("Test");
    }

    public void enterEmail(){
        driver.findElement(By.id("TRADING_emailAddress")).sendKeys("josh.test@ii.co.uk");
    }

    public void enterMobile(){
        driver.findElement(By.id("mobileNumber")).sendKeys("07234567890");
    }

    public void enterPostCode(){
        driver.findElement(By.id("TRADING_postcodeLookup")).sendKeys("LS1 4AX");
    }

    public void clickPostCodeLookupButton(){
        driver.findElement(By.cssSelector("[data-testid='postcodeLookupButton']")).click();
    }

    public void clickBritishNationalButton() {
        driver.findElement(By.cssSelector("[data-testid='britishNationalRadio_No']")).click();
    }

    //Method with parameter
    public void enterDOB(String dob) {
        driver.findElement(By.cssSelector("input[data-testid='date-input']")).sendKeys(dob);
    }


}
