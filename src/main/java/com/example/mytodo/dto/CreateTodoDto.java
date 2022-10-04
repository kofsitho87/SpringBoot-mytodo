package com.example.mytodo.dto;

import com.example.mytodo.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class CreateTodoDto {
    private String title;
    private Boolean completed;

    public Todo toEntity() {
        return new Todo(null, title, false);
    }
}
