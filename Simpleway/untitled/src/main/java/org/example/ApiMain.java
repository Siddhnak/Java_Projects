package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiMain {
    public static void main(String[] args) throws IOException,InterruptedException {
//        System.out.println("Hello world!");
        var url = "https://omgvamp-hearthstone-v1.p.rapidapi.com/info";

        var apiKey = "a290790msh9a4ea61fe1415a4p156219jsn28931168f676";
        var apihost= "omgvamp-hearthstone-v1.p.rapidapi.com";
        //httprequest
        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .header("X-RapidAPI-Key",apiKey)
                .header("X-RapidAPI-Host",apihost)
                .build();

        var client = HttpClient.newBuilder().build();

       var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }


}