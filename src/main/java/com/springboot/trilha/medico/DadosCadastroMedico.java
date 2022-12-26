package com.springboot.trilha.medico;

import com.springboot.trilha.endereco.DadosEndereco;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public record DadosCadastroMedico(

        @NotBlank
        String nome,

        @NotBlank
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull @Valid
        DadosEndereco endereco
) {
}
