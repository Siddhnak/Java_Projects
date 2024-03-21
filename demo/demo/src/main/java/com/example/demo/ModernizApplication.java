//package com.example.demo;
//
////import com.google.gson.GsonBuilder;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonSyntaxException;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.reactive.function.client.WebClient;
//import com.google.gson.Gson;
//
//import java.util.Scanner;
//
//@SpringBootApplication
//public class ModernizApplication {
//
//	public static void main(String[] args) {
//
//		Scanner s = new Scanner(System.in);
//		int choice = -1;
//
//		do {
//			System.out.println("\n=====================\nWhat do you want?\n=====================\n" +
//					"1.Anime api \n2.Get Source Fragment Code details"
//					+ "\n3.Transaction Details\n4.Exit"
//					+"\n5.Post Exit..");
//			choice = s.nextInt();
//			switch (choice) {
//				case 1:
////					//		SpringApplication.run(ApiMain.class, args);
//////		String url = "http://localhost:8083/imaging/sourcecode/api/localhost/canvas_insights_local/sourcefragments/2295767?extendUp=25&extendDown=25";
////					String url = "https://animechan.xyz/api/quotes";
//////		String apiKey = "VJtrxyA6.VRQqmvJw6byanQNFv0guXV01EJNH1wVm";
//////		String appName = "Canvas_Insights";
//////		String domainName = "default";
////
////					WebClient webClient = WebClient.create();
////
////					String responseBody = webClient.get()
////							.uri(url)
//////				.header("X-api-key", apiKey)
//////				.header("app-name", appName)
//////				.header("domain-name", domainName)
////							.retrieve()
////							.bodyToMono(String.class)
////							.block();
////
////					if (responseBody != null) {
////						Gson gson = new GsonBuilder().setPrettyPrinting().create();
//////			String prettyJsonResponse = gson.toJson(responseBody); one line change below
////						String prettyJsonResponse = gson.toJson(gson.fromJson(responseBody, Object.class));
////						System.out.println(prettyJsonResponse);
////					} else {
////						System.out.println("Failed to retrieve response body");
////					}
//					handleAnimeApi();
//					break;
//				case 2:
//					handleSourceFragment();
//
//				case 3:
////					System.out.println("Thisis\noption 3");
//////					txttospeech();
////					String detailsUrl = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/details?id=";
////					WebClient webClient = WebClient.builder()
////							.defaultHeaders(headers -> {
////								headers.add("appName", "Appscribe");
////								headers.add("X-RapidAPI-Key", "Enter the key here");
////								headers.add("X-RapidAPI-Host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com");
////							})
////							.build();
//					transactionDetails();
//					break;
//				case 4:
////					System.out.println("Get\nLost!!!\nThanks 2");
//					transactionObjects();
//					break;
//				case 5:
////					System.out.println("You are still here!!?\nOkashi desu na..");
//					break;
////				case 6:
////					em1.read_file();
////					break;
////				case 7:
////					System.out.println("\nTHANKS!!!");
////					break;
//				default:
//					System.out.println("INVALID CHOICE! ENTER AGAIN!");
//			}
//		} while (choice != 5);
//	}
//
//	private static void handleAnimeApi(){
//		String url = "https://animechan.xyz/api/quotes";
//		WebClient webClient = WebClient.create();
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
//	}
//
//	private static void txttospeech(){
//		String url = "https://matchilling-chuck-norris-jokes-v1.p.rapidapi.com/jokes/random";
//		WebClient webClient = WebClient.builder()
//				.defaultHeaders(headers -> {
//					headers.add("accept", "application/json");
//					headers.add("X-RapidAPI-Key", "9761670b10mshd8693f6267fdc2fp1b5431jsn22677adde97d");
//					headers.add("X-RapidAPI-Host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com");
//				})
//				.build();
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
//
//	}
//
//	private static void handleSourceFragment(){
//		String url = "http://localhost:8083/imaging/sourcecode/api/localhost/canvas_insights_local/sourcefragments/2295767?extendUp=25&extendDown=25";
//		WebClient webClient = WebClient.create();
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
////		System.out.println("This is");
//	}
//
//	private static void transactionDetails() {
//		String url = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/details?id=123";
//		WebClient webClient = WebClient.create();
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
//
//		// Parse the JSON response to get the Node id
//		Gson gson = new Gson();
//		TransactionDetailsResponse detailsResponse = gson.fromJson(responseBody, TransactionDetailsResponse.class);
//		String nodeId = detailsResponse.getNodeId();
//
//		// Use the extracted Node id to fetch object details
//		transactionObjects(nodeId);
//	}
//
//	private static void transactionObjects(String nodeId){
//		String url = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/8830/level5/objects?external=1";
//		WebClient webClient = WebClient.builder()
//				.defaultHeaders(headers -> {
//					headers.add("accept", "application/json");
//					headers.add("x-api-key", "9761670b10mshd8693f6267fdc2fp1b5431jsn22677adde97d");
////					headers.add("X-RapidAPI-Host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com");
//				})
//				.build();
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
//	}
//
//	private static String fetchResponseBody(WebClient webClient, String url) {
//		return webClient.get()
//				.uri(url)
//				.retrieve()
//				.bodyToMono(String.class)
//				.block();
//	}
//
//	private static void printResponse(String responseBody) {
//		try {
//			if (responseBody != null) {
//				try {
//				Gson gson = new GsonBuilder().setPrettyPrinting().create();
//				String prettyJsonResponse = gson.toJson(gson.fromJson(responseBody, Object.class));
//				System.out.println(prettyJsonResponse);
//				} catch (JsonSyntaxException e) {
//					System.out.println("Error parsing JSON response: " + e.getMessage());
//				}
//			} else {
//				System.out.println("Failed to retrieve response body");
//			}
//		}catch (JsonSyntaxException e){
//			System.out.println("Error JSon parsing "+ e.getMessage());
//		}
//	}
//}
//
//class TransactionDetailsResponse {
//	private String nodeId;
//	public String getNodeId() {
//		return nodeId;
//	}
//	public void setNodeId(String nodeId) {
//		this.nodeId = nodeId;
//	}
//}
//
//

