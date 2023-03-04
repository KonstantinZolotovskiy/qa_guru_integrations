package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.JavaAdvancedPage;
import pages.JavaPage;
import pages.PythonPage;
import testdata.TestData;


public class TestBase {

    JavaPage javaPage = new JavaPage();
    JavaAdvancedPage javaAdvancedPage = new JavaAdvancedPage();
    PythonPage pythonPage = new PythonPage();
    TestData data = new TestData();

    @BeforeAll
    public static void setUp() {
        WebDriverProvider.setConfig();
    }

    @BeforeEach
    public void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach()
    public void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
