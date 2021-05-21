package webAPI;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class pointsGetHandler implements HttpHandler {

	@Override

    public void handle(HttpExchange he) throws IOException {
            // parse request
//            Map<String, Object> parameters = new HashMap<String, Object>();
//            URI requestedUri = he.getRequestURI();
//            String query = requestedUri.getRawQuery();
//            parseQuery(query, parameters);

            // send response
		
		    String response = "{\n";
		
			for (int i = 0; i < server.transactions.size(); i++) {
				
				if (i == server.transactions.size() - 1) {
					response += "\t\"" + server.transactions.get(i).payer + "\": " + server.transactions.get(i).points + "\n}\n";
				} else {
					response += "\t\"" + server.transactions.get(i).payer + "\": " + server.transactions.get(i).points + ",\n";
				}	
				
			}
			
			
		
//            String response = "" + server.transactions;
//            for (String key : parameters.keySet())
//                     response += key + " = " + parameters.get(key) + "\n";
            he.sendResponseHeaders(200, response.length());
            OutputStream os = he.getResponseBody();
            os.write(response.toString().getBytes());

            os.close();
    }
	
	
}
