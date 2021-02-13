package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class RegisterUserInterface extends PageObject {
    public static final Target BTN_JOINTODAY = Target.the("usuario").locatedBy("//*[@class='unauthenticated-nav-bar__sign-up']");

    public static final Target TXT_VIEWREGISTER = Target.the("usuario").locatedBy("");

    public static final Target TXT_NAME= Target.the("usuario").locatedBy("//*[@id='firstName']");

    public static final Target TXT_LASTNAME= Target.the("usuario").locatedBy("//*[@id='lastName']");

    public static final Target TXT_EMAIL= Target.the("usuario").locatedBy("//*[@id='email']");

    public static final Target BIRTHMOUNTH_LIST= Target.the("usuario").locatedBy("//*[@id='birthMonth']");
    
    public static final Target BIRTHMOUNTH= Target.the("usuario").locatedBy("//*[@id='birthMonth']/option[contains(text(),'{0}')]");
    
    
    public static final Target BIRTHDAY_LIST= Target.the("usuario").locatedBy("//*[@id='birthDay']");

    public static final Target BIRTHDAY= Target.the("usuario").locatedBy("//*[@id='birthDay']/option[text()='{0}']");

    public static final Target BITHYEAR_LIST= Target.the("usuario").locatedBy("//*[@id='birthYear']");

    public static final Target BITHYEAR= Target.the("usuario").locatedBy("//*[@id='birthYear']/option[text()='{0}']");

    public static final Target BTN_NEXTLOCATION = Target.the("usuario").locatedBy("//*[@class='btn btn-blue']");


//PAGE 2

    public static final Target TXT_VIEWADDADDRESS = Target.the("usuario").locatedBy("");

    public static final Target TXT_CITY= Target.the("usuario").locatedBy("//*[@id='city']");
    
    public static final Target TXT_CITY_LIST= Target.the("usuario").locatedBy("//*[@class='pac-container pac-logo hdpi'][3]/*[1]");
    
    public static final Target TXT_POSTALCODE= Target.the("usuario").locatedBy("//*[@id='zip']");

    public static final Target TXT_COUNTRY_LIST= Target.the("usuario").locatedBy("//*[@name='countryId']");
    
    public static final Target TXT_COUNTRY= Target.the("usuario").locatedBy("//*[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//*[text()='{0}']");


    public static final Target BTN_NEXTDEVICES = Target.the("usuario").locatedBy("//*[@class='btn btn-blue pull-right']");

    //PAGE3

    public static final Target TXT_VIEWABOUTDEVICES = Target.the("usuario").locatedBy("");

    public static final Target TXT_COMPUTER_lIST= Target.the("usuario").locatedBy("//*[text()='Your Computer:']/ancestor::*[2]//*[@name='osId']");

    public static final Target TXT_COMPUTER= Target.the("usuario").locatedBy("//*[@id='ui-select-choices-row-3-2']//*[text()='{0}']");


    public static final Target TXT_VERSION_LIS= Target.the("usuario").locatedBy("//*[text()='Version:']/ancestor::*[2]//*[@name='osVersionId']");
 
    public static final Target TXT_VERSION= Target.the("usuario").locatedBy("//*[@id='ui-select-choices-row-4-1']//*[text()='{0}']");
    
    public static final Target TXT_LENGUAGEFIELD_LIST= Target.the("usuario").locatedBy("//*[text()='Language:']/ancestor::*[2]//*[@name='osLanguageId']");

    public static final Target TXT_LENGUAGEFIELD= Target.the("usuario").locatedBy("//*[@id='ui-select-choices-row-5-37']//*[text()='{0}']");

    public static final Target BTN_CONTINUE= Target.the("usuario").locatedBy("//a[@class='btn btn-blue pull-right']");


    //PAGE 4
    public static final Target TXT_THE_LAST_STEP = Target.the("usuario").locatedBy("//span[@class='sub-title']");



}
