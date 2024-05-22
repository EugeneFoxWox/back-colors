package com.eugene.colors.services;

import com.eugene.colors.dto.CreatePaletteDto;
import com.eugene.colors.models.Palette;
import com.eugene.colors.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestService {
    private final TestRepository repository;
    private final ModelMapper mapper;


    public Palette createPalette(CreatePaletteDto dto){
        Palette palette = mapper.map(dto, Palette.class);
        return repository.save(palette);
    }
    public List<Palette> getPalettes(){
        return repository.findAll();
    }

    public List<Palette> getPalettesById(List<Long> ids){
        return repository.findAllById(ids);
    }
}
