#https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
#“Add Element” butona basin
#“Delete” butonu gorunur oluncaya kadar bekleyin
#“Delete” butonunun gorunur oldugunu test edin
#Delete butonuna basarak butonu silin
#Delete butonunun gorunmedigini test edin

  Feature: US1010 herokuapp Delete testi

    Scenario: TC15 herokuapp'dan delete butonu calismali
      Given kullanici "herokuappUrl" anasayfasinda
      And add element butonuna basar
      Then Delete butonu gorunur oluncaya kadar bekler
      And Delete buton    unun gorunur oldugunu test eder
      Then Delete butonuna basar
      And Delete butonunun gorunmedigini test eder
      And sayfayi kapatir