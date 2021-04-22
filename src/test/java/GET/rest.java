package GET;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class rest {

    @Test
    void getQuery() {
        Response response = get("https://reqres.in/api/users?page=2");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    void getJson() {
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
        .body("data.id[1]", equalTo(8));
    }
}
