package files;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import files.ReUsableMethods;


import files.ReUsableMethods;
import files.payload;

public class DynamicJson {
	
	@Test
	public void Addbook()
	{
		RestAssured.baseURI="http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json").
				          body(payload.Addbook()).
				          when().
				          post("/Library/Addbook.php").
				          then().assertThat().statusCode(200).
				          extract().response().asString();
						  JsonPath js= ReUsableMethods.rawToJson(response);	
						  String id=js.get("ID");
						  System.out.println(id);
	}
}
