package org.example;


        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.jupiter.api.AfterAll;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.BeforeEach;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;

        import java.time.Duration;
        import java.util.concurrent.TimeUnit;

        public abstract class AbstractTest {

    private static WebDriver driver;

            //private static Long time = 5L;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @BeforeEach
    void goTo(){
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://futlab.ru"),
                "Страница не доступна");
    }
    @AfterAll
    static void close(){
        //driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}