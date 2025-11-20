package org.example.tasks;

import org.example.userinterfaces.PurchasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

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

        actor.attemptsTo(
                Enter.theValue(data.get("name")).into(PurchasePage.NAME),
                Enter.theValue(data.get("address")).into(PurchasePage.ADDRESS),
                Enter.theValue(data.get("city")).into(PurchasePage.CITY),
                Enter.theValue(data.get("state")).into(PurchasePage.STATE),
                Enter.theValue(data.get("zipcode")).into(PurchasePage.ZIPCODE),

                SelectFromOptions.byVisibleText(data.get("cardType")).from(PurchasePage.CARD_TYPE),

                Enter.theValue(data.get("cardNumber")).into(PurchasePage.CARD_NUMBER),
                Enter.theValue(data.get("month")).into(PurchasePage.MONTH),
                Enter.theValue(data.get("year")).into(PurchasePage.YEAR),
                Enter.theValue(data.get("nameOnCard")).into(PurchasePage.NAME_ON_CARD),

                Click.on(PurchasePage.PURCHASE_BUTTON)
        );
    }
}
