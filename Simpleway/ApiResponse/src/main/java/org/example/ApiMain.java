package org.example;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiMain {
    public static void main(String[] args) throws IOException,InterruptedException, URISyntaxException, UnsupportedEncodingException {
//        System.out.println("Hello world!");


//        String baseUrl = "http://localhost:8083/Imaging/sourcecode/api{localhost}/{canvas_insights_local}/sourcefragments/{2295767}";
//
//        // Encode special characters
//        String encodedUrl = URLEncoder.encode(baseUrl, "UTF-8");
//        // Create URI object
//        URI uri = new URI(encodedUrl);



        var url = "http://localhost:8083/Imaging/sourcecode/api%7Blocalhost%7D/%7Bcanvas_insights_local%7D/sourcefragments/%7B2295767%7D";

        var apiKey = "Wxmg4KN8.5CEVJ8kq6BDTjvqyJXkGPC4MCBWSwA8p";
//        var apihost= "10000-anime-quotes-with-pagination-support.p.rapidapi.com";

        //httprequest
        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .header("X-RapidAPI-Key",apiKey)
//                .header("X-RapidAPI-Host",apihost)
                .build();

        var client = HttpClient.newBuilder().build();

       var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }


}