package get;

import org.testng.annotations.Test;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Ex2 {
	
	
  @Test
  public void f() {
	  
	  given().
	  get("https://reqres.in/api/users?page=2").
	  then().statusCode(200).
	  body("data[0].id" , equalTo(7)).
	  log().all();
  }

}

