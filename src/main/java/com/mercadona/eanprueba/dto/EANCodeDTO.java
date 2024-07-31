package com.mercadona.eanprueba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EANCodeDTO {

    private Integer providerCode;
    private String  providerName;
    private Integer productCode;
    private String  productName;
    private Integer destinationCode;
    private String  destinationName;
}
