/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frontend.controller;


import com.temple.dao.EnvironmentDao;
import com.temple.dao.EventDao;
import java.io.IOException;
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
@WebServlet({"/index2","/environment/view/"})
public class FrontendEnvironment extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/index2")){
            request.setAttribute("environmentdata",EnvironmentDao.select());
            RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
        }
        else if(request.getRequestURI().equals(contextPath+"/environment/view/"))
        {
        int id=(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("environmentdata", EnvironmentDao.selectById(id));
        RequestDispatcher rd=request.getRequestDispatcher("/environment_view.jsp");
        rd.forward(request, response);
        
            
        }
            
       
    }
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
}
