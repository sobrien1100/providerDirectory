package com.updox.providerdirectory.service;

import com.updox.providerdirectory.model.Provider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProviderService {

    List<Provider> retrieveProviders();

    Provider createProvider();

    Provider updateProvider();

    Boolean deleteProvider(Long id);

}
