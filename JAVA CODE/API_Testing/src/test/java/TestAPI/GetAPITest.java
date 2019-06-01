package TestAPI;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.BASE.TestBase;
import com.qa.utils.TestUtil;

import Client.restclient;



public class GetAPITest extends TestBase{
	
	TestBase  testbase;
	String urL;
	String apiUrl;
	String url;
	restclient restClient;
	CloseableHttpResponse closeablehttpresponse;
	
	@BeforeMethod
	
	public void setup() throws ClientProtocolException, IOException {
		testbase =new TestBase();
		urL=prop.getProperty("URL");
		apiUrl=prop.getProperty("serviceURL");	
		url= urL+apiUrl;
		
	}

	
	@Test
	public void GetAPITest() throws ClientProtocolException, IOException {
		restClient = new restclient();
		closeablehttpresponse = restClient.get(url);
		
		
		//Status Code
		int statuscode = closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("Status code is " + statuscode);
		Assert.assertEquals(statuscode, Response_Status_Code_200 , "Status code is not 200");
		
		
        //json String
		String responseString = EntityUtils.toString(closeablehttpresponse.getEntity(), "UTF-8");
		JSONObject response = new JSONObject(responseString);
		System.out.println(responseString);
		
		
		String S =TestUtil.getValueByJpath(response , "/per_page" );
		System.out.println(S);
		
        //AllHeader
		Header[] HeaderArray = closeablehttpresponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();

		for (Header header : HeaderArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("All Headers" + allHeaders);
	
	}
}
