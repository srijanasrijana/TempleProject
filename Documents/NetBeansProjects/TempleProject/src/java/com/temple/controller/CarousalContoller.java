/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;


import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.temple.dao.CarousalDao;
import com.temple.dao.EventDao;
import com.temple.model.Carousal;
import java.io.IOException;
import java.util.List;
import static javafx.application.Platform.exit;
import javax.mail.Multipart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author srijana
 */

@WebServlet({"/admin/carousal","/admin/carousal/add","/admin/carousal/delete/","/admin/carousal/edit/"})
public class CarousalContoller extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String contextPath=request.getContextPath();
        
            
           if (request.getRequestURI().equals(contextPath + "/admin/carousal")) {
          
            
               List<Carousal> al=CarousalDao.select();
          request.setAttribute("carousaldata", al);
            
            
          
            RequestDispatcher rd = request.getRequestDispatcher("/admin-carousal.jsp");
            rd.forward(request, response);
            
        
           }
           
           else if (request.getRequestURI().equals(contextPath + "/admin/carousal/delete/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
            CarousalDao.delete(id);
            response.sendRedirect(contextPath + "/admin/carousal");
            
        } 
           
            else if (request.getRequestURI().equals(contextPath + "/admin/carousal/edit/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
              
            request.setAttribute("carousalvalue", CarousalDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/admin-carousal.jsp");
            rd.forward(request, response);
        }
           
     }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/admin/carousal/add")){
           
            String storePath=request.getServletContext().getRealPath("images");
            
          
         MultipartRequest mr=new MultipartRequest(request,storePath,10000000,new DefaultFileRenamePolicy());
                    
              
            
             String fileName=mr.getFilesystemName("file");
             String status=mr.getParameter("status");
             
              Carousal c=new Carousal();
            
            c.setStatus(status);
            c.setFile(fileName);
            CarousalDao.insert(c);
                       
            
  response.sendRedirect(contextPath+"/admin/carousal");
            
      }
        
        
        
        
       
    }

   
    

}

