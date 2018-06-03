
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class WhoIs {

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	public static void main(String[] args) throws IOException, JSONException {
		Boolean useProxy = false;
		if(useProxy) {
		   System.setProperty("http.proxyHost", "127.0.0.1");
		   System.setProperty("http.proxyPort", "8080");
		}
		    
		URL url = new URL("http://whois.arin.net/rest/ip/8.8.8.8");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "application/json");
	    
		
		
		int rc = con.getResponseCode();

		System.out.println(con.getResponseCode());
	switch (rc) {
	default:
		try  {
			InputStream is = new BufferedInputStream(con.getInputStream());
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
		
		    //System.out.println(json.toString());
		    //System.out.println(json.get("net"));
		   
		    JSONObject net = json.getJSONObject("net");
		    JSONObject nb = net.getJSONObject("netBlocks").getJSONObject("netBlock");
		    System.out.println("Organization Name - " + net.getJSONObject("orgRef").get("@name"));
		    System.out.println("IP Range - " + nb.getJSONObject("startAddress").get("$") + " - " + nb.getJSONObject("endAddress").get("$"));
		    System.out.println("CIDR Block - " + nb.getJSONObject("startAddress").get("$") + " / " + nb.getJSONObject("cidrLength").get("$"));
		   /* for (int i=0; i < netBlocks.length(); i++) {
		    	JSONObject nb = netBlocks.getJSONObject(i);
		    	System.out.println(nb.get("startAddress"));
		    	
		    }*/

		} catch (IOException e) {
		    System.err.println("IOException: " + e.getMessage());
		} finally { con.disconnect();}
		break;
		
	case HttpURLConnection.HTTP_NOT_FOUND:
		System.out.println("The URL was not found.  Please try again.");
		break;
	case HttpURLConnection.HTTP_BAD_REQUEST:
		System.out.println("This is a bad request.  Please try again.");
		break;
	case HttpURLConnection.HTTP_FORBIDDEN:
		System.out.println("Make sure you are authorized to access this site.");
		break;
	}
	}
}

	
		
