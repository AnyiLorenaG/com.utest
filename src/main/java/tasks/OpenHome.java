package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.RegisterUserInterface;

public class OpenHome implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new RegisterUserInterface()));
    }

    public static OpenHome browser() {

        return Tasks.instrumented(OpenHome.class);
    }

}
