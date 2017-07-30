/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class LoginDao {
    
    public static boolean validate(Login login) {
        boolean b=false;
        try {
            //Class.forName("org.postgresql.Driver");
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con = null;
        Statement st = null;
        try {
            //con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres", "anusha");
             con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres", "srijana");
        } catch (Exception e) {
            System.out.println(e);
        }
    String sql="select * from login where username='"+login.getUsername()+"' and password='"+login.getPassword()+"'";
        try {
            st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
             b=true;   
                
            }
        
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return b;
}
}
