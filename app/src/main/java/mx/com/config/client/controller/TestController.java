package mx.com.config.client.controller;

import mx.com.config.client.model.Persona;
import mx.com.config.client.service.PerosnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TestController {

    private PerosnaService service;

    @Autowired
    public TestController(PerosnaService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Persona> sayHi(@PathVariable String id) {
        return service.getPersona(id);
    }

}


