package com.example.mytodo.controller;

import com.example.mytodo.dto.CreateTodoDto;
import com.example.mytodo.entity.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/todos")
    public String todos(){
        return "test";
    }

    @PostMapping("/todos")
    public ResponseEntity<Todo> createNewTodo(@RequestBody CreateTodoDto newTodo){
        Todo result = newTodo.toEntity();
        return new ResponseEntity(result, HttpStatus.CREATED);
    }
}
