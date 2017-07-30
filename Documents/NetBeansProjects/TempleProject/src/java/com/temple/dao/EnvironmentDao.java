/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Carousal;
import com.temple.model.Environment;
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
public class EnvironmentDao {
    
    
      public static void insert(Environment env)
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
       
       String sql="insert into environment(templename,visitorsaddress,environmentcondition,file,templevisitors,"
               + "templeorganizor,opentime,templescope) values('"+env.getTempleName()+"','"+env.getVisitorsAddress()+"','"+env.getEnvCondition()+"','"+env.getEnvFile()
               +"','"+env.getTempleVisitors()+"','"+env.getTempleOrganizor()+"','"+env.getOpenTime()+"','"+env.getTempleScope()+"')";
        try {
            st=con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
        }
       
    }
      
      
      
      //For Show in table
      public static List<Environment>select(){
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
       String sql="select * from environment";
        try {
            st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                al.add(new Environment(rs.getInt("eid"),rs.getString("templename"),rs.getString("visitorsaddress"),
                        rs.getString("environmentcondition"),rs.getString("file"),rs.getString("templevisitors"),
                        rs.getString("templeorganizor"),rs.getString("opentime"),rs.getString("templescope")));
               
            
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
        String sql = "delete from environment where eid=" + id;
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
       
       
       
       public static List<Event> selectById(int id) {
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
        String sql = "select * from environment where eid=" + id;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
       al.add(new Environment(rs.getInt("eid"),rs.getString("templename"),rs.getString("visitorsaddress"),
                        rs.getString("environmentcondition"),rs.getString("file"),rs.getString("templevisitors"),
                        rs.getString("templeorganizor"),rs.getString("opentime"),rs.getString("templescope")));        
            }
        } catch (Exception e) {
        }
        return al;
    }
       
       
       
       public static void update(Environment e1){
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
        
         String sql="update environment set templename='"+e1.getTempleName()+"',visitorsaddress='"+e1.getVisitorsAddress()
                +"',environmentcondition='"+e1.getEnvCondition()+"',file='"+e1.getEnvFile()+"',"
                 + "templevisitors='"+e1.getTempleVisitors()+"',"
                 + "templeorganizor='"+e1.getTempleOrganizor()+"',"
                 + "opentime='"+e1.getOpenTime()+"',"
                 + "templescope='"+e1.getTempleScope()+"' where eid="+e1.getEid();
         
         
         
      
         
       
        try {
            st=con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        
      
        }
    }
        
       
       
       

   
}
