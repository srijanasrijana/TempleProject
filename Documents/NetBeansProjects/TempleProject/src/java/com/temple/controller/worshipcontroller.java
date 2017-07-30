/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;


import com.temple.dao.worshipDao;
import com.temple.model.Worship;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/admin/worship","/admin/worship/add","/admin/worship/delete/","/admin/worship/edit/"})
public class worshipcontroller extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        
            
           if (request.getRequestURI().equals(contextPath + "/admin/worship")) {
            //1. to get the value from dao and return to jsp page
            List<Worship> al = worshipDao.select();

           // request.setAttribute("worshipdata",worshipdao.select());
            request.setAttribute("worshipdata", al);//worshipdata=al
            RequestDispatcher rd = request.getRequestDispatcher("/admin-worship.jsp");
            rd.forward(request, response);
            
        } else if (request.getRequestURI().equals(contextPath + "/admin/worship/delete/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
            worshipDao.delete(id);
            response.sendRedirect(contextPath + "/admin/worship");
            
        } 
        else if (request.getRequestURI().equals(contextPath + "/admin/worship/edit/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
            request.setAttribute("worshipvalue", worshipDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/admin-worship.jsp");
            rd.forward(request, response);
        }
                 
             }
            
        
       
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ContextPath=request.getContextPath();

        if(request.getRequestURI().equals(ContextPath + "/admin/worship/add")){
               
                
                                     int wid=0; 
                                    try  {

                  wid=Integer.parseInt(request.getParameter("id"));
                    
              } catch (Exception e) {
                    System.out.println(e);
               
       }
            
            
            
            
            String pujaName=request.getParameter("pujaName");
            String pujaBy =request.getParameter("pujaBy");
            String  pujaTime=request.getParameter("pujaTime");
            
            
            Worship w=new Worship();
            w.setPujaName(pujaName);
            w.setPujaBy(pujaBy);
            w.setPujaTime(pujaTime);
            
            if(wid==0){
                
            
            
            worshipDao.insert(w);
            }
           else
            {
                w.setWid(wid);
               worshipDao.update(w);
            }
             
              response.sendRedirect(ContextPath + "/admin/worship");
           
            
            
            }
        }
        
        
       
    }

   


