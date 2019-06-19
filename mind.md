
当一个POJO声明为Schema时自动生成同名GraphQL类，包含Queries和Mutations的处理器。类似gorm-graphql

Queries
 - book(id:..)
 - bookList(max:.., sort:.., etc)
 - bookCount
Mutations
 - bookCreate(book: {})
 - bookUpdate(id:.., book: {})
 - bookDelete(id:..)

 ### Scalars Mapping

 |GraphQL|Java|Description|
 |---|---|---|
 |Int|int/Integer|当允许为null时须使用Integer|
 |Float|double/Double|当允许为null时须使用Double|
 |String|String||
 |Boolean|boolean/Boolean|当允许为null时须使用Boolean|
 |ID|String|须使用java注释ID声明字段|
 |Time|Date||
 |Url|URL||

example提供示例，演示mellisa的使用方法。

TODO 支持生成interface
