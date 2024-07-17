package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllPetsByStatus {

	
	@BeforeClass
    @Parameters("baseURI")
    public void setup(String baseURI) {
        RestAssured.baseURI = baseURI;
    }
	
	
	@Test
	 public void testGetAllPetsNamesByStatus() {
		 
		 String status = "available";
		 
		 String response = 	
				 given()
				  .log().all().queryParam("status", status)
				.when()
				   .get("/pet/findByStatus")
				.then()
					.log().all().assertThat().statusCode(200)
					.extract().response().asString();
	 }
}
