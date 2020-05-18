package my.root.packagename;

import io.wcm.qa.glnm.device.TestDevice;
import io.wcm.qa.glnm.providers.TestDeviceProvider;
import io.wcm.qa.glnm.webdriver.WebDriverManagement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Sample Test for Galenium.
 */
public class AnotherSampleTest extends AbstractExampleBase {

    TestDevice testDevice;
    WebDriver driver;

    @Factory(dataProviderClass = TestDeviceProvider.class, dataProvider = TestDeviceProvider.GALENIUM_TEST_DEVICES_ALL)
    public AnotherSampleTest(TestDevice testDevice) {

        super(testDevice);
        this.testDevice = testDevice;
    }

    @Test
    public void testIt() {

        System.out.println("Hello Galenium!");
        driver = WebDriverManagement.getDriver(getDevice());
        driver.get(getBaseUrl());
        driver.findElement(By.name("q")).sendKeys("BrowserStack\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.getTitle());
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown()  {
        if(driver != null) {
            WebDriverManagement.closeDriver();
        }
    }

}
