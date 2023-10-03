package com.springswagger.Service;

import com.springswagger.DTO.PessoaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    PessoaDTO pessoa = new PessoaDTO();

    public PessoaDTO getPessoaTeste(){
        pessoa.setNome("Josefa");
        pessoa.setIdade(19);
        pessoa.setFamiliares(List.of("Mãe", "Pai", "Tia"));
        return pessoa;
    }
}
