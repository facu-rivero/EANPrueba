package com.mercadona.eanprueba.service.implement;

import com.mercadona.eanprueba.dto.EANCodeDTO;
import com.mercadona.eanprueba.dto.EANCodeDTOMapper;
import com.mercadona.eanprueba.model.EANCode;
import com.mercadona.eanprueba.repository.DestinationRepository;
import com.mercadona.eanprueba.repository.ProductRepository;
import com.mercadona.eanprueba.repository.ProviderRepository;
import com.mercadona.eanprueba.service.EANCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EANCodeServiceImpl implements EANCodeService {

    private final ProviderRepository providerRepository;
    private final ProductRepository productRepository;
    private final DestinationRepository destinationRepository;

    @Override
    public EANCodeDTO getEANCode(String eanCode) {

        EANCode splitEanCode = splitEanCode(eanCode);
        splitEanCode.setProvider(providerRepository.findByProviderCode(splitEanCode.getProvider().getProviderCode()));
        splitEanCode.setProduct(productRepository.findByProductCode(splitEanCode.getProduct().getProductCode()));
        splitEanCode.setDestination(destinationRepository.findByDestinationCode(splitEanCode.getDestination().getDestinationCode()));

        return EANCodeDTOMapper.toDTO(splitEanCode);
    }


    private EANCode splitEanCode(String eanCode) {
        if (eanCode.length() != 13) {
            throw new IllegalArgumentException("El codigo EAN debe tener 13 digitos.");
        }
        if (!eanCode.matches("\\d+")) {
            throw new IllegalArgumentException("El codigo EAN no puede tener letras.");
        }
        EANCode eanCodeObj = new EANCode();

        eanCodeObj.getProvider().setProviderCode(Integer.valueOf(eanCode.substring(0, 7)));
        eanCodeObj.getProduct().setProductCode(Integer.valueOf(eanCode.substring(7, 12)));
        eanCodeObj.getDestination().setDestinationCode(Integer.valueOf(eanCode.substring(12)));

        return eanCodeObj;
    }
}
