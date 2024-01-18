package com.example.CastTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
//public record Value(Long id, String quote) { }
public record Value(Long id, String firstName, String lastName, String email) { }
