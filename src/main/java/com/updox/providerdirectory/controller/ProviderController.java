package com.updox.providerdirectory.controller;

import com.updox.providerdirectory.model.Response;
import com.updox.providerdirectory.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;
import java.util.Map;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    public ResponseEntity<Response> getProviders () {
        // Call service here to get Response
        Response response = new Response();

        response.setData(Map.of("providers", providerService.retrieveProviders()));
        response.setHttpStatus(HttpStatus.OK);
        response.setTimestamp(LocalDateTime.now());

       // return new ResponseEntity.ok(response);
        return null;
    }
}
