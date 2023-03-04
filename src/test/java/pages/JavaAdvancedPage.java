package pages;

import io.qameta.allure.Step;
import pages.common.Components;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class JavaAdvancedPage {

    Components components = new Components();

    private final static String TITLE = "Автоматизация тестирования на Java Advanced";

    @Step("Открыть страницу \"Курсы Java+\"")
    public JavaAdvancedPage openJavaAdvancedPage() {
        open("/java-advanced");
        components.checkTitle(TITLE);
        return this;
    }

    @Step("Проверка программы курса")
    public void checkCourseSyllabus(List<String> lessonTitleList) {
        components.clickSyllabusButton();
        components.checkCourseSyllabus(lessonTitleList);
    }
}
