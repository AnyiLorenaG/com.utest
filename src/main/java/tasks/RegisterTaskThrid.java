package tasks;

import static userinterfaces.RegisterUserInterface.BTN_CONTINUE;
import static userinterfaces.RegisterUserInterface.TXT_COMPUTER;
import static userinterfaces.RegisterUserInterface.TXT_COMPUTER_lIST;
import static userinterfaces.RegisterUserInterface.TXT_LENGUAGEFIELD;
import static userinterfaces.RegisterUserInterface.TXT_LENGUAGEFIELD_LIST;
import static userinterfaces.RegisterUserInterface.TXT_VERSION;
import static userinterfaces.RegisterUserInterface.TXT_VERSION_LIS;

import java.util.List;

import models.ThirdField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterTaskThrid  implements Task {
	private List<ThirdField> data;
	
	public RegisterTaskThrid(List<ThirdField> data) {
		this.data=data;
	}
	
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(TXT_COMPUTER_lIST),
    		   Click.on(TXT_COMPUTER.of(data.get(0).getComputer())),
    		   Click.on(TXT_VERSION_LIS),
    		   Click.on(TXT_VERSION.of(data.get(0).getVersionfield())),
    		   Click.on(TXT_LENGUAGEFIELD_LIST),
    		   Click.on(TXT_LENGUAGEFIELD.of(data.get(0).getLanguagefield())),
    		   Click.on(BTN_CONTINUE));
    }

    public static RegisterTaskThrid fields(List<ThirdField> data) {

        return Tasks.instrumented(RegisterTaskThrid.class,data);
    }

}

