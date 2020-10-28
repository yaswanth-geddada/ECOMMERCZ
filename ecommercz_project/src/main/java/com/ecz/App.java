package com.ecz;

import com.ecz.leave.LeaveCaller;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        // fluentApi fluentDBapi = new fluentApi();

        // fluentDBapi.fluentDb();

       

        // SQLObjectAPI obSql = new SQLObjectAPI();
        // obSql.SQLObject();
        // obSql.insertProduct();
        LeaveCaller leaveMethod = new LeaveCaller();
        leaveMethod.leaveInfo();
        // leaveMethod.insertLeave();
    }
}
