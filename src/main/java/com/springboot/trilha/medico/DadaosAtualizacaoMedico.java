package com.springboot.trilha.medico;

import com.springboot.trilha.endereco.DadosEndereco;

import javax.validation.constraints.NotNull;

public record DadaosAtualizacaoMedico(

        @NotNull
        Long id,
        String nome,
        DadosEndereco endereco
) {
}
