package com.example.demo;

//import com.google.gson.GsonBuilder;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import com.google.gson.Gson;

@SpringBootApplication
public class ModernizApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ApiMain.class, args);
//		String url = "http://localhost:8083/imaging/sourcecode/api/localhost/canvas_insights_local/sourcefragments/2295767?extendUp=25&extendDown=25";
		String url="https://animechan.xyz/api/quotes";
//		String apiKey = "VJtrxyA6.VRQqmvJw6byanQNFv0guXV01EJNH1wVm";
//		String appName = "Canvas_Insights";
//		String domainName = "default";

		WebClient webClient = WebClient.create();

		String responseBody = webClient.get()
				.uri(url)
//				.header("X-api-key", apiKey)
//				.header("app-name", appName)
//				.header("domain-name", domainName)
				.retrieve()
				.bodyToMono(String.class)
				.block();

		if (responseBody != null) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
//			String prettyJsonResponse = gson.toJson(responseBody); one line change below
			String prettyJsonResponse = gson.toJson(gson.fromJson(responseBody, Object.class));
			System.out.println(prettyJsonResponse);
		} else {
			System.out.println("Failed to retrieve response body");
		}	}

}


// Unwanted CODE..
//package com.example.demo;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.reactive.function.client.WebClient;
//
//@SpringBootApplication
//public class ModernizApplication {
//
//	public static void main(String[] args) {
//		String url = "https://animechan.xyz/api/quotes";
//
//		WebClient webClient = WebClient.create();
//
//		String responseBody = webClient.get()
//				.uri(url)
//				.retrieve()
//				.bodyToMono(String.class)
//				.block();
//
//		if (responseBody != null) {
//			Gson gson = new GsonBuilder().setPrettyPrinting().create();
//			System.out.println(responseBody); // Print the raw JSON response
//
//			// Now parse the JSON response using Gson
//			Quote[] quotes = gson.fromJson(responseBody, Quote[].class);
//			for (Quote quote : quotes) {
//				System.out.println(quote); // Print each quote object
//			}
//		} else {
//			System.out.println("Failed to retrieve response body");
//		}
//	}
//
//	static class Quote {
//		private int id;
//		private String quote;
//		private String anime;
//		private String character;
//
//		// Add getters and setters for Quote properties
//		// Alternatively, you can use Lombok annotations to generate getters and setters automatically
//	}
//}
///////////////////Desired//////////////////////


//package com.example.demo;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.Arrays;
//
//@SpringBootApplication
//public class ModernizApplication {
//
//	public static void main(String[] args) {
//		String url = "https://animechan.xyz/api/quotes";
//
//		try {
//			String responseBody = WebClient.create()
//					.get()
//					.uri(url)
//					.retrieve()
//					.bodyToMono(String.class)
//					.block();
//
//			if (responseBody != null) {
//				Gson gson = new GsonBuilder().setPrettyPrinting().create();
//				Quote[] quotes = gson.fromJson(responseBody, Quote[].class);
//
//				Arrays.stream(quotes)
//						.forEach(quote -> System.out.println(gson.toJson(quote)));
//			} else {
//				System.out.println("Failed to retrieve response body");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	static class Quote {
//		private int id;
//		private String quote;
//		private String anime;
//		private String character;
//
//		// Add getters and setters for Quote properties
//	}
//}
