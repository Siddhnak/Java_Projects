package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AnimeTest {
    public static void main(String[] args) {
        var url = "https://animechan.xyz/api/quotes";

        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();

        var client = HttpClient.newBuilder().build();

        try {
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                // Parse the JSON response
                JsonArray jsonArray = JsonParser.parseString(response.body()).getAsJsonArray();

                // Pretty print JSON response
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String prettyJsonResponse = gson.toJson(jsonArray);

                System.out.println(prettyJsonResponse);
            } else {
                System.out.println("Request failed with status code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
