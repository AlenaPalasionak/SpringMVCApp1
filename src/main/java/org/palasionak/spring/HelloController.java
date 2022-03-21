package org.palasionak.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")//когда польз-ль в строке бр-ра набирать /hello-world, запрос будет приходить в метод этого кнтроллера
    public String sayHello() {
        return "hello_world";

    }
}
