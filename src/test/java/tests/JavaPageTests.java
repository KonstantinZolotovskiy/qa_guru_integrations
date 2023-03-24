package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JavaPageTests extends TestBase {

    @Test
    @DisplayName("Проверка цены \"Курс Java\"")
    @Owner("K.Zolotovskiy")
    void javaPriceOptionsTest() {
        javaPage.openJavaPage()
                .checkCoursePrice(data.javaFirstOptionPrice, data.javaSecondOptionPrice, data.javaThirdOptionPrice);
    }

    @Test
    @DisplayName("Проерка заголовков занятий в учебном плане курса Java")
    @Owner("K.Zolotovskiy")
    void javaLessonsTitleTest() {
        javaPage.openJavaPage()
                .checkCourseSyllabus(data.javaLessonTitleList);
    }
}
