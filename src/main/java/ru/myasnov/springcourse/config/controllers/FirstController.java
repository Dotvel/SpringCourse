package ru.myasnov.springcourse.config.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first") //если попробуем переходить по запросу http//..../hello он не найдет эту страницу
//так мы поставили маппинг на класс и теперь наш запрос будет с преффиксом /first (http//...../first/hello == http//.../first/goodbye)
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname) {
        System.out.println("Hello, " + name + " " + surname);

        return "first/hello"; //first это папка в которой будет лежать наш контроллер
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
