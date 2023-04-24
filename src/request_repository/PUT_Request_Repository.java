package request_repository;

import java.io.IOException;

public class PUT_Request_Repository {
	public static String baseuri()
	{
		String baseuri ="https://reqres.in/";
		return baseuri;
	}
	public static String resource()
	{
		String resource ="/api/users/2";
		return resource; 
	}
	public static String PUT_REQUEST_TC1() throws IOException
	{
//		ArrayList<String> Data = Get_Data.Get_Data_Excel("PUT Data", "tc1");
//		//System.out.println(Data);
//		String Name = Data.get(2);
//		String Job = Data.get(3);
		String requestbody="{\r\n"
				+ "    \"name\": \"\",\r\n"
				+ "    \"job\": \"\"\r\n"
				+ "}";
		return requestbody;

	}
}
