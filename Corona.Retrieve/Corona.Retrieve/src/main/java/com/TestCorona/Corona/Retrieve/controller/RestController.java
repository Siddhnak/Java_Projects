package com.TestCorona.Corona.Retrieve.controller;

import com.TestCorona.Corona.Retrieve.service.CovidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Entry point

@RequestMapping("/covid")
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor //so that Getmapping will be always mapped
public class RestController {
    private final CovidService covidService; //calling the service
    @GetMapping("/get-all-country-covid-data")
    public ResponseEntity<?> callRapidEndpointToGetData(){
return ResponseEntity.ok(covidService.getAllCountryData());
    }
}
