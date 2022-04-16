package com.updox.providerdirectory.service;

import com.updox.providerdirectory.ProviderDirectoryTestHelper;
import com.updox.providerdirectory.controller.ProviderController;
import com.updox.providerdirectory.helper.ProviderHelper;
import com.updox.providerdirectory.model.Provider;
import com.updox.providerdirectory.repo.ProviderRepo;
import com.updox.providerdirectory.service.impl.ProviderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProviderServiceTest {

    @InjectMocks
    ProviderServiceImpl providerService;

    @Mock
    private ProviderRepo providerRepo;

    @BeforeAll
    public static void setup() {
        Mockito.mock(ProviderServiceImpl.class);
        Mockito.mock(ProviderRepo.class);
    }

    @Test
    public void testRetriveProviders() {
        Mockito.when(providerRepo.findAll()).thenReturn(List.of(ProviderDirectoryTestHelper.mockProvider()));
        List<Provider> providers = providerService.retrieveProviders();

        Assertions.assertEquals("Mike", providers.get(0).getFirstName());
    }

    @Test
    public void testCreateUpdateProviders() {
        Mockito.when(providerRepo.saveAll(Mockito.anyList())).thenReturn(List.of(ProviderDirectoryTestHelper.mockProvider()));
        List<Provider> providers = providerService.createUpdateProvider(List.of(ProviderDirectoryTestHelper.mockProvider()));

        Assertions.assertEquals("Mike", providers.get(0).getFirstName());
    }

    @Test
    public void testDeleteProviders() {
        // Mockito defaults to doNothing when void method is called
        Assertions.assertTrue(providerService.deleteProviders(Mockito.anyList()));

    }

}
