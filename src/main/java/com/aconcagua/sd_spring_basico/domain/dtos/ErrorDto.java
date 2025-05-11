package com.aconcagua.sd_spring_basico.domain.dtos;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}

