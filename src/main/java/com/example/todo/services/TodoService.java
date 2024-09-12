package com.example.todo.services;

import com.example.todo.dto.RequestDto.TodoRequest;
import com.example.todo.dto.RespDto.TodoResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TodoService {
     ResponseEntity<String> add(@RequestBody TodoRequest todoRequest);
     ResponseEntity<String> put(TodoRequest todoRequest);
     ResponseEntity<List<TodoResponseDto>> getAllData();
     ResponseEntity<String> deleteTask (int id);
}
