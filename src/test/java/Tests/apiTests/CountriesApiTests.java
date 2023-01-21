package Tests.apiTests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;

public class CountriesApiTests extends BaseControllerTest {

    @Test
    public void getCountryByNameTest() {
        Response response = given().log().uri().
                when().
                get("/name/{name}", "rom")
                .then().
                statusCode(200).
                contentType(ContentType.JSON).
                body("name.official[0]", equalTo("Romania")).
                body("currencies.RON.symbol[0]", equalTo("lei")).
                extract().response();

        response.getBody().prettyPrint();
    }

    @Test
    public void verifyCountriesCapital() {
        given().log().uri().
                when().
                queryParam("fullText", true).
                get("/name/{name}", "romania")
                .then().
                statusCode(200).
                contentType(ContentType.JSON).
                body("capital[0][0]", equalTo("Bucharest"));
    }

    @Test
    public void bordersTests() {
        List<String> expectedBorders = Arrays.asList("BGR", "HUN", "MDA", "UKR", "SRB");

        List<String> actualBorders = given().log().uri().
                when().
                queryParam("fullText", true).
                get("/name/{name}", "romania")
                .then().
                statusCode(200).
                contentType(ContentType.JSON).
//               here it is the magic
        extract().response().jsonPath().getList("borders[0]", String.class);
        expectedBorders.sort(Comparator.naturalOrder());
        System.out.println("Actual borders: " + actualBorders);
        Assert.assertEquals(actualBorders, expectedBorders);
    }

    @Test
    public void verifyAltSpellings(){
        given().log().uri().
                when().
                queryParam("fullText", true).
                get("/name/{name}", "romania")
                .then().
                statusCode(200).
                contentType(ContentType.JSON).
                body("altSpellings[0]", hasItem("România"));
    }

}
