/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;


import com.temple.model.Carousal;
import com.temple.model.Event;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author srijana
 */
public class CarousalDao {
    
    public static void insert(Carousal c)
    {
        try{
           Class.forName("org.postgresql.Driver");
           
           
       } 
       catch(Exception e){
           
       }
       Connection con=null;
       Statement st=null;
       
       try{
           con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres","srijana");
       }
       catch(Exception e){
           System.out.println(e);
    }
       
       String sql="insert into carousal(status,file)values('"+c.getStatus()+"','"+c.getFile()+"')";
        try {
            st=con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
        }
       
    }

 public static List<Carousal>select(){
        ArrayList al=new ArrayList();
        
        
          try{
           Class.forName("org.postgresql.Driver");
           
           
       } 
       catch(Exception e){
           
       }
       Connection con=null;
       Statement st=null;
       
       try{
           con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres","srijana");
       }
       catch(Exception e){
           System.out.println(e);
    }
       String sql="select * from carousal";
        try {
            st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                al.add(new Carousal(rs.getInt("id"),rs.getString("status"),rs.getString("file")));
               
            
        } 
        }
            catch (Exception  e) {
        }
           return al;    
        
    }
 
 
  public static void delete(int id) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres", "srijana");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "delete from carousal where id=" + id;
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     
  
   public static List<Carousal> selectById(int id) {
        ArrayList al = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres", "srijana");
        } catch (Exception e) {
            System.out.println(e);
        }
        String sql = "select * from carousal where id=" + id;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                 al.add(new Carousal(rs.getInt("id"), rs.getString("status"), rs.getString("file")));
                
            }
      
        } catch (Exception e) {
        }
        return al;
    }
    
 
}

    
    