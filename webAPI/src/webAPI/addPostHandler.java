package webAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;



public class addPostHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange he) throws IOException {
		// parse request
        InputStreamReader isr = new InputStreamReader(he.getRequestBody(), "utf-8");
        BufferedReader br = new BufferedReader(isr);
        String jsonStr = br.readLine();
        Gson gson = new Gson();
		transaction t = gson.fromJson(jsonStr, transaction.class);


        // send response
        String response = gson.toJson(t);
        he.sendResponseHeaders(200, response.length());
        OutputStream os = he.getResponseBody();
        os.write(response.toString().getBytes());
        os.close();
        
        
        // adds transaction to transaction ledger ArrayList
        server.transactions.add(t);
	}

}
