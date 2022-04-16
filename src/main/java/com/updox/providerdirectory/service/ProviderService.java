package com.updox.providerdirectory.service;

import com.updox.providerdirectory.model.Provider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProviderService {

    List<Provider> retrieveProviders();

    List<Provider> createUpdateProvider(List<Provider> providers);

    Boolean deleteProviders(List<Long> ids);

}
