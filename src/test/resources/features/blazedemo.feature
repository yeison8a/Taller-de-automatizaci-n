
  Feature: Compra de un vuelo a través de la plataforma BlazeDemo

  @Blaze
  Scenario: Compra exitosa en BlazeDemo
    Given que el usuario abre BlazeDemo
    When selecciona la ciudad de origen "Boston" y destino "Rome"
    When selecciona el primer vuelo disponible
    When completa el formulario de compra con:
      | name        | John Doe       |
      | address     | 123 Main St    |
      | city        | Miami          |
      | state       | Florida        |
      | zipcode     | 33010          |
      | cardType    | Visa           |
      | cardNumber  | 123456781234   |
      | month       | 12             |
      | year        | 2025           |
      | nameOnCard  | John Doe       |
    Then debería ver el mensaje "Thank you for your purchase today!"

    @Blaze
    Scenario: Compra desde Portland hacia Berlín
      Given que el usuario abre BlazeDemo
      When selecciona la ciudad de origen "Portland" y destino "Berlin"
      When selecciona el primer vuelo disponible
      When completa el formulario de compra con:
        | name        | Laura Smith     |
        | address     | Av. Central 101 |
        | city        | Medellín        |
        | state       | Antioquia       |
        | zipcode     | 050001          |
        | cardType    | Visa            |
        | cardNumber  | 444444444444    |
        | month       | 06              |
        | year        | 2026            |
        | nameOnCard  | Laura Smith     |
      Then debería ver el mensaje "Thank you for your purchase today!"

    @Blaze
    Scenario: Compra con tarjeta American Express
      Given que el usuario abre BlazeDemo
      When selecciona la ciudad de origen "Philadelphia" y destino "London"
      When selecciona el primer vuelo disponible
      When completa el formulario de compra con:
        | name        | Ana Torres      |
        | address     | 8th Street 55   |
        | city        | Caracas         |
        | state       | DC District     |
        | zipcode     | 1050            |
        | cardType    | American Express |
        | cardNumber  | 373737373737    |
        | month       | 03              |
        | year        | 2028            |
        | nameOnCard  | Ana Torres      |
      Then debería ver el mensaje "Thank you for your purchase today!"
