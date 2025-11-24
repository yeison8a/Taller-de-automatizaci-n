  
  Feature: Compra de un vuelo a través de la plataforma BlazeDemo

  Como usuario,
  Quiero realizar una compra de vuelo en BlazeDemo
  Para poder viajar a donde yo elija

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
