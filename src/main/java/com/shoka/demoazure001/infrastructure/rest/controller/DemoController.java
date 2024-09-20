package com.shoka.demoazure001.infrastructure.rest.controller;


import com.shoka.demoazure001.domain.dto.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<GenericResponse> verDemo() {
        GenericResponse response = new GenericResponse("Prueba exitosa...");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
