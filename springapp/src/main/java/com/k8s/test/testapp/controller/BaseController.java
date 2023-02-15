package com.k8s.test.testapp.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
@Log4j2
public class BaseController {

    @GetMapping("/status")
    public ResponseEntity<String> checkStatus(){
        log.info("Received check status request");
        return  ResponseEntity.ok().body("Hello! Application is Running... :D");
    }

}
