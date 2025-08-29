package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// camada de controle do MVC -> no spring boot eu preciso ter um controlador que tem essa notação
@RestController
public class DemoController {


    // Você vai conseguir acessar o metodo sayHello por um http
    @GetMapping("/hello")
    public String sayHello(@RequestParam String nome) {
        return "Hello, " + nome + "!";
    }

    @GetMapping("/soma")
    public String soma(@RequestParam int numero1, @RequestParam int numero2) {
        return "Resultado: " + (numero1 + numero2);
    }

    @GetMapping("/subtratir/{valor1}/{valor2}")
    public String subtrair(@PathVariable int valor1, @PathVariable int valor2) {
        return "Resultado: " + (valor1 - valor2);
    }
}
