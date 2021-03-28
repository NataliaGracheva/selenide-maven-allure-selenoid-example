package ru.heisenbug;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@ExtendWith({MyAllureSetup.class, MySelenoidSetup.class})
public class MyTest {

    @BeforeEach
    public void setUp() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open("https://todomvc.com/examples/angularjs/#/");
    }

    @Test
    @Description("тест должен пройти")
    public void test1() {
        $("header h3").shouldHave(Condition.text("AngularJS"));
    }

    @Test
    @Description("тест должен упасть")
    public void test2() {
        $("header h3").shouldNotHave(Condition.text("AngularJS"));
    }
}
