package post_get;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDelete {
	
	
  @Test
  public void testPut() {
	  
	  //Here we will use baseURI and end point
	  // put means edit something
	  JSONObject req = new JSONObject();
	   req.put("name", "Rose");
	   req.put("Job", "Teacher");
	   
	   System.out.println(req.toJSONString());
       
	   //now we will test the above put request(update)
	  
	   baseURI = "https://reqres.in/api";
	   
	  given().
	  header("Content-Type", "application/json").
	  contentType(ContentType.JSON).
	  accept(ContentType.JSON).
	  body(req.toJSONString()).
	  when().put("/users/2").  //end point
	  then().statusCode(200).
	  log().all();
 
  }
  
  
  @Test
  public void testPatch() {
	  
	  JSONObject req = new JSONObject();
	   req.put("name", "Rose");
	   req.put("Job", "Teacher");
	   
	   System.out.println(req.toJSONString());
      
	   //now we will test the above patch request(update)
	  
	   baseURI = "https://reqres.in";
	   
	  given().
	  header("Content-Type", "application/json").
	  contentType(ContentType.JSON).
	  accept(ContentType.JSON).
	  body(req.toJSONString()).
	  when().patch("/api/users/2").  //end point
	  then().statusCode(200).
	  log().all();
	  
  }
  
  @Test
  public void testDelete() {
	  
	  
	   baseURI = "https://reqres.in";
	   
	  given().
	  when().delete("/api/users/2").  //end point
	  then().statusCode(204).
	  log().all();
  }  
  
}
