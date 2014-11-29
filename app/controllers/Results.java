package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Results extends Controller {

    public static Result index() {
        return ok(results.render());
    }

    public static Result circumference(int number){
        return ok("some data");
    }

}
