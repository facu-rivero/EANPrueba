package com.mercadona.eanprueba.service.implement;

import com.mercadona.eanprueba.dto.DestinationDTO;
import com.mercadona.eanprueba.dto.DestinationDTOMapper;
import com.mercadona.eanprueba.model.Destination;
import com.mercadona.eanprueba.repository.DestinationRepository;
import com.mercadona.eanprueba.service.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DestinationServiceImpl implements DestinationService {

    private final DestinationRepository destinationRepository;

    @Override
    public List<Destination> getAllDestinations() {

        List<Destination> destinations =  destinationRepository.findAll();

        return destinations;
    }

    @Override
    public DestinationDTO getById(Long id) {

        Optional<Destination> destinationOptional = destinationRepository.findById(id);
        if (!destinationOptional.isPresent()) {
            throw new NoSuchElementException("El Id indicado no existe.");
        }
        Destination destination = destinationOptional.get();
        return DestinationDTOMapper.toDto(destination);
    }

    @Override
    public DestinationDTO createDestination(DestinationDTO destinationDTO) {

        Destination destination = new Destination();
        destination.setDestinationCode(destinationDTO.getDestinationCode());
        destination.setDestinantionName(destinationDTO.getDestinantionName());
        destination.setCreationDate(LocalDate.now());

        Destination result = destinationRepository.save(destination);

        return DestinationDTOMapper.toDto(result);
    }

    @Override
    public DestinationDTO updateDestination(Long id, DestinationDTO destinationDTO) {

        Destination destination = destinationRepository.findById(id).get();

        destination.setDestinationCode(destinationDTO.getDestinationCode());
        destination.setDestinantionName(destinationDTO.getDestinantionName());

        Destination result = destinationRepository.save(destination);

        return DestinationDTOMapper.toDto(result);
    }

    @Override
    public void deleteById(Long id) {
        destinationRepository.deleteById(id);
    }


}
