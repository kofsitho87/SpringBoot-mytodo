package com.example.mytodo.controller;

import com.example.mytodo.dto.CreateTodoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/todos")
    public String todos(){
        return "test";
    }

    @PostMapping("/todos")
    public String createNewTodo(CreateTodoDto newTodo){
        return "asd";
    }
}
