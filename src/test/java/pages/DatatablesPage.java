package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablesPage {
   public DatatablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;

   @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastNameButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensionButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryButonu;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButonu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement aramaSonucIlkElemeneti;

}
