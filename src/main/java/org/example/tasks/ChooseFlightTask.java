package org.example.tasks;

import org.example.interactions.ChooseFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ChooseFlightTask implements Task {

    public static ChooseFlightTask first(){
        return Tasks.instrumented(ChooseFlightTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ChooseFlight.toRegister());
    }
}
