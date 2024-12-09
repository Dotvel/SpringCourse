package ru.myasnov.springcourse.config.controllers;

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
                            @RequestParam(value = "surname", required = false) String surname, Model model) {
        //  System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);

        return "first/hello"; //first это папка в которой будет лежать наш контроллер
    }

    @GetMapping("/calculator") //реализуем простой калькулятор: добавляем маппинг на метод
    public String calculatorPage(@RequestParam("a") int a, //добавили целое число "а"
                                 @RequestParam("b") int b, //добавили целое число "b"
                                 @RequestParam("action") String action, Model model) { //добавили действие с этими числами в строковом формате и модель
        double result; //добавили вещественную переменную куда будем записывать наше действие с числами
        switch (action) {
            case "multiplication": //умножение
                result = a * b;
                break;
            case "addition": //сложение
                result = a + b;
                break;
            case "subtraction": //вычитание
                result = a - b;
                break;
            case "division":
                result = a / (double) b; //деление приравнием к вещественному числу
                break;
            default:
                result = 0; //если не ввели никакое действие(action=)
                break;
        }
        model.addAttribute("result", result); //с помощью модели выводим результат на экран

        return "first/calculator"; //возвращаем страницу в браузере
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
