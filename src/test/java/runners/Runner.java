package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@parametre",
        dryRun = true
)



public class Runner {


    /*
    Bir framework de bir tek runner classi yeterli olabilir.
    Runner classindan class body sinde hic bir şey olmaz
    Runner classimizi önemli yapan iki adet annotian vardir
     @RunWith(Cucumber.class) notasyonu Runner class inda calisma ozelligi katar
     Bu notasyon oldugu icin Cucumber framework umuzde Junit kullanmayi tercih ediyoruz

    features : Runner dosyanin feature dosyalarini nereden bulacagini tarif eder
    glue : step definitions dosyalarini nerede bulacagimizi gösterir
    tags : o an hangi tag i calistirmak istiyorsak onu belli eder

    dryRun: iki secenek var
    dryRun=true ; yazdigimizda Testimizi calistirmadan sadece eksik adimlari bize verir

     */
}
