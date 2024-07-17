package tests;

import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class GetRandomPet {

	
	@BeforeClass
    @Parameters("baseURI")
    public void setup(String baseURI) {
        RestAssured.baseURI = baseURI;
    }
	
	
	 @Test
	    public void testGetPetById() {
		 
		 int petId = 1;
		 
		 String response = 	
				 given()
				  .log().all().pathParam("petId", petId)
				.when()
				   .get("/pet/{petId}")
				.then()
					.log().all().assertThat().statusCode(200)
					.extract().response().asString();

		 
			JsonPath js = new JsonPath(response);
			String name = js.getString("category.name");
			System.out.println(name);
			
	    }
	 
	 }
	

