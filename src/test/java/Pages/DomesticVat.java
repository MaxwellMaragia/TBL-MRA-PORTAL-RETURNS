package Pages;

import StepDefinitions.BaseClass;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DomesticVat extends BaseClass {
    public DomesticVat(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "id_value1")
    WebElement valueOfSales;
    public WebElement getValueOfSales(){ return valueOfSales; }

    @FindBy(id = "id_vat2")
    WebElement importedServices;
    public WebElement getImportedServices(){ return importedServices; }

    @FindBy(id = "id_vat3")
    WebElement capitalItems;
    public WebElement getCapitalItems(){ return capitalItems; }

    @FindBy(id = "id_value4")
    WebElement customControls;
    public WebElement getCustomControls(){ return customControls; }

    @FindBy(id = "id_value5")
    WebElement ratedSupplies;
    public WebElement getRatedSupplies(){ return ratedSupplies; }

    @FindBy(id = "id_value6")
    WebElement excemptSupplies;
    public WebElement getExcemptSupplies(){ return excemptSupplies; }

    @FindBy(xpath = "//button[contains(text(),'Next ' )]")
    WebElement btnNext;

    public WebElement getBtnNext() {
        return btnNext;
    }

    @FindBy(xpath = "//*[@id=\"id_vatReturnSummaryForm\"]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
    WebElement confirmCheckbox;

    public WebElement getConfirmCheckbox() {
        return confirmCheckbox;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit ' )]")
    WebElement submitReturn;

    public WebElement getSubmitReturn() {
        return submitReturn;
    }

    @FindBy(id = "id_value8")
    WebElement ValueOfLocalPurchasesAndOtherExpenses;
    public WebElement getValueOfLocalPurchasesAndOtherExpenses(){
        return ValueOfLocalPurchasesAndOtherExpenses;
    }

    @FindBy(id = "id_value9")
    WebElement ValueOfImportedPurchases;
    public WebElement getValueOfImportedPurchases(){
        return ValueOfImportedPurchases;
    }

    @FindBy(id = "id_value10")
    WebElement ValueOfZeroRatedPurchases;
    public WebElement getValueOfZeroRatedPurchases(){
        return ValueOfZeroRatedPurchases;
    }

    @FindBy(id = "id_vat11")
    WebElement VatOnImportedServices;
    public WebElement getVatOnImportedServices(){
        return VatOnImportedServices;
    }

    @FindBy(id = "id_vat13")
    WebElement EfdMachines;
    public WebElement getEfdMachines(){
        return EfdMachines;
    }

    @FindBy(id = "id_value14")
    WebElement valueOfExcemptPurchases;
    public WebElement getValueOfExcemptPurchases(){
        return valueOfExcemptPurchases;
    }

    @FindBy(id = "id_value15")
    WebElement nonVatTraders;
    public WebElement getNonVatTraders(){
        return nonVatTraders;
    }

    @FindBy(id = "id_value18")
    WebElement valueOfCapitalGoods;
    public WebElement getValueOfCapitalGoods(){
        return valueOfCapitalGoods;
    }

    @FindBy(id = "id_vat18")
    WebElement Vat;
    public WebElement getVat(){
        return Vat;
    }

}
