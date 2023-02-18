package com.springswagger.springswagger;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping(value = "/api/v1/", method = RequestMethod.GET)
public class Controller {

    @GetMapping("teste")
    @ResponseBody
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok("Ola mundo");
    }
}
