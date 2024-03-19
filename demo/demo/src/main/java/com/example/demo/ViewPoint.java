//package com.example.demo;
//
//import com.google.gson.GsonBuilder;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.reactive.function.client.WebClient;
//import com.google.gson.Gson;
//
//import java.util.Scanner;
//
//@SpringBootApplication
//public class ViewPoint {
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int choice = -1;
//
//        do {
//            System.out.println("\n=====================\nWhat do you want?\n=====================\n" +
//                    "1. Anime API \n2. Get Source Fragment Code details" +
//                    "\n3. Get Transaction Details\n4. Get Transaction Objects\n5. Exit");
//            choice = s.nextInt();
//            switch (choice) {
//                case 1:
//                    handleAnimeApi();
//                    break;
//                case 2:
//                    handleSourceFragment();
//                    break;
//                case 3:
//                    transactionDetails();
//                    break;
//                case 4:
//                    transactionObjects();
//                    break;
//                case 5:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("INVALID CHOICE! ENTER AGAIN!");
//            }
//        } while (choice != 5);
//    }
//
//    private static void handleAnimeApi() {
//        String url = "https://animechan.xyz/api/quotes";
//        WebClient webClient = WebClient.create();
//        String responseBody = fetchResponseBody(webClient, url);
//        printResponse(responseBody);
//    }
//
//    private static void handleSourceFragment() {
//        String url = "http://localhost:8083/imaging/sourcecode/api/localhost/canvas_insights_local/sourcefragments/2295767?extendUp=25&extendDown=25";
//        WebClient webClient = WebClient.create();
//        String responseBody = fetchResponseBody(webClient, url);
//        printResponse(responseBody);
//        System.out.println("This is option 2");
//    }
//
//    private static void transactionDetails() {
//        String url = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/details?id=123";
//        WebClient webClient = WebClient.create();
//        String responseBody = fetchResponseBody(webClient, url);
//        printResponse(responseBody);
//
//        // Parse the JSON response to get the Node id
//        Gson gson = new Gson();
//        TransactionDetailsResponse detailsResponse = gson.fromJson(responseBody, TransactionDetailsResponse.class);
//        String nodeId = detailsResponse.getNodeId();
//
//        // Use the extracted Node id to fetch object details
//        transactionObjects(nodeId);
//    }
//
//    private static void transactionObjects(String nodeId) {
//        String url = "http://localhost:8083/imaging/api/domains/default/apps/Appscribe/transaction/" + nodeId + "/objects";
//        WebClient webClient = WebClient.create();
//        String responseBody = fetchResponseBody(webClient, url);
//        printResponse(responseBody);
//    }
//
//    private static String fetchResponseBody(WebClient webClient, String url) {
//        return webClient.get()
//                .uri(url)
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//    }
//
//    private static void printResponse(String responseBody) {
//        if (responseBody != null) {
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            String prettyJsonResponse = gson.toJson(gson.fromJson(responseBody, Object.class));
//            System.out.println(prettyJsonResponse);
//        } else {
//            System.out.println("Failed to retrieve response body");
//        }
//    }
//}
//
//class TransactionDetailsResponse {
//    private String nodeId;
//
//    public String getNodeId() {
//        return nodeId;
//    }
//
//    public void setNodeId(String nodeId) {
//        this.nodeId = nodeId;
//    }
//}
//
