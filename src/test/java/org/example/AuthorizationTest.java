/*


package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;

public class AuthorizationTest extends AbstractTest {
*/


//Как подключить класс авторизации с абстрактным классом настроек driver?
/*
    @Test
    void autoTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        driver.get("https://futlab.ru");
*/





    /*//Разобраться с кодом!

//Клик по кнопке "Вход"
    driver.findElement(By.xpath("//a[@type=\"button\"]")).click();

        //Авторизация, заполнения полей логина и пароля
        WebElement login = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        login.sendKeys("selena");

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("Test111");
        //Клик по кнопке "Авторизация"
        driver.findElement(By.xpath("//button[@role=\"button\"]")).click();

    }*/

 /*
 try {

            driver.get("https://futopedia.ru/login?redirectPath=/FIFA22");
            Thread.sleep(2000L);
        }catch (Exception e){}
        driver.quit();

        @FindBy(xpath = "//*[contains(@id, 'passp-field-login')]")
        private WebElement loginField;

        @FindBy(xpath = "//*[contains(text(), 'Войти')]/..")
        private WebElement loginBtn;

        @FindBy(xpath = "//*[contains(@id, 'passp-field-passwd')]")
        private WebElement passwdField;



        public void clickLoginBtn() {
            loginBtn.click(); }*/

        //Open Home Page
        //кликаем по форме 38, которая открывается на главной (Всплывающее окно)
        //1)Форма 38, если база пустая

       /* WebElement form38 = driver.findElement(By.xpath("//button[@routerlink=\"../form38\"]"));
        form38.click();*/



