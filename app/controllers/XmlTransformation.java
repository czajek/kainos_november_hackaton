package controllers;

import com.google.common.base.Joiner;
import play.mvc.*;
import views.html.*;
import org.json.*;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class XmlTransformation extends Controller {

    public static Result index() {
        return ok(xml.render());
    }

    public static Result process() {
        try {

            File file = request().body().asMultipartFormData().getFile("pkw-data").getFile();
            List<String> lines = Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));

            String xmlContent = Joiner.on("").join(lines);

            JSONObject asJson = XML.toJSONObject(xmlContent);

        } catch (Exception e) {
            e.printStackTrace();
            return internalServerError(e.getMessage());
        }

        return ok(xml.render());
    }
}
