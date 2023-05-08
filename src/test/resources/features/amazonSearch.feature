Feature: Amazon Search

  Scenario: TC01 kullanici amazonda kelime aratir

    Given  kullanici amazon anasayfasinda
    Then Kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir