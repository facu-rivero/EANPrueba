package com.mercadona.eanprueba.service.implement;

import com.mercadona.eanprueba.dto.ProviderDTO;
import com.mercadona.eanprueba.dto.ProviderDTOMapper;
import com.mercadona.eanprueba.model.Provider;
import com.mercadona.eanprueba.repository.ProviderRepository;
import com.mercadona.eanprueba.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl implements ProviderService {

    private final ProviderRepository providerRepository;

    @Override
    public List<Provider> getAllProviders() {

        List<Provider> providers = providerRepository.findAll();

        return providers;
    }

    @Override
    public ProviderDTO getById(Long id) {
        Optional<Provider> providerOptional = providerRepository.findById(id);

        Provider provider = providerOptional.get();
        return ProviderDTOMapper.toDto(provider);
    }

    @Override
    public ProviderDTO createProvider(ProviderDTO providerDTO) {

        Provider provider = new Provider();
        provider.setProviderCode(providerDTO.getProviderCode());
        provider.setProviderName(providerDTO.getProviderName());
        provider.setCreationDate(LocalDate.now());

        Provider result = providerRepository.save(provider);

        return ProviderDTOMapper.toDto(result);
    }

    @Override
    public ProviderDTO updateProvider(Long id, ProviderDTO providerDTO) {

        Provider provider = providerRepository.findById(id).get();

        provider.setProviderCode(providerDTO.getProviderCode());
        provider.setProviderName(providerDTO.getProviderName());

        Provider result = providerRepository.save(provider);
        return ProviderDTOMapper.toDto(result);
    }

    @Override
    public void deleteById(Long id) {
        providerRepository.deleteById(id);
    }
}
