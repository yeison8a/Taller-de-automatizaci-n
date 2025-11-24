package org.example.tasks;

import org.example.interactions.FillPurchaseForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.Map;

public class FillPurchaseFormTask implements Task {

    private final Map<String, String> data;

    public FillPurchaseFormTask(Map<String, String> data){
        this.data = data;
    }

    public static FillPurchaseFormTask withData(Map<String, String> data){
        return Tasks.instrumented(FillPurchaseFormTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(FillPurchaseForm.toRegister(data));
    }
}
