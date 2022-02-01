package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FringeBenefit extends BaseClass {
    public FringeBenefit(){
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

    @FindBy(xpath = "//*[@id=\"id_fringeBenefitForm\"]/div/div/tb-dropdown/div/div[2]/p-dropdown/div/div[3]")
    WebElement fringeBenefit;

    public WebElement getFringeBenefit(){
        return fringeBenefit;
    }

    @FindBy(xpath = "//*[@id=\"id_fbtReturnSummaryForm\"]/div[5]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;

    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit ' )]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

    @FindBy(id = "id_benefitValue")
    WebElement benefitValue;

    public WebElement getBenefitValue(){ return benefitValue;}
}
