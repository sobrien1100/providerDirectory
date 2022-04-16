package com.updox.providerdirectory;

import com.updox.providerdirectory.model.Provider;
import com.updox.providerdirectory.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Map;

public class ProviderDirectoryTestHelper {

    public static Provider mockProvider() {
        Provider provider = new Provider();

        provider.setFirstName("Mike");
        provider.setLastName("Harris");
        provider.setEmailAddress("mharris@updox.com");
        provider.setSpecialty("Pediatrics");
        provider.setPracticeName("Harris Pediatrics");
        provider.setId(1L);

        return provider;
    }

    public static ResponseEntity<Response> mockResponse() {
        Response response = new Response();
        Provider provider = new Provider();

        response.setStatusCode(200);
        response.setTimestamp(LocalDateTime.now());
        response.setHttpStatus(HttpStatus.OK);
        response.setData(Map.of("Mock Data", provider));
        response.setMessage("This is Mock Data for testing");

        return new ResponseEntity<>(HttpStatus.OK).ok(response);
    }
}
