package controllers;

import play.mvc.*;

public class Province extends Controller {
	

    public static Result index() {
        return ok("[{ \"name\": \"Pomorskie\" }, { \"name\": \"Wielkopolskie\" }]");
    }
    
}
