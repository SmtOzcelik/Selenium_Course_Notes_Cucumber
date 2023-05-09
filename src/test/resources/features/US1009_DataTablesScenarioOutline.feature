Feature: US1009 datatables sitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC14 kullanici 5 farkli giris yapabilmeli

    When kullanici "datatablesUrl" adresine girer
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And soyisim bolumune "<lastname>" yazar
    And position bolumune "<position>" yazar
    And ofis bolumune "<ofis>" yazar
    And starDate bolumune "<starDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular

    Examples:
    |firstname|lastname|position|office|extension|startDate|salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-5-5  |11000|
    |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000|
    |Fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000|
    |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|