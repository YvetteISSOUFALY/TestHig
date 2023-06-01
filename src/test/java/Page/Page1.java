package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page1 extends BasePage{
        private WebDriver driver;
    // Déclarez les éléments de la page 1
    @FindBy(id = "menu-item-33")
    private WebElement Bttoolbox;

    //initialiser la classe Page1 avec un objet WebDriver qui sera utilisé pour piloter le navigateur
    // et effectuer des actions spécifiques à cette page.
    public Page1(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
        //  méthodes spécifiques à la page 1
        public void cliquerSurBouton() {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(Bttoolbox));
            Bttoolbox.click();

        }
}

