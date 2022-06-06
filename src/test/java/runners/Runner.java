package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@parametre",
        dryRun=true
)

public class Runner {
    /*
    Bir framework'te bir Runner class'i yeterli olabilir
    Runner class'inin body'sinde hicbir sey olmaz
    Runner icin 2 onemli notasyon vardir
    1-@RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyonu oldugu icin Cucumber framework'umuzde Junit kullanmayi tercih ediyoruz
    2-@CucumberOptions(
features: Runner dosyasinin feature dosyalarini neerden bulacagini tarif eder
glue: step definitions dosyalarini nerede bulacagimizi gosterir
tags: o an hangi tag'i calistirmak istiyorsak onu belli eder

dryRun: iki secenek var
dryRun=true: testimizi calistirmadan asadece eksik adimlari bize verir
dryRun=false: bunda testlerimizi calistirir

tags="@java or @ihopne" dersek ikisinden birini calistirir

NOTTT!! BackgroundFeature classini run etmek istersek Feature uzerine genelde @wip yazilir
burada da tags="@wip" yazmamiz gerekir ONEMLIII
    )
     */
}
