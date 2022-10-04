package com.example.mytodo.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private Boolean completed;
}
