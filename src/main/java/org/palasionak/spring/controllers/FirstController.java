package org.palasionak.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller// создается объект, с методами
@RequestMapping("/first")// у адреса будет префикс first/
public class FirstController {

    @GetMapping("/hello")//хотим принимать на вход get-запросы
    public String helloPage(@RequestParam(value = "name", required = false) String name, //required = false - для запроса без параметров
                            @RequestParam(value = "surname", required = false) String surname) {

        System.out.println("Hello " + name +" "+ surname);
        return "first/hello";// вьюшки(представления) будут лежать в папке first во views

    }
    @GetMapping("/goodbye")
    public String goodbyeString() {
        return "first/goodbye";// вьюшки(представления) будут лежать в папке first во views

    }
}
//С аннотацией @RequestMapping – мы не можем сделать запрос без параметров. Можем используя - required = false -
//А с HttpServletRequest – можно делать запрос без параметров – просто придет результат с null.



