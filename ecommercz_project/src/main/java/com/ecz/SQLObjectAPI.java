package com.ecz;

import org.skife.jdbi.v2.DBI;

public class SQLObjectAPI {

    void SQLObject(){
    try {
        // Loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Create a DBI which directly uses the DriverManager
        DBI dbi = new DBI("jdbc:mysql://localhost:3306/coffee_store?allowPublicKeyRetrieval=true&useSSL=false", "root","yash");

            

     //   ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
     //   List<Product> productList = productDAO.productList();
     //   System.out.println(productList);

     // short hand
     System.out.println(dbi.onDemand(ProductDAO.class).productList());
     
    
    System.out.println("");
     } catch (ClassNotFoundException e) {
        System.out.println("Error Connecting to Database!" + e);
     }

    }  


    void insertProduct(){
        DBI dbi = new DBI("jdbc:mysql://localhost:3306/coffee_store?allowPublicKeyRetrieval=true&useSSL=false", "root",
        "yash");

        ProductDAO productDAO = dbi.onDemand(ProductDAO.class);

        // int rowInserted = productDAO.insertProduct("8","chocolate","4.00","india");
        int rowInserted = productDAO.insertProduct("9","StarBucks","5.00","USA");
        // int rowInserted = productDAO.insertProduct("10","Cold Coffee","2.00","India");

        System.out.println("No of Rows Updated : " + rowInserted);

    }

}
