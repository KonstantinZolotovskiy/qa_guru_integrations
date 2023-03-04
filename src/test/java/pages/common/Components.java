package pages.common;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Components {

    SelenideElement
            header = $("h1.title"),
            priceButton = $("[href=\"#course_price\"]"),
            modalWindowWithSyllabus = $(".lesson-list"),
            firstOption = $("[data-param=\"data/0/price\"]"),
            secondOption = $("[data-param=\"data/1/price\"]"),
            thirdOption = $("[data-param=\"data/2/price\"]"),
            syllabusButton = $(".main-header__menu .show-programm-btn-2");

    ElementsCollection lessonsTitle = $$x("//div[@class='link title']");

    public void checkTitle(String title) {
        header.shouldHave(exactText(title));
    }

    public void checkCoursePrice(String firstOptionPrice, String secondOptionPrice, String thirdOptionPrice) {
        priceButton.click();
        firstOption.shouldHave(text(firstOptionPrice));
        secondOption.shouldHave(text(secondOptionPrice));
        thirdOption.shouldHave(text(thirdOptionPrice));
    }

    public void checkCourseSyllabus(List<String> lessonTitleList) {
        modalWindowWithSyllabus.should(visible);
        lessonTitleList.forEach(e -> lessonsTitle.find(text(e)).scrollIntoView(true).should(visible));
    }

    public void clickSyllabusButton() {
        syllabusButton.should(visible).click();
    }
}
