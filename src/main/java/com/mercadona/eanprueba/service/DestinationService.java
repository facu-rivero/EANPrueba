package com.mercadona.eanprueba.service;

import com.mercadona.eanprueba.dto.DestinationDTO;
import com.mercadona.eanprueba.model.Destination;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;

import java.io.FileNotFoundException;
import java.util.List;

public interface DestinationService {

    List<Destination> getAllDestinations();

    DestinationDTO getById(Long id);

    DestinationDTO createDestination(DestinationDTO destinationDTO);
}
