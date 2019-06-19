package com.wxmlabs.mellisa.example.schema;

import com.wxmlabs.mellisa.graphql.Type;
import com.wxmlabs.mellisa.graphql.object.ID;

@Type
public class Book {
  @ID String id;
  String name;
  int pageCount;
  Author author;
}
