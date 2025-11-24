package org.example.tasks;

import org.example.userinterfaces.FlightsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectCitiesTask implements Task {

    private final String from;
    private final String to;

    public SelectCitiesTask(String from, String to){
        this.from = from;
        this.to = to;
    }

    public static SelectCitiesTask between(String from, String to){
        return Tasks.instrumented(SelectCitiesTask.class, from, to);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(from).from(FlightsPage.FROM_PORT),
                SelectFromOptions.byVisibleText(to).from(FlightsPage.TO_PORT),
                Click.on(FlightsPage.FIND_FLIGHTS)
        );
    }
}
