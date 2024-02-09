//package com.TestCorona.Corona.Retrieve.service;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.server.ResponseStatusException;
//
////This service will call the external endpt
//@Service
//@Slf4j
//public class CovidService {
//private static final String url = "https://corona-virus-world-and-india-data.p.rapidapi.com/api";
//private static final String xRapidApi = "1d0a290790msh9a4ea61fe1415a4p156219jsn28931168f676";
//private static final String getxRapidApiHost = "corona-virus-world-and-india-data.p.rapidapi.com";
//
//
//@Autowired
//private RestTemplate restTemplate;
//
//
//    /*OkHttpClient client = new OkHttpClient();
//
//Request request = new Request.Builder()
//	.url("https://corona-virus-world-and-india-data.p.rapidapi.com/api")
//	.get()
//	.addHeader("X-RapidAPI-Key", "1d0a290790msh9a4ea61fe1415a4p156219jsn28931168f676")
//	.addHeader("X-RapidAPI-Host", "corona-virus-world-and-india-data.p.rapidapi.com")
//	.build();
//
//Response response = client.newCall(request).execute();*/
//
////Always better to use the try-catch as we are using an external endpoint
//
//
//    public Object getAllCountryData() {
//        try{
//            //Setting the header value
//            HttpHeaders headers = new HttpHeaders();
//            headers.set("X-RapidAPI-Key", xRapidApi);
//            headers.set("X-RapidAPI-Host", getxRapidApiHost);
//        //Makeing a GET call to RapidAPI
//
//            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(headers),String.class);
//
//            log.info("Output form rapidAPI:{}",response.getBody());
//            return response.getBody();
//
//        }
//        catch (Exception e){
//            log.error("Something went wrong while getting value from" +
//                    "RapidAPI ",e);
//            throw new ResponseStatusException(
//                    HttpStatus.INTERNAL_SERVER_ERROR,
//                    "Exception while calling endpoint of RapidAPI for Corona's data",
//                    e
//            );
//
//        }
//
//    }
//
//
//}
package com.TestCorona.Corona.Retrieve.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
@Slf4j
public class CovidService {
    private static final String url = "https://omgvamp-hearthstone-v1.p.rapidapi.com/info";
    private static final String xRapidApi = "1d0a290790msh9a4ea61fe1415a4p156219jsn28931168f676";
    private static final String getxRapidApiHost = "omgvamp-hearthstone-v1.p.rapidapi.com";

    @Autowired
    private RestTemplate restTemplate;

    public Object getAllCountryData() {
        try {
            // Setting the header value
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Key", xRapidApi);
            headers.set("X-RapidAPI-Host", getxRapidApiHost);

            // Log the URL before making the request
            log.info("Making GET request to RapidAPI endpoint: {}", url);

            // Making a GET call to RapidAPI
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);

            // Log the response body
            log.info("Output from RapidAPI: {}", response.getBody());

            return response.getBody();
        } catch (Exception e) {
            log.error("Something went wrong while getting value from RapidAPI", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception while calling endpoint of RapidAPI for Corona's data",
                    e
            );
        }
    }
}
