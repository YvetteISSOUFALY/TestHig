package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page5 {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(css = "input#login")
    private WebElement Chmailyop;

    @FindBy(xpath = "//*[@id=\"refreshbut\"]")
    private WebElement btflesh;

    public Page5(WebDriver driver) {
            this.driver = driver;

    }

    public void accederYopmail() {

        driver.get("https://yopmail.com/fr/wm");

    }
    public void Chyopmail(String email2) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Chmailyop));
        Chmailyop.clear();
        Chmailyop.sendKeys(email2);
    }


    public void BtOKf() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(btflesh));
        btflesh.click();
    }


}