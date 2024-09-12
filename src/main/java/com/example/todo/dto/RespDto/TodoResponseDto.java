package com.example.todo.dto.RespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoResponseDto {
    private int id;
    private String title;
    private String description;
    private Time time;
}
