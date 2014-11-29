package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ListTypes extends Controller {
	
	public static Result getListTypes() {
		return ok("[{ \"name\": \"Rada Miasta\" }, { \"name\": \"Sejmik Województwa\" }]");
	}

}
