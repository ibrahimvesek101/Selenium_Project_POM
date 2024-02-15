package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class C01_DriverUsage {

    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
Verify title contains OrangeHRM.
Use Driver Class.
     */
    @Test
    public void verifyTitle() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Test Failed. Title isn't OrangeHRMLive");
        Driver.closeDriver();
    }
}
