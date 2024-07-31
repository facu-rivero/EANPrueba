package com.mercadona.eanprueba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProviderDTO {

    private Integer providerCode;
    private String providerName;
    private LocalDate creationDate;

}
