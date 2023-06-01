package Page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class Pagetest {

    private WebDriver driver;
    private Page1 page1;
    private Page2 page2;
    private Page5 url;
    private Page5 page5;



    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        page1 = new Page1(driver);
        page2 = new Page2(driver);
        url = new Page5(driver);
        page5 = new Page5(driver);

    }

    @Test
    public void testNavigationEntrePages() throws InterruptedException {
        //ouvrir l'url
        driver.get("https://hightest.nc/");
        // cliquer sur le bouton toolbox
        Thread.sleep(30000);
        page1.cliquerSurBouton();

        //dans la page toolbox
        Thread.sleep(30000);
        page2.closePopup();
        Thread.sleep(30000);
        page2.acceptCookies();
        //cliquer sur le bouton Francais sur "Quiz ISTQB niveau Foundation"
        page2.clickFrancaisLink();

        // Passer à la nouvelle fenêtre et effectuer les actions nécessaires
        String currentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        windows.remove(currentWindow);
        String newWindow = windows.iterator().next();
        driver.switchTo().window(newWindow);

        // selection du radio bouton
        Page3 newWindowActions = new Page3(driver);
        newWindowActions.selectRadioButton("0", "1");
        newWindowActions.selectRadioButton("1", "2");
        newWindowActions.selectRadioButton("2", "1");
        newWindowActions.selectRadioButton("3", "2");
        newWindowActions.selectRadioButton("4", "2");
        newWindowActions.selectRadioButton("5", "3");
        newWindowActions.selectRadioButton("6", "2");
        newWindowActions.selectRadioButton("7", "4");
        newWindowActions.selectRadioButton("8", "1");
        newWindowActions.selectRadioButton("9", "3");
        newWindowActions.selectRadioButton("10", "4");
        newWindowActions.selectRadioButton("11", "2");
        newWindowActions.selectRadioButton("12", "3");
        newWindowActions.selectRadioButton("13", "2");
        newWindowActions.selectRadioButton("14", "4");
        newWindowActions.selectRadioButton("15", "3");
        newWindowActions.selectRadioButton("16", "3");
        newWindowActions.selectRadioButton("17", "1");
        newWindowActions.selectRadioButton("18", "2");
        newWindowActions.selectRadioButton("19", "2");

        newWindowActions.clickTerminerButton();

        //page resultat , ajout adresse email
        Page4 mail = new Page4(driver);
        mail.Chmail("yvette@yopmail.com");
        mail.BtOK();

        //redirection vers la page yopmail
        Page5 url = new Page5(driver);
        url.accederYopmail();
        //ajout mail
        Page5 page5 = PageFactory.initElements(driver, Page5.class);
        page5.Chyopmail("yvette");
        page5.BtOKf();

        //chargement contenu dans l'email
        Page6 inboxPage = new Page6(driver);
        inboxPage.waitForInboxPageLoad();

        //verification du mot "100 % de réussite" dans l'email
        Thread.sleep(30000);
        // Trouver l'élément iframe
        WebElement iframeElement = driver.findElement(By.xpath("//*[@id='ifmail']"));

        // Basculer vers le contexte de l'iframe
        driver.switchTo().frame(iframeElement);

        //  le contexte de l'iframe, pour chercher le texte à l'intérieur
        WebElement emailBodyElement = driver.findElement(By.xpath("/html/body"));
        String emailBodyText = emailBodyElement.getText();

        // Vérifiez si le texte "100 % de réussite" est présent dans le corps de l'e-mail
        boolean isPresent = emailBodyText.contains("100 % de réussite");

        // Affichage du résultat
        System.out.println(isPresent ?
                        "Oui, le mot '100 % de réussite' s'affiche dans l'e-mail" :
                        "Non, le mot '100 % de réussite' ne s'affiche pas dans l'e-mail");

        // Revenez au contexte par défaut (en dehors de l'iframe)
        driver.switchTo().defaultContent();

    }
}






