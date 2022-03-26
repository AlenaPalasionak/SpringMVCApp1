package org.palasionak.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller// создается объект, с методами
@RequestMapping("/first")// у адреса будет префикс first/
public class FirstController {

    @GetMapping("/hello")//хотим принимать на вход get-запросы
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surName = request.getParameter("surname");

        System.out.println("Hello " + name +" "+ surName);
        return "first/hello";// вьюшки(представления) будут лежать в папке first во views

    }
    @GetMapping("/goodbye")
    public String goodbyeString() {
        return "first/goodbye";// вьюшки(представления) будут лежать в папке first во views

    }
}
