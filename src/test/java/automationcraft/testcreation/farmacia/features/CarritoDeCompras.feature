Feature: Carrito de Compra Farmacia
  Como usuario
  quiero poder agregar productos al carrito
  para hacer una compra online de productos

  Scenario: Agregar producto
    Given que estoy en la url "https://www.farmaciasahumada.cl/catalogsearch/result/?q=bromex"
    When presiono el botón Agregar al Carrito
    Then se debe agregar correctamente el producto al carrito
    And ver el carrito de compra en pantalla