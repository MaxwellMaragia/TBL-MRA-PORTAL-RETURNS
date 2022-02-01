package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PAYE extends BaseClass {

    public PAYE(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tb-returns-csv-upload/div[label='PAYE Employee Emoluments Upload']/div//div//span")
    WebElement PayeUpload;

    public WebElement getPayeUpload(){
        return PayeUpload;
    }

    @FindBy(xpath = "//*[@id=\"id_payeReturnForm\"]/div[6]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
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
