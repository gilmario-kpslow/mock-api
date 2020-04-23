package br.com.truesystem.mockapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author gilmario
 */
@SpringBootApplication
public class Main {

    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }

}

/**
 * Spark.port(8080); Spark.path("/", () -> { // enableCORS("*", "*", "*");
 * Spark.options("/*", (request, response) -> {
 *
 * String accessControlRequestHeaders =
 * request.headers("Access-Control-Request-Headers"); if
 * (accessControlRequestHeaders != null) {
 * response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
 * }
 *
 * String accessControlRequestMethod =
 * request.headers("Access-Control-Request-Method"); if
 * (accessControlRequestMethod != null) {
 * response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
 * }
 *
 * return "OK"; });
 *
 * Spark.before((request, response) -> {
 * response.header("Access-Control-Allow-Origin", "*");
 * response.header("Access-Control-Request-Method", "GET, POST, OPTIONS");
 * response.header("Access-Control-Allow-Headers", "*"); // Note: this may or
 * may not be necessary in your particular application
 * response.type("application/json"); }); Spark.get("/hello", (req, res) -> {
 * res.type("application/json"); return "1.0.0"; }, new JsonTransformer());
 * Spark.post("/login", (req, res) -> { res.type("application/json"); return
 * getLoginResponse(); }, new JsonTransformer()); }); }
 *
 * public static LoginResponse getLoginResponse() { LoginResponse response = new
 * LoginResponse("Gilmario", "gilmariosoftare@gmail.com", "85989926526"); return
 * response; }
 *
 * private static void enableCORS(final String origin, final String methods,
 * final String headers) {
 *
 * Spark.options("/*", (request, response) -> {
 *
 * String accessControlRequestHeaders =
 * request.headers("Access-Control-Request-Headers"); if
 * (accessControlRequestHeaders != null) {
 * response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
 * }
 *
 * String accessControlRequestMethod =
 * request.headers("Access-Control-Request-Method"); if
 * (accessControlRequestMethod != null) {
 * response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
 * }
 *
 * return "OK"; });
 *
 * Spark.before((request, response) -> {
 * response.header("Access-Control-Allow-Origin", origin);
 * response.header("Access-Control-Request-Method", methods);
 * response.header("Access-Control-Allow-Headers", headers); // Note: this may
 * or may not be necessary in your particular application
 * response.type("application/json"); }); }
 */
