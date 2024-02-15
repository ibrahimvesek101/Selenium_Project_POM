package tests;

import org.testng.annotations.Test;
import page.AmazonLogin;

public class AmazonDemoTest {
    AmazonLogin al = new AmazonLogin();

    @Test
    public void test01() throws InterruptedException {
        al.aramaYap("mac");
        Thread.sleep(2000);
    }
}
