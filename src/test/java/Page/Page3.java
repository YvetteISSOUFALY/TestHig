package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page3 {
        private WebDriver driver;
        private WebDriverWait wait;

        //initialiser la classe Page1 avec un objet WebDriver qui sera utilisé pour piloter le navigateur
        // et effectuer des actions spécifiques à cette page.
        public Page3(WebDriver driver) {
             this.driver = driver;
            this.wait = new WebDriverWait(driver, 100);
        }

        //selectionner le radio bouton
        public void selectRadioButton(String name, String value) {
            By radioButtonLocator = By.xpath("//input[@type='radio'][@name='" + name + "'][@value='" + value + "']");
            WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(radioButtonLocator));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", radioButton);
            radioButton.click();

            if (radioButton.isSelected()) { // Le bouton radio est maintenant sélectionné
            }
        }
          //cliquer le bouton Terminer
        public void clickTerminerButton() {
            By terminerButtonLocator = By.xpath("//*[@id=\"submit\"]");
            WebElement terminerButton = wait.until(ExpectedConditions.elementToBeClickable(terminerButtonLocator));
            terminerButton.click();
        }
}

