package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DomesticExcise extends BaseClass {
    public DomesticExcise(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btnContinue")
    WebElement continueBtn;

    public WebElement getcontinueBtn() {
        return continueBtn;
    }

    @FindBy(xpath = "//tb-returns-csv-upload/div[label='1. TRANSACTION INFORMATION ON DOMESTIC EXCISE TAX COMPUTATION ON GOODS']/div//div//span")
    WebElement uploadGoods;

    public WebElement getUploadGoods() {
        return uploadGoods;
    }

    @FindBy(xpath = "//tb-returns-csv-upload/div[label='2. TRANSACTION INFORMATION ON RAW MATERIAL USED CALCULATION FOR GOODS']/div//div//span")
    WebElement uploadCalculation;

    public WebElement getUploadCalculation() {
        return uploadCalculation;
    }

    @FindBy(xpath = "//tb-returns-csv-upload/div[label='3. TRANSACTION INFORMATION ON DOMESTIC EXCISE TAX COMPUTATION FOR SERVICES']/div//div//span")
    WebElement uploadServices;

    public WebElement getUploadServices() {
        return uploadServices;
    }

    @FindBy(xpath = "//button[contains(text(),'Next ' )]")
    WebElement btnNext;

    public WebElement getBtnNext() {
        return btnNext;
    }

    @FindBy(xpath = "//*[@id=\"id_exciseSummaryForm\"]/div[2]/div[2]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;

    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit ' )]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }


}
