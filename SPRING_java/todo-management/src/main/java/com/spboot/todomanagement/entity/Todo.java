package com.spboot.todomanagement.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity //this class has an entity Alt+R - softwrap
@Table(name="todos") // Specify table details | which will map that this table in DB
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //basically provides the primary key as a autoincrement
    private Long id;

    @Column(name="title",nullable = false) // @Column annotation for column mapping.
    private String title;
    @Column(name="description",nullable=false)
    private String description;
    private boolean completed;

}
