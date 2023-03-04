package pages;

import io.qameta.allure.Step;
import pages.common.Components;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class PythonPage {

    Components components = new Components();

    private final static String TITLE = "Курс инженеров по автоматизации тестирования на Python";


    @Step("Открыть страницу \"Курсы Python\"")
    public PythonPage openPythonPage() {
        open("/python");
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