//Final working code

package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Scanner;

@SpringBootApplication
public class ModernizApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = -1;

		do {
			System.out.println("\n=====================\nWelcome to the Cast Imaging Apify Service\nWhat would you like to see\nPlease enter a number your choice.\n=====================\n" +
					"1.Anime api \n2.Get Source Fragment Code details"
					+ "\n3.Transaction Details\n4.Transaction Objects(R&D progress)"
					+ "\n5.Transaction List "+"\n6.Technology Details"+"\n7.Inventory Details"+"\n8.Database Structure"+"\n9.Database Table Details"+"\n10.Sole Transaction"+"\n11.Sole Object Details"+"\n");
			choice = s.nextInt();
			switch (choice) {
				case 1:
					handleAnimeApi();
					break;
				case 2:
					handleSourceFragment();
					break;
				case 3:
					transactionDetails();
					break;
				case 4:
//					transactionObjects(nodeId);
					break;
				case 5:
					transactionList();
					break;
				case 6:
					techDetails();
					break;
				case 7:
					invDetails();
					break;
				case 8:
					dbStruct();
					break;
				case 9:
					dbTable();
					break;
				case 10:
					soleTransactionlist();
					break;
				case 11:
					soleTransactionobject();
					break;
				default:
					System.out.println("INVALID CHOICE! ENTER AGAIN!");
			}
		} while (choice != 5);
	}

	private static void soleTransactionobject() {
		String url = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/8830/level5/objects?external=1";
		WebClient webClient = WebClient.builder()
				.defaultHeaders(headers -> {
					headers.add("accept", "application/json;charset=utf-8");
//					headers.add("domain-name", "default");
					headers.add("x-api-key", "8Svtl4Qi.xvSDLU0Bi7syc9OuO8Ep7ctQwGVnYQiZ");
				})
				.build();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);

	}

	private static void soleTransactionlist() {
//		http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/8830/level5/objects?external=1
		String url = "http://localhost:8083/imaging/api/domains/default/apps/Canvas_Insights/transaction/list?offset=1&limit=2&search=a";
		WebClient webClient = WebClient.builder()
				.defaultHeaders(headers -> {
					headers.add("accept", "application/json;charset=utf-8");
//					headers.add("domain-name", "default");
					headers.add("x-api-key", "8Svtl4Qi.xvSDLU0Bi7syc9OuO8Ep7ctQwGVnYQiZ");
				})
				.build();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);
	}

	private static void dbStruct() {

		String url = "http://localhost:8083/imaging/api/domains/default/apps/Canvas_Insights/databaseStructure";
		WebClient webClient = WebClient.builder()
				.defaultHeaders(headers -> {
					headers.add("accept", "application/json;charset=utf-8");
//					headers.add("domain-name", "default");
					headers.add("x-api-key", "8Svtl4Qi.xvSDLU0Bi7syc9OuO8Ep7ctQwGVnYQiZ");
				})
				.build();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);
	}

	private static void dbTable() {
		String url = "http://localhost:8083/imaging/api/domains/default/apps/Canvas_Insights/databaseStructure/table/94046";
		WebClient webClient = WebClient.builder()
				.defaultHeaders(headers -> {
					headers.add("accept", "application/json;charset=utf-8");
//					headers.add("domain-name", "default");
					headers.add("x-api-key", "8Svtl4Qi.xvSDLU0Bi7syc9OuO8Ep7ctQwGVnYQiZ");
				})
				.build();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);
	}

	private static void invDetails() {
		String url = "http://localhost:8083/imaging/sourcecode/api/localhost/canvas_insights_local/sourcefragments/2295767?extendUp=25&extendDown=25";
////		WebClient webClient = WebClient.create();
//		WebClient webClient = WebClient.builder()
//				.defaultHeaders(headers -> {
//					headers.add("accept", "application/json");
//					headers.add("x-api-key", "9761670b10mshd8693f6267fdc2fp1b5431jsn22677adde97d");
//				})
//				.build();
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
	}

	private static void techDetails() {
		String url = "http://localhost:8083/imaging/api/domains/default/apps/Canvas_Insights/technologies/details";
//		WebClient webClient = WebClient.create();
//		String responseBody = fetchResponseBody(webClient, url);
//		printResponse(responseBody);
			WebClient webClient = WebClient.builder()
					.defaultHeaders(headers -> {
						headers.add("accept", "application/json");
						headers.add("x-api-key", "8Svtl4Qi.xvSDLU0Bi7syc9OuO8Ep7ctQwGVnYQiZ");
					})
					.build();
			String responseBody = fetchResponseBody(webClient, url);
			printResponse(responseBody);
		}


	private static void transactionList() {
		String url = "http://localhost:8083/imaging/api/domains/default/apps/Canvas_Insights/transaction/list?offset=1&limit=2&search=a";
		WebClient webClient = WebClient.builder()
				.defaultHeaders(headers -> {
					headers.add("accept", "application/json");
					headers.add("x-api-key", "8Svtl4Qi.xvSDLU0Bi7syc9OuO8Ep7ctQwGVnYQiZ");
				})
				.build();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);
	}

	private static void handleAnimeApi() {
		String url = "https://animechan.xyz/api/quotes";
		WebClient webClient = WebClient.create();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);
	}

	private static void handleSourceFragment() {
		String url = "http://localhost:8083/imaging/sourcecode/api/localhost/canvas_insights_local/sourcefragments/2295767?extendUp=25&extendDown=25";
		WebClient webClient = WebClient.builder()
				.defaultHeaders(headers -> {
					headers.add("app-name", "Canvas_Insights");
					headers.add("domain-name", "default");
					headers.add("x-api-key", "8Svtl4Qi.xvSDLU0Bi7syc9OuO8Ep7ctQwGVnYQiZ");
				})
				.build();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);
	}

	private static void transactionDetails() {
		String url = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/details?id=123";
		WebClient webClient = WebClient.create();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);

		// Parse the JSON response to get the Node id
		Gson gson = new Gson();
		TransactionDetailsResponse detailsResponse = gson.fromJson(responseBody, TransactionDetailsResponse.class);
		String nodeId = detailsResponse.getNodeId();

		// Use the extracted Node id to fetch object details
		transactionObjects(nodeId);
	}

	private static void transactionObjects(String nodeId) {
		String url = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/8830/level5/objects?external=1&nodeId=" + nodeId;
		WebClient webClient = WebClient.builder()
				.defaultHeaders(headers -> {
					headers.add("accept", "application/json");
					headers.add("x-api-key", "9761670b10mshd8693f6267fdc2fp1b5431jsn22677adde97d");
				})
				.build();
		String responseBody = fetchResponseBody(webClient, url);
		printResponse(responseBody);
	}

	private static String fetchResponseBody(WebClient webClient, String url) {
		return webClient.get()
				.uri(url)
				.retrieve()
				.bodyToMono(String.class)
				.block();
	}

	private static void printResponse(String responseBody) {
		try {
			if (responseBody != null) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String prettyJsonResponse = gson.toJson(gson.fromJson(responseBody, Object.class));
				System.out.println(prettyJsonResponse);
			} else {
				System.out.println("Failed to retrieve response body");
			}
		} catch (JsonSyntaxException e) {
			System.out.println("Error parsing JSON response: " + e.getMessage());
		}
	}
}

class TransactionDetailsResponse {
	private String nodeId;

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
}


