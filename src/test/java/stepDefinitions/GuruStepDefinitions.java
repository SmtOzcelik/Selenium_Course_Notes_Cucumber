package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage=new GuruPage();

    @Given("{string} sutununda ki tum degerleri yazdirir")
    public void sutununda_ki_tum_degerleri_yazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi=guruPage.baslikListesi;
        // listemiz Webelementlerden olusuyor. dolayisiyla bu webelementlerden hangisi
        // istenen sutun basligini tasiyor bilmeyiiz

        int istenenBaslikIndexi=-3; // istenilen index i bulmak ve loop a dahil etmek icin olmayacak bi sayiyi atadik
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1;// +1 yaptik cunku tablo index uzerine calismiyor
                break;
            }
        }
        // for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilaştirdim
        // loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve bulundu ise yoluma devam etmek istiyorum
        if (istenenBaslikIndexi!=-3){ //baslik bulundu
        List<WebElement> istenenSutundakiElementler= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenSutundakiElementler
                 ) {
                System.out.println(each.getText());
            }
        }else {//baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }



    }
}
