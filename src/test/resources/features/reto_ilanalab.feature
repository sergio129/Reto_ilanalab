Feature: interactuar y llenar los datos del formulario

  Background:
    Given Ingresar a la Url de demoqa

  @Reto1
  Scenario:  Verificar el formulario de registro
    When Navegamos hasta la opcions de Practice Form
    And Completamos el formulario
    Then Verficamos mensaje de exito del envio del formulario


