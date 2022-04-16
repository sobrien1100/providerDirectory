package com.updox.providerdirectory.controller;

import com.updox.providerdirectory.helper.ProviderHelper;
import com.updox.providerdirectory.model.ProviderRequest;
import com.updox.providerdirectory.model.Response;
import com.updox.providerdirectory.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/provider")
public class ProviderController {
    private ProviderService providerService;
    private ProviderHelper providerHelper;

    @Autowired
    public ProviderController setProviderService(final ProviderService providerService, final ProviderHelper providerHelper) {
        this.providerService = providerService;
        this.providerHelper = providerHelper;
        return this;
    }

    @GetMapping(value="/getAll")
    public ResponseEntity<Response> getProviders () {
        // Call service here to get Response
        Response response = new Response();

        response.setData(Map.of("providers", providerService.retrieveProviders()));
        response.setHttpStatus(HttpStatus.OK);
        response.setStatusCode(HttpStatus.OK.value());
        response.setTimestamp(LocalDateTime.now());

        return new ResponseEntity(HttpStatus.OK).ok(response);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Response> updateProvider(@RequestBody List<ProviderRequest> providers) {
        Response response = new Response();

        response.setData(Map.of("providers", providerService.createUpdateProvider(providerHelper.mapProviderRequestToEntity(providers))));
        response.setHttpStatus(HttpStatus.CREATED);
        response.setStatusCode(HttpStatus.CREATED.value());
        response.setTimestamp(LocalDateTime.now());

        return new ResponseEntity(HttpStatus.CREATED).ok(response);
    }

    @PostMapping(value="/delete")
    public ResponseEntity<Response> deleteProvider (@RequestBody List<Long> providerId) {
        Response response = new Response();

        response.setData(Map.of("Is Deleted", providerService.deleteProviders(providerId)));
        response.setHttpStatus(HttpStatus.OK);
        response.setStatusCode(HttpStatus.OK.value());
        response.setTimestamp(LocalDateTime.now());

        return new ResponseEntity(HttpStatus.OK).ok(response);
    }
}
