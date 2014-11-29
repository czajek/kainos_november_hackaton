package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Vote extends Controller {

    public static Result index() {
        return ok("OK");
    }
}
