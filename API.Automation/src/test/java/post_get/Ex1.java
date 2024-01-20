package post_get;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
	
	
  @Test
  public void gf() {
	  
	  given().
	  get("https://reqres.in/api/unknown").
	  then().statusCode(200).
	  body("data[0].name", equalTo("cerulean")).
	  body("data.name", hasItems("cerulean","true red"));
	  
	  
  }
  
  @Test
  public void postf() {
	  //here we will create a post request and then test it
	  //creating a body for post method test
	  Map<String, Object> map = new HashMap<String, Object>();
	 // map.put("name", "Rose");
	  //map.put("job", "Teacher");
	  
	 // System.out.println(map);
	  
	  //putting in Json format
	  
	   JSONObject req = new JSONObject();
	   req.put("name", "Rose");
	   req.put("Job", "Teacher");
	   
	   System.out.println(req.toJSONString());
        
	   //now we will test the above post request
	   
	  given().
	  header("Content-Type", "application/json").
	 // contentType(ContentType.JSON).
	 // accept(ContentType.JSON).
	  body(req.toJSONString()).
	  when().post("https://reqres.in/api/users").
	  then().statusCode(201).log().all();
  }
}
