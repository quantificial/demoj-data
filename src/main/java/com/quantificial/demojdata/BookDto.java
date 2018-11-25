package com.quantificial.demojdata;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

// data transfer object
@Data
@ApiModel(description = "basic book information")
public class BookDto {
    @ApiModelProperty(value = "book series", required = true)
    private Integer bookid;
    @ApiModelProperty(value = "book name", required = true)
    private String name;
    @ApiModelProperty(value = "author", required = true)
    private String author;
}