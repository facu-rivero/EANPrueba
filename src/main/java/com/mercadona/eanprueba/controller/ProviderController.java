package com.mercadona.eanprueba.controller;

import com.mercadona.eanprueba.dto.ProviderDTO;
import com.mercadona.eanprueba.model.Provider;
import com.mercadona.eanprueba.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/providers")
@RequiredArgsConstructor
public class ProviderController {

    private final ProviderService providerService;

    @GetMapping()
    public ResponseEntity<List<Provider>> getAllProviders () {

        List <Provider> providers = providerService.getAllProviders();

        return ResponseEntity.ok(providers);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProviderDTO> getById(@PathVariable Long id) throws NoSuchElementException {

        Optional<ProviderDTO> provider = Optional.ofNullable(providerService.getById(id));
        if (!provider.isPresent()) {
            throw new NoSuchElementException("El Id indicado no existe.");
        }
        return ResponseEntity.ok(provider.get());
    }

    @PostMapping()
    public ResponseEntity<ProviderDTO> createProvider(@RequestBody ProviderDTO providerDTO) {
        ProviderDTO newProvider = providerService.createProvider(providerDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(newProvider);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProviderDTO> updateProvider(@PathVariable Long id, @RequestBody ProviderDTO providerDTO) {

        if(providerService.getById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        ProviderDTO result = providerService.updateProvider(id,providerDTO);
        return ResponseEntity.accepted().body(result);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProvider(@PathVariable Long id) {

        if(providerService.getById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        providerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
