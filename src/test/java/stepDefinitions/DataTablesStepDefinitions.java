package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {
    @When("kullanici {string} adresine girer")
    public void kullanici_adresine_girer(String istenilenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenilenUrl));
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {

    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String string) {

    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String string) {

    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String string) {

    }
    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String string) {

    }
    @Then("starDate bolumune {string} yazar")
    public void star_date_bolumune_yazar(String string) {

    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String string) {

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {

    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

    }



}
