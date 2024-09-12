package com.example.todo.services.Imp;

import com.example.todo.Repository.TodoRepository;
import com.example.todo.Transformer.TodoTransformer;
import com.example.todo.dto.RequestDto.TodoRequest;
import com.example.todo.dto.RespDto.TodoResponseDto;
import com.example.todo.models.Todo;
import com.example.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImp implements TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoServiceImp(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public ResponseEntity<String> add(TodoRequest todoRequest) {
        Todo todo = TodoTransformer.todoRequestToTodo(todoRequest);
       todoRepository.save(todo);

        return ResponseEntity.ok("Todo added");
    }
    public ResponseEntity<String> put(TodoRequest todoRequest) {
        Todo todo = TodoTransformer.todoRequestToTodo(todoRequest);
        todo.setId(todoRequest.getId());
        todoRepository.save(todo);

        return ResponseEntity.ok("Todo updated");
    }

    @Override
    public ResponseEntity<List<TodoResponseDto>> getAllData() {
        List<Todo> todos = todoRepository.findAll();
        List<TodoResponseDto> todoResponseDtos = todos.stream().map((item)->TodoTransformer.todResponseDtoFromTodo(item)).toList();
        return new ResponseEntity<>(todoResponseDtos, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<String> deleteTask(int id) {
        todoRepository.deleteById(id);
        return ResponseEntity.ok("Task with id"+ id+" has been deleted");
    }

}
