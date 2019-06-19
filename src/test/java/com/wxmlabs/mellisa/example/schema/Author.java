package com.wxmlabs.mellisa.example.schema;

import com.wxmlabs.mellisa.graphql.Type;
import com.wxmlabs.mellisa.graphql.object.ID;

@Type
public class Author {
  @ID String id;
  String firstName;
  String lastName;
}
