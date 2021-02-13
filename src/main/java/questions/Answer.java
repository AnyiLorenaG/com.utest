package questions;

import static userinterfaces.RegisterUserInterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<String> {

	    public static Answer toThe() {
	        return new Answer();
	 }

	    @Override
	    public String answeredBy(Actor actor) {
	       return Text.of(TXT_THE_LAST_STEP).viewedBy(actor).asString();
	     
	    }

	}