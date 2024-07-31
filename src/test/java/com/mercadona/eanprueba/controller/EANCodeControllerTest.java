package com.mercadona.eanprueba.controller;

import com.mercadona.eanprueba.dto.EANCodeDTO;
import com.mercadona.eanprueba.service.EANCodeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EANCodeController.class)
public class EANCodeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EANCodeService eanCodeService;

    @Test
    public void getEANCode() throws Exception {
        EANCodeDTO mockEanCodeDTO = new EANCodeDTO();

        when(eanCodeService.getEANCode("8437008153981")).thenReturn(mockEanCodeDTO);

            mockMvc.perform(get("/v1/api/EanCode/8437008153981"))
                    .andExpect(status().isOk());
    }
}