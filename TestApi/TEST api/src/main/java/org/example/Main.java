package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException,InterruptedException, URISyntaxException, UnsupportedEncodingException {
//        System.out.println("Hello world!");


//        String baseUrl = "http://localhost:8083/Imaging/sourcecode/api{localhost}/{canvas_insights_local}/sourcefragments/{2295767}";
//
//        // Encode special characters
//        String encodedUrl = URLEncoder.encode(baseUrl, "UTF-8");
//        // Create URI object
//        URI uri = new URI(encodedUrl);



//        var url = "http://localhost:8083/Imaging/sourcecode/api%7Blocalhost%7D/%7Bcanvas_insights_local%7D/sourcefragments/%7B2295767%7D";
//        var url = "https://pokeapi.co/api/v2/pokemon/ditto";
        var url = "https://animechan.xyz/api/quotes";
//        var apiKey = "9761670b10mshd8693f6267fdc2fp1b5431jsn22677adde97d";
//        var apihost= "10000-anime-quotes-with-pagination-support.p.rapidapi.com";
//        var XRapidAPIHost="movies-api14.p.rapidapi.com";
//        var domainName="default";

        //httprequest
        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
//                .header("X-api-key",apiKey)
//                .header("X-RapidAPI-Host",XRapidAPIHost)
//                .header("domain-name",domainName)
//                .header("X-RapidAPI-Host",apihost)
                .build();

        var client = HttpClient.newBuilder().build();
try{
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println(response.statusCode());
//        System.out.println(response.body());

        //Pretty look
        if (response.statusCode() == 200) {
            // Pretty print JSON response
            Gson gson = new GsonBuilder().setPrettyPrinting().create();// Creating the Gson object to deserialize

            String prettyJsonResponse = gson.toJson(response.body());
            System.out.println(prettyJsonResponse); //This gives array of json response rather than single json object

//            so.. new logic goes below..

//            String[] prettyJsonArray = gson.fromJson(response.body(),String[].class);
////deserializing the JSON resp body to array of strings from JSON array
//
//            for(String json : prettyJsonArray){
//                System.out.println(gson.toJson(json));
//            }
        } else {
            System.out.println("Request failed with status code: " + response.statusCode());
        }
    } catch (IOException | InterruptedException e) {
        e.printStackTrace();
    }


}
//    private  String formatJson(String prettyJsonResponse) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        Object json = gson.fromJson(prettyJsonResponse, Object.class);
//        return gson.toJson(json);
//    }
}