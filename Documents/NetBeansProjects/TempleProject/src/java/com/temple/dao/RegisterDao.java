/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Register;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class RegisterDao {

    public static void insert(Register register) {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (Exception e) {
        }
        Connection con = null;
        Statement st = null;
        try {
             con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres","srijana");

        } catch (Exception e) {
        }
        String sql = "insert into register(email,firstname,lastname,password,address) values('" + register.getEmail() + "','"
                + register.getFname() + "','" + register.getLname() + "','" + register.getPassword() + "','" + register.getAddress() + "')";

        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
