package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostData {
	
	@Test
	public void postResposeData()
	{
		Response resp=  RestAssured.post("");
		
		int code = resp.getStatusCode();
		String data = resp.asString();
		System.out.println("The status code is :"+code);
		Assert.assertEquals(code, 200);
		System.out.println("The data is "+data);
		System.out.println("The response time is :"+resp.getTime());
		
	}

}