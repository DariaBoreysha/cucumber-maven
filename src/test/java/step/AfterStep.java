package step;

import io.cucumber.java.AfterAll;


import static com.codeborne.selenide.Selenide.closeWebDriver;

public class AfterStep {

    @AfterAll
    public static void tearDown(){
        closeWebDriver();
    }

}
