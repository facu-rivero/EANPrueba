package com.mercadona.eanprueba.controller;

import com.mercadona.eanprueba.dto.DestinationDTO;
import com.mercadona.eanprueba.model.Destination;
import com.mercadona.eanprueba.service.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
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
    public ResponseEntity<DestinationDTO> getById(@PathVariable Long id) throws NoSuchElementException {

        Optional<DestinationDTO> destination = Optional.ofNullable(destinationService.getById(id));

        return ResponseEntity.ok(destination.get());
    }

    @PostMapping()
    public ResponseEntity<DestinationDTO> createDestination(@RequestBody DestinationDTO destinationDTO) {
        DestinationDTO newDestination = destinationService.createDestination(destinationDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(newDestination);
    }

    @PutMapping("{id}")
    public ResponseEntity<DestinationDTO> updateDestination(@PathVariable Long id, @RequestBody DestinationDTO destinationDTO) {

        if(destinationService.getById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        DestinationDTO result = destinationService.updateDestination(id,destinationDTO);
        return ResponseEntity.accepted().body(result);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteDestination(@PathVariable Long id) {

        if(destinationService.getById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        destinationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
