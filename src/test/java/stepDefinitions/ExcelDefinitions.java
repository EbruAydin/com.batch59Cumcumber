package stepDefinitions;

import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDefinitions {

    Workbook workbook;

    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu = "src/test/resources/ulkeler (1).xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);
    }

    @Given("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreyazisi = workbook.
                getSheet("Sayfa1").getRow(satir).getCell(sutun).toString();

        System.out.println(satir + ". satir " + sutun + ".sutundaki deger : " + istenenHucreyazisi);

    }

    @Given("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {

        //for loop ile tum satirlari kontrol etmek gerekiyor
        //bunun icin de satir sayisina ihtiyac var

        int satirSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <= satirSayisi; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")) {
                System.out.println("Baskenti Jakarta olan ulke : " + workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
        }
    }

    @Given("Ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {

        int actualUlkeSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi == actualUlkeSayisi);
    }

    @Given("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer fizikiKullanilanSatir) {

        int actualFizKulSatir = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanilanSatir == actualFizKulSatir);
    }


}
