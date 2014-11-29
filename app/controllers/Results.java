package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Results extends Controller {

    public static Result index() {
        return ok(results.render());
    }


    public static Result circumference(int number) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode obj = mapper.readTree("{\n" +
                " \"nazwa\": \"Gdańsk\",\n" +
                " \"wojewodztwo\": \"Pomorskie\",\n" +
                " \"okrag\": [\n" +
                "  {\n" +
                "   \"numer\": \"1\",\n" +
                "   \"obwod\": [\n" +
                "    {\n" +
                "     \"nazwa\": \"Brzeźno\",\n" +
                "     \"karta\": [\n" +
                "      {\n" +
                "       \"rodzaj\": \"Rada Miasta\",\n" +
                "       \"lista\": [\n" +
                "        {\n" +
                "         \"numer\": \"8\",\n" +
                "         \"nazwa\": \"KW Liga Polskich Rodzin\",\n" +
                "         \"kandydat\": [\n" +
                "          {\n" +
                "           \"imie\": \"Marzena\",\n" +
                "           \"nazwisko\": \"Grabowska\",\n" +
                "           \"id\": 1\n" +
                "          },\n" +
                "          {\n" +
                "           \"imie\": \"Jarosław\",\n" +
                "           \"nazwisko\": \"Dariusz-Piotr\",\n" +
                "           \"id\": 2,\n" +
                "           \"votes\": 2134\n" +
                "          }\n" +
                "         ]\n" +
                "        }\n" +
                "       ]\n" +
                "      }\n" +
                "     ]\n" +
                "    }\n" +
                "   ]\n" +
                "  }\n" +
                " ]\n" +
                "}");

        return ok(obj);
    }

}
