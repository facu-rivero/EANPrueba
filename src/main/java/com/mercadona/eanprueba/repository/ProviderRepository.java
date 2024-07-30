package com.mercadona.eanprueba.repository;

import com.mercadona.eanprueba.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository <Provider,Long> {
}
