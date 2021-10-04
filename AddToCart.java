package basePack_01_10_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

//	POLJA MORAJU BITI PRIVATE, PUBLIC ILI PROTECTED

    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[4]/div/div/h4/a")
    WebElement clickSamsung; // gde se ovo koristi (linija 23?)
    WebDriverWait wdwait;
    @FindBy(how = How.XPATH, using = "//*[@id='tbodyid']/div[2]/div/a")
    WebElement addToCart;

    public AddToCart(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait; // GDE KORISTIS WDWAIT?
    }

    public WebElement getClickSamsung() {
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a"));
        /*
         * NEMA POTREBE AKO JE OVO DEFINISANO NA LINIJI 14
         * u tom slucaju mozes brisati celu ovu get metodu i samo odraditi clickSamusn.click(); na liniji 41
         * *
         */
    }

    public WebElement getAddToCart() {
        return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")); // NEMA POTREBE AKO JE OVO DEFINISANO NA LINIJI 16

    }

    public void clickSamsungGalaxy() {
        this.getClickSamsung().click();
    }

    public void clickAdd(String clickAddButton) {
        this.getAddToCart().click();
        this.getAddToCart().sendKeys(Keys.ENTER); // MOZE DA SE POJEDNOSTAVI, VIDI KOMENTAR NA LINIJI 30
    }


}