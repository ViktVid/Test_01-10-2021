package basePack_01_10_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest_01_Sep {

    public static WebDriver driver;
    public StoreLogInPage storeLogInPage;
    public AddToCart addToCart;
    public Cart cart;
    public XcelReader xcelReader;
    public String homeUrl;
    public static WebDriverWait wdwait;

    @BeforeClass
    public void setUp() throws IOException, InvalidFormatException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

        driver = new ChromeDriver();
        storeLogInPage = new StoreLogInPage(driver, wdwait);
        addToCart = new AddToCart(driver, wdwait);
        cart = new Cart(driver, wdwait);
        xcelReader = new XcelReader("C:\\Users\\User\\Desktop\\Test_01-Sep.xlsx"); // FAJLOVE UVEK DRZI U SKLOPU PROJEKTA U FOLDER KOJI NE MORA ICI NA GIT
        homeUrl = xcelReader.getStringData("Sheet1", 1, 0);
        wdwait = new WebDriverWait(driver, 25);

    }
	
/*	@AfterClass
	public void TearDown() {
		driver.close();
		driver.quit();
	}
	*/
}
