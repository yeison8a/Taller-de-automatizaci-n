package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {

    public static final Target MESSAGE =
            Target.the("mensaje de confirmación")
                    .located(By.tagName("h1"));
}
