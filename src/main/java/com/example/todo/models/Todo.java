package com.example.todo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Timestamp;
import lombok.*;

import java.sql.Time;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;
    String description;
    Time time;
}
