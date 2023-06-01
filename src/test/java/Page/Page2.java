package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Page2 extends BasePage {
        WebDriver driver;
       // Déclarez les éléments de la page 2
        @FindBy(xpath = "//*[@id=\"popmake-468\"]/button")
        private WebElement fermerButton;

        @FindBy(xpath = "//*[@id=\"cookie_action_close_header\"]")
        private WebElement accepterButton;

        @FindBy(css = "a[target='_blank'][href='https://hightest.nc/ressources/test-istqb.php'][class='text-poppins bg-color-green-medium lang d-block text-color-white text-weight-light text-uppercase letter-spacing200']")
        private WebElement francaisLink;

        //initialiser la classe Page1 avec un objet WebDriver qui sera utilisé pour piloter le navigateur
        // et effectuer des actions spécifiques à cette page.
        public Page2(WebDriver driver) {
            super(driver);
            this.driver = driver;
        }
       //  méthodes spécifiques à la page 1
    public void closePopup() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(fermerButton));
        fermerButton.click();
    }

    public void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(accepterButton));
        accepterButton.click();
    }

    public void clickFrancaisLink() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", francaisLink);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        // Attendre que l'élément <div> soit cliquable
        WebElement divElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page\"]/div[2]/div/section/article/div[2]/div/div[1]/div")));

        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
        jsExecutor2.executeScript("arguments[0].scrollIntoView(true);", divElement);

        // Cliquer sur l'élément <a> à l'intérieur de l'élément <div>
        WebElement francaisLink = divElement.findElement(By.tagName("a"));
        francaisLink.click();
    }


    // Ajoutez des méthodes spécifiques à la page 2 ici
}

