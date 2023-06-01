package Scenario;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class test {
    public static void main(String[] args) throws InterruptedException {
        // Ouverture du navigateur et accès à la page de connexion
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hightest.nc/toolbox/");



        Thread.sleep(30000);
        By fermer = By.xpath("//*[@id=\"popmake-468\"]/button");
        WebElement btfermer = driver.findElement(fermer);
        btfermer.click();
        //*[@id="cookie_action_close_header"]
        Thread.sleep(30000);
        By accepter = By.xpath("//*[@id=\"cookie_action_close_header\"]");
        WebElement btaccepter = driver.findElement(accepter);
        btaccepter.click();


        // Cliquer sur le lien "Français"
        WebElement link = driver.findElement(By.cssSelector("a[target='_blank'][href='https://hightest.nc/ressources/test-istqb.php'][class='text-poppins bg-color-green-medium lang d-block text-color-white text-weight-light text-uppercase letter-spacing200']"));

        // Approach 1: Wait for the interfering element to be invisible
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"page\"]/div[2]/div/section/article/div[2]/div/div[1]/div/div[2]/div")));

        // Approach 2: Perform a shifted click using Actions
        Actions actions = new Actions(driver);
        actions.moveToElement(link).click().perform();


        // Faites défiler la page jusqu'à ce que l'élément soit visible
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", link);
        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
        jsExecutor2.executeScript("arguments[0].click();", link);

        // Attendre que l'élément soit cliquable
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(link));

        String currentWindow = driver.getWindowHandle(); // Capture la fenêtre actuelle
       // link.click(); // Clique sur le lien pour ouvrir le nouvel onglet

        Set<String> windows = driver.getWindowHandles(); // Récupère toutes les fenêtres ouvertes
        windows.remove(currentWindow); // Supprime la fenêtre actuelle de l'ensemble des fenêtres
        String newWindow = windows.iterator().next(); // Obtient le nouvel onglet
        driver.switchTo().window(newWindow); // Bascule vers le nouvel onglet

        // Effectuez les actions souhaitées dans le nouvel onglet

        WebDriverWait wait9 = new WebDriverWait(driver, 100); // Attente explicite

        By radioButtonLocator = By.xpath("//input[@type='radio'][@name='0'][@value='1']");
        WebElement radioButton = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator)); // Attente de l'élément clickable

        JavascriptExecutor jsExecutor7 = (JavascriptExecutor) driver;
        jsExecutor7.executeScript("arguments[0].scrollIntoView(true);", radioButton); // Défilement vers l'élément si nécessaire

        radioButton.click(); // Clique directement sur le bouton radio

        if (radioButton.isSelected()) {
            // Le bouton radio est maintenant sélectionné
        }

        By radioButtonLocator2 = By.xpath("//input[@type='radio'][@name='1'][@value='2']\n");
        WebElement radioButton2 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator2));
        JavascriptExecutor jsExecutor8 = (JavascriptExecutor) driver;
        jsExecutor8.executeScript("arguments[0].scrollIntoView(true);", radioButton2);
        radioButton2.click();

        if (radioButton2.isSelected()) {
            // Le bouton radio de la deuxième question est maintenant sélectionné
        }

        // Sélection du bouton radio de la troisième question
        By radioButtonLocator3 = By.xpath("//input[@type='radio'][@name='2'][@value='1']");
        WebElement radioButton3 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator3));
        JavascriptExecutor jsExecutor9 = (JavascriptExecutor) driver;
        jsExecutor9.executeScript("arguments[0].scrollIntoView(true);", radioButton3);
        radioButton3.click();

        if (radioButton3.isSelected()) {
            // Le bouton radio de la troisième question est maintenant sélectionné
        }
        By radioButtonLocator4 = By.xpath("//input[@type='radio'][@name='3'][@value='2']");
        WebElement radioButton4 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator4));
        JavascriptExecutor jsExecutor10 = (JavascriptExecutor) driver;
        jsExecutor10.executeScript("arguments[0].scrollIntoView(true);", radioButton4);
        radioButton4.click();

        if (radioButton4.isSelected()) {
            // Le bouton radio de la quatrième question est maintenant sélectionné
        }
        By radioButtonLocator5 = By.xpath("//input[@type='radio'][@name='4'][@value='2']");
        WebElement radioButton5 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator5));
        JavascriptExecutor jsExecutor11 = (JavascriptExecutor) driver;
        jsExecutor11.executeScript("arguments[0].scrollIntoView(true);", radioButton5);
        radioButton5.click();

        if (radioButton5.isSelected()) {
            // Le bouton radio de la cinquième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la sixième question
        By radioButtonLocator6 = By.xpath("//input[@type='radio'][@name='5'][@value='3']");
        WebElement radioButton6 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator6));
        JavascriptExecutor jsExecutor12 = (JavascriptExecutor) driver;
        jsExecutor12.executeScript("arguments[0].scrollIntoView(true);", radioButton6);
        radioButton6.click();

        if (radioButton6.isSelected()) {
            // Le bouton radio de la sixième question est maintenant sélectionné
        }
        By radioButtonLocator7 = By.xpath("//input[@type='radio'][@name='6'][@value='2']");
        WebElement radioButton7 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator7));
        JavascriptExecutor jsExecutor13 = (JavascriptExecutor) driver;
        jsExecutor13.executeScript("arguments[0].scrollIntoView(true);", radioButton7);
        radioButton7.click();

        if (radioButton7.isSelected()) {
            // Le bouton radio de la septième question est maintenant sélectionné
        }

        By radioButtonLocator8 = By.xpath("//input[@type='radio'][@name='7'][@value='4']");
        WebElement radioButton8 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator8));
        JavascriptExecutor jsExecutor14 = (JavascriptExecutor) driver;
        jsExecutor14.executeScript("arguments[0].scrollIntoView(true);", radioButton8);
        radioButton8.click();

        if (radioButton8.isSelected()) {
            // Le bouton radio de la huitième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la neuvième question
        By radioButtonLocator9 = By.xpath("//input[@type='radio'][@name='8'][@value='1']");
        WebElement radioButton9 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator9));
        JavascriptExecutor jsExecutor15 = (JavascriptExecutor) driver;
        jsExecutor15.executeScript("arguments[0].scrollIntoView(true);", radioButton9);
        radioButton9.click();

        if (radioButton9.isSelected()) {
            // Le bouton radio de la neuvième question est maintenant sélectionné
        }

        // Sélection du bouton radio de la dixième question
        By radioButtonLocator10 = By.xpath("//input[@type='radio'][@name='9'][@value='3']");
        WebElement radioButton10 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator10));
        JavascriptExecutor jsExecutor16 = (JavascriptExecutor) driver;
        jsExecutor16.executeScript("arguments[0].scrollIntoView(true);", radioButton10);
        radioButton10.click();

        if (radioButton10.isSelected()) {
            // Le bouton radio de la dixième question est maintenant sélectionné
        }
        By radioButtonLocator11 = By.xpath("//input[@type='radio'][@name='10'][@value='4']");
        WebElement radioButton11 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator11));
        JavascriptExecutor jsExecutor17 = (JavascriptExecutor) driver;
        jsExecutor17.executeScript("arguments[0].scrollIntoView(true);", radioButton11);
        radioButton11.click();

        if (radioButton11.isSelected()) {
            // Le bouton radio de la onzième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la douzième question
        By radioButtonLocator12 = By.xpath("//input[@type='radio'][@name='11'][@value='2']");
        WebElement radioButton12 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator12));
        JavascriptExecutor jsExecutor18 = (JavascriptExecutor) driver;
        jsExecutor18.executeScript("arguments[0].scrollIntoView(true);", radioButton12);
        radioButton12.click();

        if (radioButton12.isSelected()) {
            // Le bouton radio de la douzième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la treizième question
        By radioButtonLocator13 = By.xpath("//input[@type='radio'][@name='12'][@value='3']");
        WebElement radioButton13 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator13));
        JavascriptExecutor jsExecutor19 = (JavascriptExecutor) driver;
        jsExecutor19.executeScript("arguments[0].scrollIntoView(true);", radioButton13);
        radioButton13.click();

        if (radioButton13.isSelected()) {
            // Le bouton radio de la treizième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la quatorzième question
        By radioButtonLocator14 = By.xpath("//input[@type='radio'][@name='13'][@value='2']");
        WebElement radioButton14 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator14));
        JavascriptExecutor jsExecutor20 = (JavascriptExecutor) driver;
        jsExecutor20.executeScript("arguments[0].scrollIntoView(true);", radioButton14);
        radioButton14.click();

        if (radioButton14.isSelected()) {
            // Le bouton radio de la quatorzième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la quinzième question
        By radioButtonLocator15 = By.xpath("//input[@type='radio'][@name='14'][@value='4']");
        WebElement radioButton15 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator15));
        JavascriptExecutor jsExecutor21 = (JavascriptExecutor) driver;
        jsExecutor21.executeScript("arguments[0].scrollIntoView(true);", radioButton15);
        radioButton15.click();

        if (radioButton15.isSelected()) {
            // Le bouton radio de la quinzième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la seizième question
        By radioButtonLocator16 = By.xpath("//input[@type='radio'][@name='15'][@value='3']");
        WebElement radioButton16 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator16));
        JavascriptExecutor jsExecutor22 = (JavascriptExecutor) driver;
        jsExecutor22.executeScript("arguments[0].scrollIntoView(true);", radioButton16);
        radioButton16.click();

        if (radioButton16.isSelected()) {
            // Le bouton radio de la seizième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la dix-septième question
        By radioButtonLocator17 = By.xpath("//input[@type='radio'][@name='16'][@value='3']");
        WebElement radioButton17 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator17));
        JavascriptExecutor jsExecutor23 = (JavascriptExecutor) driver;
        jsExecutor23.executeScript("arguments[0].scrollIntoView(true);", radioButton17);
        radioButton17.click();

        if (radioButton17.isSelected()) {
            // Le bouton radio de la dix-septième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la dix-huitième question
        By radioButtonLocator18 = By.xpath("//input[@type='radio'][@name='17'][@value='1']");
        WebElement radioButton18 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator18));
        JavascriptExecutor jsExecutor24 = (JavascriptExecutor) driver;
        jsExecutor24.executeScript("arguments[0].scrollIntoView(true);", radioButton18);
        radioButton18.click();

        if (radioButton18.isSelected()) {
            // Le bouton radio de la dix-huitième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la dix-neuvième question
        By radioButtonLocator19 = By.xpath("//input[@type='radio'][@name='18'][@value='2']");
        WebElement radioButton19 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator19));
        JavascriptExecutor jsExecutor25 = (JavascriptExecutor) driver;
        jsExecutor25.executeScript("arguments[0].scrollIntoView(true);", radioButton19);
        radioButton19.click();

        if (radioButton19.isSelected()) {
            // Le bouton radio de la dix-neuvième question est maintenant sélectionné
        }
        // Sélection du bouton radio de la vingtième question
        By radioButtonLocator20 = By.xpath("//input[@type='radio'][@name='19'][@value='2']");
        WebElement radioButton20 = wait9.until(ExpectedConditions.elementToBeClickable(radioButtonLocator20));
        JavascriptExecutor jsExecutor26 =(JavascriptExecutor) driver;
        jsExecutor26.executeScript("arguments[0].scrollIntoView(true);", radioButton19);
        radioButton20.click();
        if (radioButton19.isSelected()) {
            // Le bouton radio de la dix-neuvième question est maintenant sélectionné
        }
        ////*[@id="submit"]

        By BtTermine = By.xpath("//*[@id=\"submit\"]");
        WebElement BtnTerminer = wait9.until(ExpectedConditions.elementToBeClickable(BtTermine));
        BtnTerminer.click();


        //Envoyer mail
        By Champmail = By.xpath("//*[@id=\"email\"]");
        WebElement chmail = driver.findElement(Champmail);
        //*[@id="submitMail"]
        By BtOk = By.xpath("//*[@id=\"submitMail\"]");
        WebElement BtnOk = driver.findElement(BtOk);

        chmail.sendKeys("yvette@yopmail.com");
        BtnOk.click();

        String nouvelleURL = "https://yopmail.com/fr/wm"; //   URL Yopmail

        driver.get(nouvelleURL);

        //*[@id="login"]
        By Champnom = By.className("ycptinput");
        WebElement chnom = driver.findElement(Champnom);
        //*[@id="submitMail"]
        By Btfleche = By.xpath("//*[@id=\"refreshbut\"]/button/i");
        WebElement Btnflech = driver.findElement(BtOk);

        chnom.sendKeys("yvette");
        Btnflech.click();

    }
}
