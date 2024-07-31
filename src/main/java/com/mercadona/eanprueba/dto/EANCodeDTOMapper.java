package com.mercadona.eanprueba.dto;

import com.mercadona.eanprueba.model.EANCode;

public class EANCodeDTOMapper {
    public static EANCodeDTO toDTO(EANCode eanCode) {

        EANCodeDTO eanCodeDTO = new EANCodeDTO();
        eanCodeDTO.setProviderCode(eanCode.getProvider().getProviderCode());
        eanCodeDTO.setProviderName(eanCode.getProvider().getProviderName());
        eanCodeDTO.setProductCode(eanCode.getProduct().getProductCode());
        eanCodeDTO.setProductName(eanCode.getProduct().getProductName());
        eanCodeDTO.setDestinationCode(eanCode.getDestination().getDestinationCode());
        eanCodeDTO.setDestinationName(eanCode.getDestination().getDestinantionName());

        return eanCodeDTO;
    }
}

