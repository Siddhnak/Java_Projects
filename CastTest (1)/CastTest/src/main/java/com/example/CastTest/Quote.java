package com.example.CastTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
//public record Quote(String type, Value value) { }
public record Quote(String type, List<Value> value) { }
