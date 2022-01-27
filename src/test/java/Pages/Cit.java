package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cit extends BaseClass {
    public Cit(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"id_cit_homepageForm\"]/div[2]/div/tb-checkbox[1]/div/div[2]/p-checkbox/div/div[2]")
    WebElement corporateIncome;
    public WebElement getCorporateIncome(){ return corporateIncome; }

    @FindBy(id = "id_businessIncome")
    WebElement BusinessIncome;
    public WebElement getBusinessIncome(){
        return BusinessIncome;
    }

    @FindBy(id = "id_openingStock")
    WebElement OpeningStock;
    public WebElement getOpeningStock(){
        return OpeningStock;
    }

    @FindBy(id = "id_purchases")
    WebElement Purchases;
    public WebElement getPurchases(){
        return Purchases;
    }

    @FindBy(id = "id_closingStock")
    WebElement ClosingStock;
    public WebElement getClosingStock(){
        return ClosingStock;
    }

    @FindBy(id = "id_salariesAndWages")
    WebElement SalaryWages;
    public WebElement getSalaryWages(){
        return SalaryWages;
    }

    @FindBy(id = "id_shareCapital")
    WebElement ShareCapital;
    public WebElement getShareCapital(){
        return ShareCapital;
    }

    @FindBy(xpath = "//*[@id=\"id_cit_summaryForm\"]/div/div/div[2]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;
    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

    @FindBy(xpath = "//*[@id=\"id_fileChoose\"]/span/span")
    WebElement CitUpload;

    public WebElement getCitUpload(){
        return CitUpload;
    }


}
