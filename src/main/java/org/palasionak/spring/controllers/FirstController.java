package org.palasionak.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// создается объект, с методами
//@RequestMapping("/first")// у адреса будет префикс first/
public class FirstController {

    @GetMapping("/hello")//хотим принимать на вход get-запросы
    public String helloPage(@ReqestParam("name") String name, @RequestParam("SurName") String surname) {
        return "first/hello";// вьюшки(представления) будут лежать в папке first во views

    }
    @GetMapping("/goodbye")
    public String goodbyeString() {
        return "first/goodbye";// вьюшки(представления) будут лежать в папке first во views

    }
}
//public String helloPage(@ReqestParam("name") String name, @RequestParam("SurName") String surname) {