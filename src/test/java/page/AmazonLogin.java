package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AmazonLogin {
    public AmazonLogin() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    WebElement submit;


    public void aramaYap(String data){
        Driver.getDriver().get("https://wwww.amazon.com/");
        searchBox.sendKeys(data);
        submit.click();
    }

}