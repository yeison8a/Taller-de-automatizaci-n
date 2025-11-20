package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightsPage {

    public static final Target FROM_PORT =
            Target.the("ciudad origen")
                    .located(By.name("fromPort"));

    public static final Target TO_PORT =
            Target.the("ciudad destino")
                    .located(By.name("toPort"));

    public static final Target FIND_FLIGHTS =
            Target.the("botón buscar vuelos")
                    .located(By.cssSelector("input[value='Find Flights']"));
}
