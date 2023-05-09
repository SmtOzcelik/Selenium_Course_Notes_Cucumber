Feature: US1004 Kullanici parametre ile configuration file i kullanibilme

  Scenario: TC07 configration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    And url in "amazon" icerdigini test eder
    Then sayfayi kapatir