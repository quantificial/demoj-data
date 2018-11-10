package com.quantificial.demojdata;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// use lombok to auto create getter and setter
@Data
@Entity
public class Book {
	
	// unique id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue
    @Column(name = "bookid")
    private Integer bookid;
    
    // book name
    @Column(name = "name")
    private String name;
    
    // book author
    @Column(name = "author")
    private String author;
}