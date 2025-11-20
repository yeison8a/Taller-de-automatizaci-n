Feature: BlazeDemo

  @Blaze
  Scenario: Prueba base
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
