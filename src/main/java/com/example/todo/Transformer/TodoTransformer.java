package com.example.todo.Transformer;

import com.example.todo.dto.RequestDto.TodoRequest;
import com.example.todo.dto.RespDto.TodoResponseDto;
import com.example.todo.models.Todo;

public class TodoTransformer {

    public static Todo todoRequestToTodo(TodoRequest todo) {
        return Todo.builder().title(todo.getTitle()).description(todo.getDescription()).time(todo.getStartTime()).build();
    }

    public static TodoResponseDto todResponseDtoFromTodo(Todo todo) {
        return TodoResponseDto.builder()
                .id(todo.getId())
                .title(todo.getTitle())
                .description(todo.getDescription())
                .time(todo.getTime()).build();
    }
}
