package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Turnover extends BaseClass {
    public Turnover(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btnContinue")
    WebElement continueBtn;

    public WebElement getcontinueBtn() {
        return continueBtn;
    }

    @FindBy(xpath = "//button[contains(text(),'Next ' )]")
    WebElement btnNext;

    public WebElement getBtnNext() {
        return btnNext;
    }

    @FindBy(xpath = "//button[contains(text(),'New' )]")
    WebElement newBtn;

    public WebElement getNew() {
        return newBtn;
    }

    @FindBy(xpath = "//button[contains(text(),'Add' )]")
    WebElement addBtn;

    public WebElement getAddBtn() {
        return addBtn;
    }

    @FindBy(id = "id_sourceOfIncome")
    WebElement sourceOfIncome;

    public WebElement getSourceOfIncome() {
        return sourceOfIncome;
    }

    @FindBy(id = "id_description")
    WebElement description;

    public WebElement getDescription() {
        return description;
    }

    @FindBy(id = "id_amount")
    WebElement amount;

    public WebElement getAmount() {
        return amount;
    }

    @FindBy(xpath = "//*[@id=\"id_totReturnSummaryForm\"]/div[3]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;
    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

}
