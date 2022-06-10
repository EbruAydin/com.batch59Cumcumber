#https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
#“Add Element” butona basin
#“Delete” butonu gorunur oluncaya kadar bekleyin
#“Delete” butonunun gorunur oldugunu test edin
#Delete butonuna basarak butonu silin
#Delete butonunun gorunmedigini test edin

  Feature: US1010 herokuapp Delete testi

    @heroku @sirali @pr1
    Scenario: TC15 herokuapp'dan delete butonu calismali
      Given kullanici "herokuappUrl" anasayfasinda
      And Add Element butonuna basar
      Then kullanici 3 sn bekler
      Then Delete butonu gorunur oluncaya kadar bekler
      And Delete butonunun gorunur oldugunu test eder
      Then kullanici 2 sn bekler
      Then Delete butonuna basar
      And Delete butonunun gorunmedigini test eder
      And sayfayi kapatir