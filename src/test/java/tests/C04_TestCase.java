package tests;

import page.amazon.AmazonHomePage;
import utils.Driver;

//Örnek bir çalışma...
public class C04_TestCase {


    // https://www.amazon.com/ a gidilir
    // Arama kutusuna {keyword} yazildiktan sonra arama yapilir
    // Gelen ilk urun sepete eklenir
    // Sepete gidilir
    // Sepette alinan urunun sayisi {quantity} e cikarilir
    // Sepet tutari urunfiyati * 3 olarak bulunmalidir.
    // keywords = 'microphone', 'gaming keyboard', 'gaming mouse'
    // quantity = 2            , 3               ,  4

public void test(){

    Driver.getDriver().get("https://www.amazon.com/");

    AmazonHomePage hp=new AmazonHomePage();



}





}
