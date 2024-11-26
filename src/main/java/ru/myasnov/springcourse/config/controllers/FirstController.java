package ru.myasnov.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first") //если попробуем переходить по запросу http//..../hello он не найдет эту страницу
//так мы поставили маппинг на класс и теперь наш запрос будет с преффиксом /first (http//...../first/hello == http//.../first/goodbye)
public class FirstController {

    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello"; //first это папка в которой будет лежать наш контроллер
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
