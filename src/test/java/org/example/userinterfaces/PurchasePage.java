package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePage {

    public static final Target NAME = Target.the("nombre").located(By.id("inputName"));
    public static final Target ADDRESS = Target.the("dirección").located(By.id("address"));
    public static final Target CITY = Target.the("ciudad").located(By.id("city"));
    public static final Target STATE = Target.the("estado").located(By.id("state"));
    public static final Target ZIPCODE = Target.the("código postal").located(By.id("zipCode"));
    public static final Target CARD_TYPE = Target.the("tipo tarjeta").located(By.id("cardType"));
    public static final Target CARD_NUMBER = Target.the("número tarjeta").located(By.id("creditCardNumber"));
    public static final Target MONTH = Target.the("mes").located(By.id("creditCardMonth"));
    public static final Target YEAR = Target.the("año").located(By.id("creditCardYear"));
    public static final Target NAME_ON_CARD = Target.the("nombre en tarjeta").located(By.id("nameOnCard"));

    public static final Target PURCHASE_BUTTON =
            Target.the("botón comprar vuelo")
                    .located(By.cssSelector("input[value='Purchase Flight']"));

}
