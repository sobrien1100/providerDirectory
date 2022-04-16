package com.updox.providerdirectory.repo;

import com.updox.providerdirectory.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepo extends JpaRepository<Provider, Long> {
}
