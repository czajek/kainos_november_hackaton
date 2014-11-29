package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Province extends Controller {

    public static Result index() {
    	// TODO: implement properly
        return ok("[{ \"name\": \"Pomorskie\" }, { \"name\": \"Wielkopolskie\" }]");
    }
}
