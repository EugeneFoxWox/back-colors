package com.eugene.colors.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePaletteDto {

    private String primary;

    private String secondary;

    private String tertiary;

    private String quaternary;
}
