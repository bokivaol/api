package com.example.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by @Bojan Jovic on Sep, 2019
 */
@RestController
public class ApiService {

    //    String to JSON example: https://www.boraji.com/spring-mvc-4-restcontroller-example
    @PostMapping(value = "/api/image", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getEncodedValueInResponse(@RequestBody String body) {
        return body;
    }
}