package com.elainevalles.ifct0062_2025_ws_hello_world.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludadorController {

    public static final String template = "Hola, %s!";
    private final AtomicLong counter = new AtomicLong(); //avoid memory or call inconsistency in data
}
