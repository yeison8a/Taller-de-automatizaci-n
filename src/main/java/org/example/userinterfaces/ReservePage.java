package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservePage {

    public static final Target FIRST_FLIGHT =
            Target.the("primer vuelo disponible")
                    .located(By.cssSelector("table tbody tr:nth-child(1) td input"));
}
