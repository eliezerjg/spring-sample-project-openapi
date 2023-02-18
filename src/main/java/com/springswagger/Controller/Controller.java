package com.springswagger.Controller;

import com.springswagger.DTO.PessoaDTO;
import com.springswagger.Service.PessoaSE;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/", method = RequestMethod.GET)
public class Controller {

    PessoaSE pessoaSE = new PessoaSE();

    @GetMapping("teste")
    @ApiResponses(
            @ApiResponse(code = 418, message = "Eu sou uma xicara de chá")
    )
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok("Ola mundo");
    }

    @GetMapping("teste2")
    @ApiResponses(
            @ApiResponse(code = 418, message = "Eu não sou uma xicara de chá")
    )
    public String helloWorld2(){
        return "Ola mundo";
    }


    @GetMapping(value = "pessoaExemplo", produces = { "application/json" })
    @ApiResponses(
            @ApiResponse(code = 418, message = "Eu não sou uma xicara de chá")
    )
    public PessoaDTO pessoaExemplo(){
        return pessoaSE.getPessoaTeste();
    }



}
