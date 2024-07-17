package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;

public class AddNewPet {

	@BeforeClass
	@Parameters("baseURI")
	public void setup(String baseURI) {
		RestAssured.baseURI = baseURI;
	}

	@Test
	public void testAddNewPet() {

		String response = 
				given()
				    .log().all().header("Content-Type", "application/json").body(payload.AddPet())
				.when()
				    .post("/pet")
				 .then()
				     .log().all().assertThat().statusCode(200).extract().response().asString();
	}

}
