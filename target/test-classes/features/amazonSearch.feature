@tumu
Feature: Amazon Search

  @nutella
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given  kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java
  Scenario: TC2 kullanici amazonda Java aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  @samsung
  Scenario: TC03 kullanici samsung aratir
    When kullanici amazon anasayfasinda
    Then kullanici samsung icin arama yapar
    Then sonuclarin samsung icerdigini test eder
    And sayfayi kapatir