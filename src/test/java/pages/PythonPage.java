package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.common.Components;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PythonPage {

    Components components = new Components();

    private final static String TITLE = "Курс инженеров по автоматизации тестирования на Python";

    SelenideElement syllabusButton = $(".show-programm-btn");

    @Step("Открыть страницу \"Курсы Python\"")
    public PythonPage openPythonPage() {
        open("/python");
        components.checkTitle(TITLE);
        return this;
    }

    @Step("Проверка цены на курс")
    public PythonPage checkCoursePrice(String firstOptionPrice, String secondOptionPrice, String thirdOptionPrice) {
        components.checkCoursePrice(firstOptionPrice, secondOptionPrice, thirdOptionPrice);
        return this;
    }

    @Step("Проверка программы курса")
    public PythonPage checkCourseSyllabus(List<String> lessonTitleList) {
        syllabusButton.scrollIntoView(false).click();
        components.checkCourseSyllabus(lessonTitleList);
        return this;
    }
}
