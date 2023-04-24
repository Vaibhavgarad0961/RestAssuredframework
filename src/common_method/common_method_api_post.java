package common_method;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class common_method_api_post {

	public static int responsestatuscode_extractor(String baseuri,String resource,String req_body)
	{
		RestAssured.baseURI=baseuri;
		int responsestatuscode=given().header("Content-Type","Application/json").body(req_body).when().post(resource).then().extract().statusCode();
		return responsestatuscode;
		
	}
	public static String responsebody_extractor(String baseuri,String resource,String req_body)
	{
		RestAssured.basePath=baseuri;
		String response_body=given().header("Content-Type","application/json").body(req_body).when().post(resource).then().extract().response().asString();
		return response_body;
	}
	
}
