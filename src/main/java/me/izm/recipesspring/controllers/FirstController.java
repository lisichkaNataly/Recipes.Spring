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
    public String info(@RequestParam String name, String nameProject, String date, String description) {
        return "Информация о проекте: Имя ученика: " + name
                + " название проекта: " + nameProject + " дата создания: " + date + " описание проекта: " + description;
    }
}
