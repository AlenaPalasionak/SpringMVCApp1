package org.palasionak.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller// создается объект, с методами
@RequestMapping("/first")// у адреса будет префикс first/
public class FirstController {

    @GetMapping("/hello")//хотим принимать на вход get-запросы
    public String helloPage(@RequestParam(value = "name", required = false) String name, //required = false - для запроса без параметров
                            @RequestParam(value = "surname", required = false) String surname, Model model) {

        //  System.out.println("Hello " + name +" "+ surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);

        return "first/hello";// вьюшки(представления) будут лежать в папке first во views

/*
по адресу /first/hello мы перейдем в метод помеченный аннотацией @GetMapping("/hello"). Метод возвращает путь к
тому файлу html, в котором прописано, что будет отображаться: папка - first, файл - hello
*/
    }

    @GetMapping("/goodbye")// наберем этот адрес - перейдем в этот метод, этот метод вернёт путь к вьюшке
    public String goodbyeString() {
        return "first/goodbye";// вьюшки(представления) будут лежать в папке first во views
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("action") String action, Model model) {
        double result;

        switch (action) {
            case "multiplication":
                result = a*b;
                break;
            case"division":
                result = a/(double)b;
                break;
            case "subtraction":
                result = a-b;
                break;
            case "addition":
                result = a+b;
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute("result", result);// по ключу result поместим значение в переменную result. В html файле
        // обратимся по этому ключу к значеию <p th:text="${result}"/>
        return "first/calculator";
    }
}




