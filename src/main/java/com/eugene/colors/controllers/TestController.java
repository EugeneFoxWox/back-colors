package com.eugene.colors.controllers;

import com.eugene.colors.dto.CreatePaletteDto;
import com.eugene.colors.services.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    private final TestService service;

    public TestController(TestService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreatePaletteDto dto){

        return ResponseEntity.ok(service.createPalette(dto));
    }

    @GetMapping()
    public ResponseEntity<?> test(){

        return ResponseEntity.ok(service.getPalettes());
    }

    @GetMapping("/palettes")
    public ResponseEntity<?> getPalettes(@RequestParam List<Long> ids){
        return ResponseEntity.ok(service.getPalettesById(ids));
    }



}
