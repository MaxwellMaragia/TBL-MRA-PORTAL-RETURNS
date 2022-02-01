package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProvisionalPit extends BaseClass {
    public ProvisionalPit(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"id_pitProvReturnForm\"]/div[4]/div/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;
    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

    @FindBy(id = "id_estimatedChargeableIncomeForYear")
    WebElement estimatedIncome;

    public WebElement getEstimatedIncome() {
        return estimatedIncome;
    }

    @FindBy(id = "id_quarterOneInstallAmt")
    WebElement quarterOne;

    public WebElement getQuarterOne() {
        return quarterOne;
    }

    @FindBy(id = "id_quarterTwoInstallAmt")
    WebElement quarterTwo;

    public WebElement getQuarterTwo() {
        return quarterTwo;
    }

    @FindBy(id = "id_quarterThreeInstallAmt")
    WebElement quarterThree;

    public WebElement getQuarterThree() {
        return quarterThree;
    }

    @FindBy(id = "id_quarterFourInstallAmt")
    WebElement quarterFour;

    public WebElement getQuarterFour() {
        return quarterFour;
    }
}
