package com.mercadona.eanprueba.dto;

import com.mercadona.eanprueba.model.Provider;

public class ProviderDTOMapper {

    public static ProviderDTO toDto(Provider provider) {

        return new ProviderDTO(
                provider.getProviderCode(),
                provider.getProviderName(),
                provider.getCreationDate()
        );
    }
}
