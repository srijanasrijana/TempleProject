/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;


import com.temple.model.Worship;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class worshipDao {
    
    public static void insert(Worship worship)
            
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
    
 String sql="insert into worship(worship_name,worship_time,aorship_guru)values('"+worship.getPujaName()+"','"+worship.getPujaBy()+"','"+worship.getPujaTime()+"')";
               
                           try{
                   st=con.createStatement();
                   st.execute(sql);
                
                   
               }
               catch(Exception e){
                    System.out.println(e);
               }
    }
               
   
    
    
    public static List<Worship> select(){
        ArrayList al=new ArrayList();
       try{
        Class.forName("org.postgresql.Driver");
       }
       catch(Exception e){
           System.out.println(e);
            }
     Connection con=null;
     Statement st=null;
        try {
            con=DriverManager.getConnection("jdbc:postgresql://Localhost:5432/temple", "postgres", "srijana");
        } catch (Exception e) {
        }
        
        String sql="select * from worship";
        try {
            st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                al.add(new Worship(rs.getInt("eid"),rs.getString("worship_name"),rs.getString("worship_time"),rs.getString("aorship_guru")));
            }
            
        } catch (Exception e) {
            
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
        String sql = "delete from worship where eid=" + id;
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static List<Worship> selectById(int id) {
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
        String sql = "select * from worship where eid=" + id;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Worship(rs.getInt("eid"), rs.getString("worship_name"), rs.getString("worship_time"), rs.getString("aorship_guru")));
            }
        } catch (Exception e) {
        }
        return al;
    }
    
    public static void update(Worship w){
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
        
        String sql="update worship set worship_name='"+w.getPujaName()+"',aorship_guru='"+w.getPujaBy()+"',worship_time='"+w.getPujaTime()
+"' where eid="+w.getWid();
        try {
            st=con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        
      
        }
    }
    
 }
