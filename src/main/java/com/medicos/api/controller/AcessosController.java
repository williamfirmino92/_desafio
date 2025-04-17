package com.medicos.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcessosController {

    @GetMapping("/login")
    public String efetuarLogin() {
        return "autenticacao/login";
    }
}
