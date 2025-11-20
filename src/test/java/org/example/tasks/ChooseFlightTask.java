package org.example.tasks;

import org.example.userinterfaces.ReservePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ChooseFlightTask implements Task {

    public static ChooseFlightTask first(){
        return Tasks.instrumented(ChooseFlightTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReservePage.FIRST_FLIGHT)
        );
    }
}
