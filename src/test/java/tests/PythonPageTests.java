package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PythonPageTests extends TestBase {

    @Test
    @DisplayName("Проверка цены \"Курс Python\"")
    @Owner("K.Zolotovskiy")
    void pythonPriceOptionsTest() {
        pythonPage.openPythonPage()
                .checkCoursePrice(data.firstOptionPrice, data.secondOptionPrice, data.thirdOptionPrice);
    }

    @Test
    @DisplayName("Проерка заголовков занятий в учебном плане курса Python")
    @Owner("K.Zolotovskiy")
    void pythonLessonsTitleTest() {
        pythonPage.openPythonPage()
                .checkCourseSyllabus(data.pythonLessonTitleList);
    }
}
