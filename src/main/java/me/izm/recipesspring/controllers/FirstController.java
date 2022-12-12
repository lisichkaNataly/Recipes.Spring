package me.izm.recipesspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWorld() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return "Ученик - Наталья. Проект 'ПП-просто полезно'. Проект создан 12.12.2022." +
                " Проект: о вкусном, простом, полезном. Здесь простые, вкусные,полезные и интересные рецепты домашней кухни.";
    }
}
