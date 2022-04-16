package com.updox.providerdirectory.service.impl;

import com.updox.providerdirectory.model.Provider;
import com.updox.providerdirectory.repo.ProviderRepo;
import com.updox.providerdirectory.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    private ProviderRepo providerRepo;

    @Autowired
    public ProviderServiceImpl setProviderRepo(final ProviderRepo providerRepo) {
        this.providerRepo = providerRepo;
        return this;
    }

    @Override
    public List<Provider> retrieveProviders() {
        return providerRepo.findAll();
    }

    @Override
    public List<Provider> createUpdateProvider(List<Provider> providers) {
        return providerRepo.saveAll(providers);
    }

    @Override
    public Boolean deleteProviders(List<Long> ids) {
        providerRepo.deleteAllById(ids);
        return true;
    }
}
