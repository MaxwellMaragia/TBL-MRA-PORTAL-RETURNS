package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pit extends BaseClass {
    public Pit(){
        PageFactory.initElements(driver,this);
    }

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

    @FindBy(id = "id_openingCapital")
    WebElement OpeningCapital;
    public WebElement getOpeningCapital(){
        return OpeningCapital;
    }

    @FindBy(id = "id_addNetProfitLoss")
    WebElement NetProfit;
    public WebElement getNetProfit(){
        return NetProfit;
    }

    @FindBy(id = "id_lessDrawings")
    WebElement LessDrawings;
    public WebElement getLessDrawings(){
        return LessDrawings;
    }

    @FindBy(xpath = "//*[@id=\"id_pit_summaryForm\"]/div/div/div/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
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
