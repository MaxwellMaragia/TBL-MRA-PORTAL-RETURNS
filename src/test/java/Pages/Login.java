package Pages;

import StepDefinitions.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login extends BaseClass {

    public Login() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_userName")
    WebElement username;

    @FindBy(id = "id_password")
    WebElement password;

    @FindBy(id = "btnSubmit")
    WebElement Login_btn;

    @FindBy(id = "id_btnSubmitReturn")
    WebElement submitReturn;

    public WebElement username() {
        return username;
    }

    public WebElement password() {
        return password;
    }

    public WebElement Click_login_button() {
        return Login_btn;
    }

    public WebElement getSubmitReturn(){ return submitReturn;}

}

