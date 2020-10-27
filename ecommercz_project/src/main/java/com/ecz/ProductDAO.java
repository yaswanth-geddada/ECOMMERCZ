package com.ecz;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

interface ProductDAO {
    @SqlQuery("SELECT * FROM PRODUCTS")
    @Mapper(ProductMapper.class)
    List<Product> productList();


    @SqlUpdate("Insert into products(id,name,price,coffee_origin) values(:productId,:productName,:price,:coffeeOrigin)")
    int insertProduct(@Bind("productId") String productId,
    @Bind("productName") String productName ,
    @Bind("price") String price,
    
    @Bind("coffeeOrigin")String coffeeOrigin);

    
}



