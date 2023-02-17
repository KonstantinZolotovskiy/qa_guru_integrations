package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JavaAdvancePageTests extends TestBase {

    @Test
    @DisplayName("Проерка заголовков занятий в учебном плане курса Java Advance")
    @Owner("K.Zolotovskiy")
    void javaAdvanceLessonsTitleTest() {
        javaAdvancedPage.openJavaAdvancedPage()
                .checkCourseSyllabus(data.javaAdvanceLessonTitleList);
    }
}