package pages;

import io.qameta.allure.Step;
import pages.common.Components;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class JavaPage {

    Components components = new Components();

    private final static String TITLE = "Школа инженеров по автоматизации тестирования на Java";

    @Step("Открыть страницу \"Курсы Java\"")
    public JavaPage openJavaPage() {
        open("/");
        components.checkTitle(TITLE);
        return this;
    }

    @Step("Проверка цены на курс")
    public void checkCoursePrice(String firstOptionPrice, String secondOptionPrice, String thirdOptionPrice) {
        components.checkCoursePrice(firstOptionPrice, secondOptionPrice, thirdOptionPrice);
    }

    @Step("Проверка программы курса")
    public void checkCourseSyllabus(List<String> lessonTitleList) {
        components.clickSyllabusButton();
        components.checkCourseSyllabus(lessonTitleList);
    }
}
