package com.mercadona.eanprueba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinationDTO {

    private Integer destinationCode;
    private String destinantionName;
    private LocalDate creationDate;
}
