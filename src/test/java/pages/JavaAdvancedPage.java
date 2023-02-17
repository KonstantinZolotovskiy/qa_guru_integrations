package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.common.Components;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JavaAdvancedPage {

    Components components = new Components();

    private final static String TITLE = "Автоматизация тестирования на Java Advanced";

    SelenideElement syllabusButton = $("#show-programm-btn button");

    @Step("Открыть страницу \"Курсы Java+\"")
    public JavaAdvancedPage openJavaAdvancedPage() {
        open("/java-advanced");
        components.checkTitle(TITLE);
        return this;
    }

    @Step("Проверка программы курса")
    public JavaAdvancedPage checkCourseSyllabus(List<String> lessonTitleList) {
        syllabusButton.scrollIntoView(true).click();
        components.checkCourseSyllabus(lessonTitleList);
        return this;
    }
}
