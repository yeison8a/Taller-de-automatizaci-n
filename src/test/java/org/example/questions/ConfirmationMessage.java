package org.example.questions;

import org.example.userinterfaces.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmationMessage implements Question<String>{

    public static ConfirmationMessage value(){
        return new ConfirmationMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return ConfirmationPage.MESSAGE.resolveFor(actor).getText();
    }
}
