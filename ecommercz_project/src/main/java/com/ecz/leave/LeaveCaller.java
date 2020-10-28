package com.ecz.leave;

import org.skife.jdbi.v2.DBI;

public class LeaveCaller {

    public void leaveInfo() {

        try {
            // Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a DBI which directly uses the DriverManager
            DBI dbi = new DBI("jdbc:mysql://localhost:3306/MLP252?allowPublicKeyRetrieval=true&useSSL=false",
                    "root", "yash");

            // ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
            // List<Product> productList = productDAO.productList();
            // System.out.println(productList);

            // short hand
            System.out.println(dbi.onDemand(LeaveDAO.class).leaveList());

            System.out.println("");
        } catch (ClassNotFoundException e) {
            System.out.println("Error Connecting to Database!" + e);
        }
    }

    public void insertLeave() {
        
        DBI dbi = new DBI("jdbc:mysql://localhost:3306/MLP252?allowPublicKeyRetrieval=true&useSSL=false",
        "root", "yash");
    
            LeaveDAO leaveDAO = dbi.onDemand(LeaveDAO.class);
    
            // int rowInserted = productDAO.insertProduct("8","chocolate","4.00","india");
            int rowInserted = leaveDAO.insertLeave("01","2020-10-28","2020-10-30","OP", "festival", "pending", "2020-10-28");
            // int rowInserted = productDAO.insertProduct("10","Cold Coffee","2.00","India");
    
            System.out.println("No of Rows Updated : " + rowInserted);
    
        }
    }


