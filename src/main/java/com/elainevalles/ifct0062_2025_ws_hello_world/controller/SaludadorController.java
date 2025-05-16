package com.elainevalles.ifct0062_2025_ws_hello_world.controller;

import com.elainevalles.ifct0062_2025_ws_hello_world.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludadorController {

    public static final String template = "Hola, %s!";
    private final AtomicLong counter = new AtomicLong(); //avoid memory or call inconsistency in data

    @GetMapping("/saludo")
    public Saludo saludo(@RequestParam(value= "nombre", defaultValue="World") String nombre) {
        return new Saludo(counter.incrementAndGet(), String.format(template, nombre));
    }


}
