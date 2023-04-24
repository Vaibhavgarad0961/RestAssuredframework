package request_repository;

public class post_request_repository {
	
	public static String baseuuri()
	{
		String baseuri="https://reqres.in/";
		return baseuri;
		
				
	}
	public static String resource()
	{
		String resource="api/users";
		return resource;
	}

	public static String post_request_repository()
	{
		String requestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestBody;
		
	}
}
