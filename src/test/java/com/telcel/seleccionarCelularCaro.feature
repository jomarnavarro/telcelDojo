Feature: seleccionar celulares

  Scenario: Seleccionar el celular mas caro de la primera pagina de resultados y verificar sus datos
    Given yo navego a la pagina de telcel
    When navego a la lista de smartphones
    And selecciono el estado Jalisco
    And capturo la informacion del celular mas caro
    And selecciono dicho celular
    Then La informacion del celular debe ser la correcta