package com.mercadona.eanprueba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Integer productCode;
    private String productName;
    private LocalDate creationDate;

}
