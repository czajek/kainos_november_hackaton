package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class XmlTransformation extends Controller {

    public static Result index() {
        return ok(xml.render());
    }

    public static Result process() {
        return ok(xml.render());
    }
}
