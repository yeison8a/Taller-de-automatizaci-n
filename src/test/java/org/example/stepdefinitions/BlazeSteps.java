package org.example.stepdefinitions;

import org.example.questions.ConfirmationMessage;
import org.example.tasks.ChooseFlightTask;
import org.example.tasks.FillPurchaseFormTask;
import org.example.tasks.SelectCitiesTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class BlazeSteps {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre BlazeDemo")
    public void abrir() {
        OnStage.theActorCalled("usuario")
                .attemptsTo(Open.url("https://blazedemo.com/"));
    }

    @When("selecciona la ciudad de origen {string} y destino {string}")
    public void seleccionarCiudades(String from, String to) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(SelectCitiesTask.between(from, to));
    }

    @When("selecciona el primer vuelo disponible")
    public void seleccionarVuelo() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(ChooseFlightTask.first());
    }

    @When("completa el formulario de compra con:")
    public void completarFormulario(Map<String, String> datos) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(FillPurchaseFormTask.withData(datos));
    }

    @Then("debería ver el mensaje {string}")
    public void validarMensaje(String esperado) {

        String real = ConfirmationMessage.value()
                .answeredBy(OnStage.theActorInTheSpotlight());

        assertThat(real).isEqualTo(esperado);
    }
}
