package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiMain {
    public static void main(String[] args) throws IOException,InterruptedException {
//        System.out.println("Hello world!");
        var url = "https://10000-anime-quotes-with-pagination-support.p.rapidapi.com/rapidHandler/recent?page=1";

        var apiKey = "9761670b10mshd8693f6267fdc2fp1b5431jsn22677adde97d";
        var apihost= "10000-anime-quotes-with-pagination-support.p.rapidapi.com";
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