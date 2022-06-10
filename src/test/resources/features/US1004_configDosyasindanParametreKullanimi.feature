Feature: US1004 Kullanici parametre ile configuration file'i kullanabilmeli

  @config @pr2
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici 3 sn bekler
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir