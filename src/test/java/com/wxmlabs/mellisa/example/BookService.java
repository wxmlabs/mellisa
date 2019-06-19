package com.wxmlabs.mellisa.example;

import com.wxmlabs.mellisa.example.schema.Book;
import com.wxmlabs.mellisa.graphql.operation.Query;
import com.wxmlabs.mellisa.graphql.schema.Argument;

public class BookService {
    @Query
    Book bookById(@Argument("id") String id){
        return null;
    }
}
