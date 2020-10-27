package com.ecz;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class ProductMapper implements ResultSetMapper<Product> {

    @Override
    public Product map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        String ProductId = resultSet.getString("id");

        
        String productName = resultSet.getString("name");
        String price = resultSet.getString("price");
        String coffeeOrigin = resultSet.getString("coffee_origin");

        Product product = new Product(ProductId,productName,price,coffeeOrigin);


        return product;

    }

}
