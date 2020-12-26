package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseRapor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D26_AmazonHucreTesti extends TestBaseRapor {


    @Test
    public void hucreTest(){

        extentTest=extentReports.createTest("hucre testi","3.satir 7.sutundaki yazinin dogrulugunu test ettik");
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        extentTest.info("amazon sayfasina git");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.enAltaGit();
        extentTest.info("en alta git");
        String hucreYazisi=amazonPage.hucreYazisiGetir(3,7);
        extentTest.info("istedigin hucre yazisini al");
        Assert.assertTrue(hucreYazisi.contains("Home Services"));
        extentTest.pass("hucredeki yazi dogru, test PASS");


        Driver.closeDriver();

    }
    @Test
    public void amazonYazisi(){
        //tabloda 9 hucrede "Amazon" yazisi bulundugunu test edin
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.enAltaGit();

        int kelimeSayici=0;
        for (int i=1;i<=amazonPage.satirlarListesi.size();i+=2){
            for (int j=1;j<=amazonPage.birinciSatirElementleri.size();j+=2){

                if(amazonPage.hucreYazisiGetir(i,j).contains(ConfigReader.getProperty("aranan_kelime"))){
                    kelimeSayici++;
                }

            }

        }
        System.out.println(kelimeSayici);

    }
}
