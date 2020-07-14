package com.telcel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    WebDriver driver;

    String nombreCelular;
    String precioCelular;
    String capaciddCelular;

    @Given("yo navego a la pagina de telcel")
    public void navegarPaginaTelcel() {
        //poner el codigo de selenium
        driver =  new ChromeDriver();
        driver.get("http://www.telcel.com");
    }

    @When("navego a la lista de smartphones")
    public void navegarListaSmarphones() {
        WebElement tiendaEnLinea = driver.findElement(By.linkText("Tienda en línea"));
        tiendaEnLinea.click();
        WebElement smartphone = driver.findElement(By.linkText("Teléfonos y smartphones"));
        smartphone.click();
    }
    @And("selecciono el estado Jalisco")
    public void seleccionarEstadoJalisco() {

    }

    @And("capturo la informacion del celular mas caro")
    public void capturarInformacionCelular() {

    }
    @And("selecciono dicho celular")
    public void  seleccionarCelularMasCaro() {

    }
    @Then("La informacion del celular debe ser la correcta")
    public void validarInformacionCelular() {

    }
}
