package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page4 {
    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement Chmail;
    @FindBy(xpath = "//*[@id=\"submitMail\"]")
    private WebElement btok;

    //initialiser la classe Page1 avec un objet WebDriver qui sera utilisé pour piloter le navigateur
    // et effectuer des actions spécifiques à cette page.
    public Page4(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

    public void Chmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Chmail));
        Chmail.sendKeys(email);
    }
    public void BtOK() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(btok));
        btok.click();
    }

}






