package stepdefinitions;

import SpAcademyCucumber.Usuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefs {
    @Given("I want to write a step with precondition")
    public void iWantToWriteAStepWithPrecondition(Usuario user){
        System.out.println("Given");
        System.out.println(user.getIntId());
        System.out.println(user.getStrNombre());
        System.out.println(user.getDblSaldo());
        System.out.println("--------------------------------");
    }

    @When("I complete action")
    public void iCompleteAction(List<Usuario> users) {
        System.out.println("When");
        for (Usuario usuario : users){
            System.out.println(usuario.getIntId());
            System.out.println(usuario.getStrNombre());
            System.out.println(usuario.getDblSaldo());
        }
    }

    @Then("I validate the outcomes")
    public void iValidateTheOutcomes() {
        System.out.println("Then");
    }
}
