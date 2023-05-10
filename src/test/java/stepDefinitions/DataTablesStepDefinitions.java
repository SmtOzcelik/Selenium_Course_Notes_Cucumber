package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DatatablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {
    DatatablesPage datatablesPage=new DatatablesPage();
    @When("kullanici {string} adresine girer")
    public void kullanici_adresine_girer(String istenilenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenilenUrl));
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        datatablesPage.newButonu.click();

    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
        datatablesPage.firstNameButonu.sendKeys(firstname);

    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {
        datatablesPage.lastNameButonu.sendKeys(lastname);

    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        datatablesPage.positionButonu.sendKeys(position);

    }
    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String ofis) {
        datatablesPage.officeButonu.sendKeys(ofis);

    }
    @Then("starDate bolumune {string} yazar")
    public void star_date_bolumune_yazar(String starDate) {
        datatablesPage.startDateButonu.sendKeys(starDate);

    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        datatablesPage.salaryButonu.sendKeys(salary);

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        datatablesPage.createButonu.click();

    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String fistname) {
        datatablesPage.search.sendKeys(fistname);
    }


    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        Assert.assertTrue(datatablesPage.aramaSonucIlkElemeneti.getText().contains(firstname));
    }
}
