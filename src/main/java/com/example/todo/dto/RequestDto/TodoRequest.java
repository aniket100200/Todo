package com.example.todo.dto.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class TodoRequest {
    private int id;
    private String title;
    private String description;
    private Time startTime;
  }
