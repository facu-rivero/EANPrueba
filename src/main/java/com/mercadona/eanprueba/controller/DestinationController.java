package com.mercadona.eanprueba.controller;

import com.mercadona.eanprueba.dto.DestinationDTO;
import com.mercadona.eanprueba.model.Destination;
import com.mercadona.eanprueba.service.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/destinations")
@RequiredArgsConstructor
public class DestinationController {

    private final DestinationService destinationService;
    @GetMapping()
    public ResponseEntity<List<Destination>> getAllDestinations () {

        List <Destination> destinations = destinationService.getAllDestinations();

        return ResponseEntity.ok(destinations);
    }

    @GetMapping("{id}")
    public ResponseEntity<DestinationDTO> getById(@PathVariable Long id) {

        Optional<DestinationDTO> destination = Optional.ofNullable(destinationService.getById(id));
        if (destination.isPresent()) {
            return ResponseEntity.ok(destination.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<DestinationDTO> createDestination(@RequestBody DestinationDTO destinationDTO) {
        DestinationDTO newDestination = destinationService.createDestination(destinationDTO);

        return ResponseEntity.ok(newDestination);
    }

    @PutMapping("{id}")
    public ResponseEntity<DestinationDTO> updateDestination(@PathVariable Long id, @RequestBody DestinationDTO destinationDTO) {
    return null;
    }

}
