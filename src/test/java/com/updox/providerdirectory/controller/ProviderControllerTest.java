package com.updox.providerdirectory.controller;

import com.updox.providerdirectory.ProviderDirectoryTestHelper;
import com.updox.providerdirectory.helper.ProviderHelper;
import com.updox.providerdirectory.model.Provider;
import com.updox.providerdirectory.model.Response;
import com.updox.providerdirectory.service.ProviderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.mockito.InjectMocks;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class ProviderControllerTest {

    @InjectMocks
    ProviderController providerController;
    @Mock
    private ProviderService providerService;
    @Mock
    private ProviderHelper providerHelper;

    @BeforeAll
    public static void setup() {
        Mockito.mock(ProviderController.class);
        Mockito.mock(ProviderService.class);
        Mockito.mock(ProviderHelper.class);
    }

    @Test
    public void testGetAllProviders() {
        Mockito.when(providerService.retrieveProviders()).thenReturn(List.of(ProviderDirectoryTestHelper.mockProvider()));
        ResponseEntity<Response> responseEntity= providerController.getProviders();

        Assertions.assertEquals("Mike", (((List<Provider>) responseEntity.getBody().getData().get("providers")).get(0).getFirstName()));
    }

    @Test
    public void testDeleteProviders() {
        Mockito.when(providerService.deleteProviders(Mockito.anyList())).thenReturn(true);
        ResponseEntity<Response> responseEntity= providerController.deleteProvider(List.of(1L));

        Assertions.assertTrue(((Boolean) responseEntity.getBody().getData().get("Is Deleted"))) ;
    }

    @Test
    public void testUpdateProviders() {
        Mockito.when(providerService.createUpdateProvider(Mockito.anyList())).thenReturn(List.of(ProviderDirectoryTestHelper.mockProvider()));
        ResponseEntity<Response> responseEntity= providerController.updateProvider(Mockito.anyList());

        Assertions.assertEquals("Mike", (((List<Provider>) responseEntity.getBody().getData().get("providers")).get(0).getFirstName()));
    }
}
