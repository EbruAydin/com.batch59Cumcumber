# amazon sayfasina gidip sirasiyla nutella, java, elma, armut aratip
  # sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

  Feature: US1007 kullanici amazonda istedigi kelimeleri aratir
    Scenario Outline: TC12 amazonda listedeki elementleri aratma

      Given kullanici amazon anasayfasinda
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonucun "<istenenKelimeKontrol>" icerdigini test eder
      And sayfayi kapatir



      Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella     |nutella     |
      |java         |java         |
      |elma         |elma         |
      |armut        |armut        |

