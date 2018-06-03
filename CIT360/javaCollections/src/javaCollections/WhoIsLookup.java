
public class WhoIsLookup {

	 URL url = new URL("http://whois.arin.net/rest/ip/8.8.8.8");
	 HttpURLConnection con = (HttpURLConnection) url.openConnection();
	 con.setRequestMethod("GET");
	 con.setRequestProperty("Accept", "application/json");

	 try (InputStream is = url.openStream();
	      JsonReader rdr = Json.createReader(is)) {
	
	     JsonObject obj = rdr.readObject();
	     JsonArray results = obj.getJsonArray("data");
	     for (JsonObject result : results.getValuesAs(JsonObject.class)) {
	         System.out.print(result.getJsonObject("from").getString("name"));
	         System.out.print(": ");
	         System.out.println(result.getString("message", ""));
	         System.out.println("-----------");
	     }
	
	
	
}
