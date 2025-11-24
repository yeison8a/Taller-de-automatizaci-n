package org.example.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.example.userinterfaces.FlightsPage;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectCities implements Interaction{

    private final String from;
    private final String to;

    public SelectCities(String from, String to){
        this.from = from;
        this.to = to;
    }    

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            SelectFromOptions.byVisibleText(from).from(FlightsPage.FROM_PORT),
            SelectFromOptions.byVisibleText(to).from(FlightsPage.TO_PORT),
            Click.on(FlightsPage.FIND_FLIGHTS)
    );
    }

    public static SelectCities toRegister(String from, String to){
        return Tasks.instrumented(SelectCities.class, from, to);
    }
    
}
