package com.springswagger.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Getter
@Setter
public class PessoaDTO {
    String nome;
    int idade;
    List<String> familiares;
}
