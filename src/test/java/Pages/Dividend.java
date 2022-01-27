package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dividend extends BaseClass {
    public Dividend(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"id_dividendReturnForm\"]/div[2]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;
    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

    @FindBy(xpath = "//tb-returns-csv-upload/div[label='Dividend Details Upload']/div//div//span")
    WebElement uploadTemplate;

    public WebElement getUploadTemplate() {
        return uploadTemplate;
    }

    @FindBy(id = "id_declarationDate")
    WebElement declarationDate;
    public WebElement getDeclarationDate(){ return declarationDate; }

}
