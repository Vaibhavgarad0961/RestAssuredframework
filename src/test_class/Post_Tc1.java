package test_class;

import org.testng.Assert;

import common_method.common_method_api_post;
import io.restassured.path.json.JsonPath;
import request_repository.post_request_repository;

public class Post_Tc1 {

	public static void orchestrator()
	{   
		String responseBody="";
		int responsestatuscode=0;
		String baseuri=post_request_repository.baseuuri();
		String resource=request_repository.post_request_repository.resource();
		String requestBody=post_request_repository.post_request_repository();
		for(int i=0;i<5;i++)
		{
			responsestatuscode=common_method_api_post.responsestatuscode_extractor(baseuri, resource, requestBody);
			if(responsestatuscode==201)
			{
				responseBody=common_method_api_post.responsebody_extractor(baseuri, resource, requestBody);
						responseBodyValidator(responseBody);
						break;
			}
			else
				System.out.println("Correct statuscodenotfound in current ");
		}
	}
	
    public static void responseBodyValidator(String responseBody)
	{
		// create jsonPath object to extract responsebody parameters
		JsonPath jsp = new JsonPath(responseBody);

		// extract responsebody parameters
		String res_name = jsp.getString("name");
		String res_job = jsp.getString("job");
		String res_id = jsp.getString("id");
		String res_createdAt = jsp.getString("createdAt");

		//System.out.println("name : " + res_name + "\njob : " + res_job + "\nid : " + res_id + "\ncreatedAt : " + res_createdAt);

		// validate responsebody parameter
		Assert.assertEquals(res_name, "morpheus");
		Assert.assertEquals(res_job, "leader");
		Assert.assertNotNull(res_id, "assertion error , id parameter is null");

		
		

	}

	
   
}
