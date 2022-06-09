package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuAppPage;
import utilities.Driver;

import java.time.Duration;


public class HerokuAppDefinitions {
    HerokuAppPage herokuappPage=new HerokuAppPage();
    @Given("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButtonu.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteElementButonu));
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(herokuappPage.deleteElementButonu.isDisplayed());
    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basarak_butonu_silin() {
        herokuappPage.deleteElementButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_edin() {
        Assert.assertTrue(herokuappPage.deleteListesi.isEmpty());
    }


}
