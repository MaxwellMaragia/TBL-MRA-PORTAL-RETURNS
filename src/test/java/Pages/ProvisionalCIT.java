package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProvisionalCIT extends BaseClass {

    public ProvisionalCIT(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"id_citProvReturnForm\"]/div[3]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;
    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

    @FindBy(xpath = "//*[@id=\"id_citProvReturnForm\"]/div[2]/div/div[1]/tb-png-input-number[1]/div/div[2]/span/input")
    WebElement estimatedIncome;

    public WebElement getEstimatedIncome() {
        return estimatedIncome;
    }

    @FindBy(xpath = "//*[@id=\"id_citProvReturnForm\"]/div[2]/div/div[1]/tb-png-input-number[3]/div/div[2]/span/input")
    WebElement quarterOne;

    public WebElement getQuarterOne() {
        return quarterOne;
    }

    @FindBy(xpath = "//*[@id=\"id_citProvReturnForm\"]/div[2]/div/div[1]/tb-png-input-number[4]/div/div[2]/span/input")
    WebElement quarterTwo;

    public WebElement getQuarterTwo() {
        return quarterTwo;
    }

    @FindBy(xpath = "//*[@id=\"id_citProvReturnForm\"]/div[2]/div/div[1]/tb-png-input-number[5]/div/div[2]/span/input")
    WebElement quarterThree;

    public WebElement getQuarterThree() {
        return quarterThree;
    }

    @FindBy(xpath = "//*[@id=\"id_citProvReturnForm\"]/div[2]/div/div[1]/tb-png-input-number[6]/div/div[2]/span/input")
    WebElement quarterFour;

    public WebElement getQuarterFour() {
        return quarterFour;
    }
}
