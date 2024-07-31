package com.mercadona.eanprueba.service.implement;

import com.mercadona.eanprueba.dto.EANCodeDTO;
import com.mercadona.eanprueba.dto.EANCodeDTOMapper;
import com.mercadona.eanprueba.model.Destination;
import com.mercadona.eanprueba.model.EANCode;
import com.mercadona.eanprueba.model.Product;
import com.mercadona.eanprueba.model.Provider;
import com.mercadona.eanprueba.repository.DestinationRepository;
import com.mercadona.eanprueba.repository.ProductRepository;
import com.mercadona.eanprueba.repository.ProviderRepository;
import com.mercadona.eanprueba.service.EANCodeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@SpringBootTest
public class EANCodeServiceImplTest {

    @MockBean
    private ProviderRepository providerRepository;

    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private DestinationRepository destinationRepository;

    @MockBean
    private EANCodeServiceImpl eanCodeService;

    public EANCodeServiceImplTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetEANCode() {

        String eanCode = "8437008459059";
        EANCode eanCodeObj = new EANCode();
        Provider provider = new Provider();
        Product product = new Product();
        Destination destination = new Destination();
        eanCodeObj.setProvider(new Provider());
        eanCodeObj.setProduct(new Product());
        eanCodeObj.setDestination(new Destination());

        when(providerRepository.findByProviderCode(8437008)).thenReturn(provider);
        when(productRepository.findByProductCode(45905)).thenReturn(product);
        when(destinationRepository.findByDestinationCode(9)).thenReturn(destination);

        EANCodeDTO expectedDTO = EANCodeDTOMapper.toDTO(eanCodeObj);
        EANCodeDTO resultDTO = eanCodeService.getEANCode(eanCode);

        assertEquals(expectedDTO, resultDTO);
        verify(eanCodeService,times(1)).getEANCode(eanCode);
    }
}