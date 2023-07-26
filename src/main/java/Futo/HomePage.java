package Futo;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    @FindBy(xpath = "//a[@type=\"button\"]")
    private WebElement btnEntrance;



    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement login;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//button[@role=\"button\"]")
            private WebElement aut;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getBtnEntrance() {
        return btnEntrance;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getAut() {
        return aut;
    }

    public HomePage clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public HomePage moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public HomePage inputSearch(String text) {
        //searchInput.clear();
        //searchInput.sendKeys(text);
        return this;
    }
}