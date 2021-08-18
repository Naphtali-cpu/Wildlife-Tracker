import static spark.Spark.*;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/animals", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("animals",Animals.all());
            return new ModelAndView(model, "animals.hbs");
        }, new HandlebarsTemplateEngine());

        get("/animal/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "animal-form.hbs");
        }, new HandlebarsTemplateEngine());


        post("/animal", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String ranger = request.queryParams("ranger");
            String age = request.queryParams("age");
            String location = request.queryParams("location");
            String health = request.queryParams("health");
            String status = request.queryParams("status");
//            String spottime = request.queryParams("spottime");
            Animals newAnimal = new Animals(name, ranger, age, location, health, status);
            newAnimal.save();
            response.redirect("/animals");
            return null;
        }, new HandlebarsTemplateEngine());

    }

}