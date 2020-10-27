package com.ecz;
import java.util.List;
import java.util.Map;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;
public class fluentApi {

void fluentDb(){

    Handle handle = null;
        DBI dbi = new DBI("jdbc:mysql://localhost:3306/coffee_store","root","yash"); 
        
        String sql = "SELECT * FROM PRODUCTS";
        
        try {
            handle =  dbi.open();
            Query<Map<String,Object>> slectQuery = handle.createQuery(sql);
            List<Map<String,Object>> productListOfMaps = slectQuery.list();

            // System.out.println("select query"+slectQuery); 
            System.out.println("id | coffee    | price  ");

            for(Map<String,Object> productMap : productListOfMaps){

                System.out.printf("%s |",productMap.get("id"));
                System.out.printf("%s |",productMap.get("name"));
                System.out.printf("%s |",productMap.get("price")).println();


        }
        } catch (Exception e) {
            System.out.println("Exception + " + e);
        }

    }
    
}
