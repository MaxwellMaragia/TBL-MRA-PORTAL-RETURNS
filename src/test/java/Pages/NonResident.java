package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NonResident extends BaseClass {
    public NonResident(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tb-returns-csv-upload/div[label='Non Resident Details Upload']/div//div//span")
    WebElement NrtUpload;

    public WebElement getNrtUpload(){
        return NrtUpload;
    }
    @FindBy(xpath = "//*[@id=\"id_nrtReturnForm\"]/div[2]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;
    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

    @FindBy(id = "id_benefitValue")
    WebElement benefitValue;
}
