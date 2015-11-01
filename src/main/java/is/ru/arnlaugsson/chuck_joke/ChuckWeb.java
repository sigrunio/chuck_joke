package is.arnlaugsson.chuck_joke;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class ChuckWeb {

    public static void main(String[] args) {

        get("/hello", (req, res) -> "Hello World");
    }
}
