package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import StepDefinitions.BaseClass;

public class CapitalGains extends BaseClass {
    public CapitalGains() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "btnContinue")
    WebElement continueBtn;

    public WebElement getcontinueBtn() {
        return continueBtn;
    }

    @FindBy(id = "id_assetBuyerTin")
    WebElement buyerTin;

    public WebElement getBuyerTin() {
        return buyerTin;
    }

    @FindBy(id = "id_assetBuyerPostalAddress")
    WebElement buyerAddress;

    public WebElement getBuyerAddress() {
        return buyerAddress;
    }

    @FindBy(id = "id_assetBuyerName")
    WebElement buyerName;

    public WebElement getBuyerName() {
        return buyerName;
    }

    @FindBy(id = "id_assetBuyerEmailAddress")
    WebElement buyerEmail;

    public WebElement getBuyerEmail() {
        return buyerEmail;
    }

    @FindBy(id = "id_assetBuyerContactNumber")
    WebElement buyerContact;

    public WebElement getBuyerContact() {
        return buyerContact;
    }

    @FindBy(id = "btnAdd")
    WebElement btnAdd;

    public WebElement getBtnAdd() {
        return btnAdd;
    }

    @FindBy(xpath = "//*[@id=\"id_transactionForm\"]/div/div/tb-dropdown[1]/div/div[2]/p-dropdown/div/div[3]")
    WebElement typeOfAsset;

    public WebElement getTypeOfAsset() {
        return typeOfAsset;
    }

    @FindBy(xpath = "//*[@id=\"id_transactionForm\"]/div/div/tb-dropdown[2]/div/div[2]/p-dropdown/div/div[3]")
    WebElement assetNumber;

    public WebElement getAssetNumber() {
        return assetNumber;
    }

    @FindBy(id = "id_disposalDate")
    WebElement sellingDate;

    public WebElement getSellingDate() {
        return sellingDate;
    }

    @FindBy(xpath = "//*[@id=\"id_transactionForm\"]/div/div/tb-png-input-number[1]/div/div[2]/span/input")
    WebElement sellingPrice;

    public WebElement getSellingPrice() {
        return sellingPrice;
    }

    @FindBy(xpath = "//*[@id=\"id_transactionForm\"]/div/div/tb-png-input-number[2]/div/div[2]/span/input")
    WebElement disposalValue;

    public WebElement getDisposalValue() {
        return disposalValue;
    }

    @FindBy(id = "id_dateOfAcquisition")
    WebElement acquisitionDate;

    public WebElement getAcquisitionDate() {
        return acquisitionDate;
    }

    @FindBy(xpath = "//*[@id=\"id_transactionForm\"]/div/div/tb-png-input-number[4]/div/div[2]/span/input")
    WebElement acquisitionCost;

    public WebElement getAcquisitionCost() {
        return acquisitionCost;
    }

    @FindBy(id = "buttnSave")
    WebElement add;

    public WebElement getAdd() {
        return add;
    }

    @FindBy(xpath = "//button[contains(text(),'Next ' )]")
    WebElement btnNext;

    public WebElement getBtnNext() {
        return btnNext;
    }

    @FindBy(xpath = "//*[@id=\"id_cgtReturnSummaryForm\"]/div[2]/tb-checkbox/div/div[2]/p-checkbox/div/div[2]")
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
