package com.mercadona.eanprueba.service;

import com.mercadona.eanprueba.dto.ProviderDTO;
import com.mercadona.eanprueba.model.Provider;

import java.util.List;

public interface ProviderService {

    List<Provider> getAllProviders();

    ProviderDTO getById(Long id);

    ProviderDTO createProvider(ProviderDTO providerDTO);

    ProviderDTO updateProvider(Long id, ProviderDTO providerDTO);

    void deleteById(Long id);
}
