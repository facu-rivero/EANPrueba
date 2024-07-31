package com.mercadona.eanprueba.controller;

import com.mercadona.eanprueba.dto.EANCodeDTO;
import com.mercadona.eanprueba.service.EANCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/EanCode")
@RequiredArgsConstructor
public class EANCodeController {

    private final EANCodeService eanCodeService;

    @GetMapping("{EANCode}")
    public ResponseEntity<EANCodeDTO> getEANCode(@PathVariable String EANCode) {

         return ResponseEntity.ok(eanCodeService.getEANCode(EANCode));
    }
}
