package com.springswagger.Controller;

import com.springswagger.DTO.PessoaDTO;
import com.springswagger.Service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v2/", method = RequestMethod.GET)
public class Controller {

    private final PessoaService service;

    @GetMapping("teste")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Ola mundo");
    }

    @GetMapping("teste2")
    public String helloWorld2(){
        return "Ola mundo";
    }


    @GetMapping(value = "pessoaExemplo", produces = { "application/json" })
    public ResponseEntity<PessoaDTO>  pessoaExemplo(){
        return ResponseEntity.ok(service.getPessoaTeste());
    }



}
