package com.devsuperior.dsmovie.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Setter
@Getter
public class ScoreDto {

    private Long movieId;
    private String email;
    private BigDecimal score;
}
