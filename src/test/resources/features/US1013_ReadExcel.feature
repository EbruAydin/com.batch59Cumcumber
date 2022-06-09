Feature: US1013 kullanici excel bilgilerine ulasir
  Scenario: TC18 kullanici excel bilgilerini kullanir

    Given kullanici excel dosyasini kullanilabilir hale getirir
    And 1.satirdaki 2.hucreyi yazdirir
    And baskenti Jakarta olan ulke ismini yazdirir
    And Ulke sayisinin 190 oldugunu test eder
    And Fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder

  #Tum bilgileri map olarak kaydedelim
  #baskenti Jakarta olan ulkenin tum bilgilerini yazdiralim
  #Satir ve sutun bilgisi ile hucre yazdiralim