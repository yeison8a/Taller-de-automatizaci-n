package org.example.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.example.userinterfaces.ReservePage;

public class ChooseFlight implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(ReservePage.FIRST_FLIGHT));
    }
    
    public static ChooseFlight toRegister(){
        return Tasks.instrumented(ChooseFlight.class);
    }
}
