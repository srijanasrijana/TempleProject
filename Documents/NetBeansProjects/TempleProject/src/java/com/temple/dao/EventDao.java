/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;


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
public class EventDao {
    
    public static void insert(Event event)
            
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
    
 String sql = "insert into event(event_name,event_time,hall_name,event_organizer,event_description) values('" + event.getEventName() + "','"
                + event.getEventTime() + "','" + event.getHallName() + "','" +event.getEventOrganizer() + "','"+event.getEventDescription() +"')";
               
                           try{
                   st=con.createStatement();
                   st.execute(sql);
                
                   
               }
               catch(Exception e){
                    System.out.println(e);
               }
    }
          
    
    
     public static List<Event> select(){
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
        
        String sql="select * from event";
        try {
            st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
    al.add(new Event(rs.getInt("eid"), rs.getString("event_name"), rs.getString("event_time"), rs.getString("hall_name"),
            rs.getString("event_organizer"), rs.getString("event_description")));           
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
        String sql = "delete from event where eid=" + id;
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
        String sql = "select * from event where eid=" + id;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
      al.add(new Event(rs.getInt("eid"), rs.getString("event_name"), rs.getString("event_time"), 
              rs.getString("hall_name"), rs.getString("event_organizer"), rs.getString("event_description")));           
            }
        } catch (Exception e) {
        }
        return al;
    }
    
    
       
       public static void update(Event e1){
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
        
         String sql="update event set event_name='"+e1.getEventName()+"',event_time='"+e1.getEventTime()
                +"',hall_name='"+e1.getHallName()+"',event_organizer='"+e1.getEventOrganizer()+"',event_description='"+e1.getEventDescription()
+"' where eid="+e1.getEid();
       
        try {
            st=con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        
      
        }
    }
        
}

