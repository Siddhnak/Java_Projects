package com.spboot.DohaRiff.entity;


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
@Table(name="dohas") // Specify table details | which will map that this table in DB
public class DohaEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //basically provides the primary key as a autoincrement
    private Long id;

    @Column(name="Doha title",nullable = false) // @Column annotation for column mapping.
    private String title;


    @Column(name="user_comments")
    private String userComments;

    @Column(name="author",nullable=false)
    private String author;

    @Column(name="source",nullable=false)
    private String source;

    @Column(name="description",nullable=false)
    private String description;

//    private boolean iscompleted;

}
