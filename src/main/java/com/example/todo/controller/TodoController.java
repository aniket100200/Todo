package com.example.todo.controller;

import com.example.todo.dto.RequestDto.TodoRequest;
import com.example.todo.dto.RespDto.TodoResponseDto;
import com.example.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/say")
    public String say() {
        return "Hello World";
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody TodoRequest todoRequest) {
        return todoService.add(todoRequest);
    }

    @PutMapping("/put")
    public ResponseEntity<String> updateTodo(@RequestBody TodoRequest todo) {
        return todoService.put(todo);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<TodoResponseDto>> getAll() {
        return todoService.getAllData();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam("id") int id) {
        return todoService.deleteTask(id);
    }
}
