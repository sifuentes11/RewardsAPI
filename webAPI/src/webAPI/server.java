package webAPI;

// https://www.codeproject.com/Tips/1040097/Create-a-Simple-Web-Server-in-Java-HTTP-Server used for help creating server and routes

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.sun.net.httpserver.HttpServer;


public class server {

	public static int port = 9000;
	public static ArrayList<Map> transactions;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		transactions = new ArrayList<Map>();
		
		HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
		System.out.println("server started at " + port);
		server.createContext("/", new RootHandler());
//		server.createContext("/echoHeader", new EchoHeaderHandler());
		server.createContext("/viewPoints", new pointsGetHandler());
		server.createContext("/addPoints", new addPostHandler());
		server.createContext("/spendPoints", new spendPostHandler());

		server.setExecutor(null);
		server.start();
		
		
		
	}

	
	
}
