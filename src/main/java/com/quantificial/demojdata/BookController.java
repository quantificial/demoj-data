package com.quantificial.demojdata;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import ch.qos.logback.classic.Logger;

import java.util.List;

@Api(tags = "Book")
@RestController
@RequestMapping(value = "/api")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @ApiOperation(value = "get all book", notes = "list out all the books")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/v1/book", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @ApiOperation(value = "add books", notes = "add books... notes...")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "save successfully")})
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/v1/book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BookDto create(
            @ApiParam(required = true, value = "book information dto") @RequestBody BookDto bookDto) {
        Book book = new Book();
        
        System.out.println("book id:" + bookDto.getBookid());
        
        book.setBookid(bookDto.getBookid());
        book.setName(bookDto.getName());
        book.setAuthor(bookDto.getAuthor());
        book = bookRepository.save(book);
        bookDto.setBookid(book.getBookid());
        return bookDto;
    }

    @ApiOperation(value = "get book information", notes = "get book information")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "show book information")})
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/v1/book/{bookid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BookDto get(
            @ApiParam(required = true, name = "bookid", value = "book id", example="1") @PathVariable Integer bookid) {
    	
        //Book book = bookRepository.findOne(bookid);
    	Book book = bookRepository.findByBookid(bookid);
        BookDto bookDto = new BookDto();
        bookDto.setBookid(book.getBookid());
        bookDto.setName(book.getName());
        bookDto.setAuthor(book.getAuthor());
        return bookDto;
    }
    
    @ApiOperation(value = "get book entity", notes = "get book entity... notes...")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "show book information")})
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/v1/book/object/{bookid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(
            @ApiParam(required = true, name = "bookid", value = "book id", example="1") @PathVariable Integer bookid) {
    	
        //Book book = bookRepository.findOne(bookid);
    	Book book = bookRepository.findByBookid(bookid);

        return book;
    }    
}