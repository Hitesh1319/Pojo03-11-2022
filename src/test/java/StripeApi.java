import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class StripeApi {
    @Test
    public void toVerifyCustomerIsCreated() {
        RestAssured.baseURI = "https://api.stripe.com";

        RestAssured.given()
                .header("Authorization", "Bearer " + "sk_test_51M02TuSHwYGEkucEMpmLYaBDDVbu6xE1d1CgM0k5IXG9jyDmgpVq78IqSeHvma6VGPv25Fiz0b8GEpUTDgGB12NR00fl11bvCR")
                .header("Accept","Application/json")
                .when()
                .post("/v1/customers")
                .then()
                .log().body();
    }
}
