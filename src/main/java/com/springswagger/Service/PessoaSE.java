package com.springswagger.Service;

import com.springswagger.DTO.PessoaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

public class PessoaSE {
    PessoaDTO pessoa = new PessoaDTO();

    public PessoaDTO getPessoaTeste(){
        pessoa.setNome("Josefa");
        pessoa.setIdade(19);
        pessoa.setFamiliares(Arrays.asList("Mãe", "Pai", "Tia"));
        return pessoa;
    }
}
