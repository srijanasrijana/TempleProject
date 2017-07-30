/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.controller;


import com.temple.dao.CarousalDao;
import com.temple.dao.EnvironmentDao;
import com.temple.model.Environment;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
@WebServlet({"/admin/environment","/admin/environment/add", "/admin/environment/delete/","/admin/environment/edit/"})
public class EnvironmentController extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String contextpath = request.getContextPath();
          if (request.getRequestURI().equals(contextpath + "/admin/environment")) {
            List<Environment> al=EnvironmentDao.select();
              request.setAttribute("environmentdata", al);
              
              RequestDispatcher rd = request.getRequestDispatcher("/admin_environment.jsp");
            rd.forward(request, response);
          }
          
          else if (request.getRequestURI().equals(contextpath + "/admin/environment/delete/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
            EnvironmentDao.delete(id);
            response.sendRedirect(contextpath + "/admin/environment");
            
        } 
          
          else if (request.getRequestURI().equals(contextpath + "/admin/environment/edit/")) {
            int id = Integer.parseInt(request.getParameter("id").trim());
              
            request.setAttribute("environmentvalue", EnvironmentDao.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/admin_environment.jsp");
            rd.forward(request, response);
        }
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String contextpath = request.getContextPath();
          if (request.getRequestURI().equals(contextpath + "/admin/environment/add")) {
              
              int eid=0;
              try {
                  eid=Integer.parseInt(request.getParameter("id"));
              } catch (Exception e) {
                  System.out.println(e);
              }
              
              String templeName =request.getParameter("name");
              String visitorsAddress=request.getParameter("address");
              String templeCondition=request.getParameter("condition");
              String evnFile=request.getParameter("file");
              String templeVisitors=request.getParameter("visitors");
              String templeOrganizor=request.getParameter("organizer");
              String openTime=request.getParameter("time");
              String templeScope=request.getParameter("scope");
              
              
              Environment e=new Environment();
              
              e.setTempleName(templeName);
              e.setVisitorsAddress(visitorsAddress);
              e.setEnvCondition(templeCondition);
              e.setEnvFile(evnFile);
              e.setTempleVisitors(templeVisitors);
              e.setTempleOrganizor(templeOrganizor);
              e.setOpenTime(openTime);
              e.setTempleScope(templeScope);
              
              
              if(eid==0){
              EnvironmentDao.insert(e);
              }else
              {
                  e.setEid(eid);
                  EnvironmentDao.update(e);
              }
          }
        response.sendRedirect(contextpath + "/admin/environment");
        
       
    }


}
