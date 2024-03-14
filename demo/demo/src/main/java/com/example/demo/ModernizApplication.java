package com.example.demo;

//import com.google.gson.GsonBuilder;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import com.google.gson.Gson;

import java.util.Scanner;

@SpringBootApplication
public class ModernizApplication {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int choice = -1;

		do {
			System.out.println("\n=====================\nWhat do you want?\n=====================\n" +
					"1.Get the Source Code details\n2.Get Transaction details"
					+ "\n3.Get list of Objects\n4.Exit"
			+"\n5.Post Exit..");
			choice = s.nextInt();
			switch (choice) {
				case 1:
					//		SpringApplication.run(ApiMain.class, args);
//		String url = "http://localhost:8083/imaging/sourcecode/api/localhost/canvas_insights_local/sourcefragments/2295767?extendUp=25&extendDown=25";
					String url = "https://animechan.xyz/api/quotes";
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
					}

					break;
				case 2:
//					em1.set_password();
					System.out.println("Thisis\noption 2");
					break;
				case 3:
					System.out.println("Thisis\noption 3");
					break;
				case 4:
					System.out.println("Get\nLost!!!\nThanks 2");
					break;
				case 5:
					System.out.println("You are still here!!?\nOkashi desu na..");
					break;
//				case 6:
//					em1.read_file();
//					break;
//				case 7:
//					System.out.println("\nTHANKS!!!");
//					break;
				default:
					System.out.println("INVALID CHOICE! ENTER AGAIN!");
			}


		} while (choice != 5);
	}
}


