package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage obj = new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {

        obj.newButonu.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
        obj.firstName.sendKeys(firstname);
    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {
        obj.lastName.sendKeys(lastName);

    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        obj.position.sendKeys(position);
    }

    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
        obj.office.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        obj.extn.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        obj.startDate.sendKeys(startDate);
    }

    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        obj.salary.sendKeys(salary);
    }


    /*
    @And("tum bilgileri {string},{string},{string},{string},{string},{string},{string} girer")
    public void tumBilgileriGirer(String firstName, String lastName,
                                  String position, String office ,
                                  String extension, String startDate,
                                  String salary) {
        actions.sendKeys(firstName).sendKeys(Keys.TAB).sendKeys(lastName).sendKeys(Keys.TAB)
                .sendKeys(position).sendKeys(Keys.TAB).sendKeys(office).sendKeys(Keys.TAB)
                .sendKeys(extension).sendKeys(Keys.TAB).sendKeys(startDate).sendKeys(Keys.TAB).sendKeys(salary).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
     */
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        obj.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        obj.search.sendKeys(firstname);


    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(obj.aramaSonucIlkElement.getText().contains(firstname));
    }
}
