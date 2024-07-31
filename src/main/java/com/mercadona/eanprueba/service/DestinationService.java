package com.mercadona.eanprueba.service;

import com.mercadona.eanprueba.dto.DestinationDTO;
import com.mercadona.eanprueba.model.Destination;

import java.util.List;

public interface DestinationService {

    List<Destination> getAllDestinations();

    DestinationDTO getById(Long id);

    DestinationDTO createDestination(DestinationDTO destinationDTO);

    DestinationDTO updateDestination(Long id, DestinationDTO destinationDTO);

    void deleteById(Long id);


}
