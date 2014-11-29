package controllers;

import play.*;
import play.mvc.*;
import views.html.results.*;

public class Results extends Controller {

    public static Result index() {
        return ok(index.render());
    }

}
