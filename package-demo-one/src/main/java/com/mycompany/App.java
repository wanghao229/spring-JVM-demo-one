package com.mycompany;

import com.alibaba.fastjson.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        JSONObject.parse(" {\"@type\":\"java.lang.Class\", \"val\":\"com.sun.rowset.JdbcRowSetImpl\"}");

    }

    void incriment(){
        int i = 18;
        i = i + 1;
    }

}
