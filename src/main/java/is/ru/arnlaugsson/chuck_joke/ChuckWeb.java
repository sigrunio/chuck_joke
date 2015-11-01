package is.arnlaugsson.chuck_joke;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class ChuckWeb implements SparkApplication {

    public static void main(String[] args) {

        staticFileLocation("/public");
        SparkApplication chuckweb = new ChuckWeb();

        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        post("/hello", (req, res) -> "Hello World");

}
