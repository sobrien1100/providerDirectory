package com.updox.providerdirectory.helper;

import com.updox.providerdirectory.model.Provider;
import com.updox.providerdirectory.model.ProviderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Component("helper")
public class ProviderHelper {

    public List<Provider> mapProviderRequestToEntity(List<ProviderRequest> providerRequests) {
        List<Provider> providerList = new ArrayList<>();

        for(ProviderRequest providerRequest : providerRequests) {
            Provider provider = new Provider();
            provider.setFirstName(providerRequest.getFirstName());
            provider.setLastName(providerRequest.getLastName());
            provider.setEmailAddress(providerRequest.getEmailAddress());
            provider.setSpecialty(providerRequest.getSpecialty());
            provider.setPracticeName(providerRequest.getPracticeName());
            providerList.add(provider);
        }

        return providerList;
    }
}
