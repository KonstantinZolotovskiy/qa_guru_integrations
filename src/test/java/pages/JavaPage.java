package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.common.Components;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class JavaPage {

    Components components = new Components();

    private final static String TITLE = "Школа инженеров по автоматизации тестирования на Java";

    SelenideElement syllabusButton = $("#show-programm-btn button");

    @Step("Открыть страницу \"Курсы Java\"")
    public JavaPage openJavaPage() {
        open("/");
        components.checkTitle(TITLE);
        return this;
    }

    @Step("Проверка цены на курс")
    public JavaPage checkCoursePrice(String firstOptionPrice, String secondOptionPrice, String thirdOptionPrice) {
        components.checkCoursePrice(firstOptionPrice, secondOptionPrice, thirdOptionPrice);
        return this;
    }

    @Step("Проверка программы курса")
    public JavaPage checkCourseSyllabus(List<String> lessonTitleList) {
        syllabusButton.scrollIntoView(false).click();
        components.checkCourseSyllabus(lessonTitleList);
        return this;
    }
}
