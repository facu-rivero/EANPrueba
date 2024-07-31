package com.mercadona.eanprueba.dto;

import com.mercadona.eanprueba.model.Destination;

public class DestinationDTOMapper {

    public static DestinationDTO toDto(Destination destination) {

        return new DestinationDTO(
                destination.getDestinationCode(),
                destination.getDestinantionName(),
                destination.getCreationDate()
        );
    }
}
