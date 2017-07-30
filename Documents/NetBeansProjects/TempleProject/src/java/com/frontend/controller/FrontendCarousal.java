/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frontend.controller;


import com.temple.dao.CarousalDao;
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
@WebServlet({"/index1","/carousal/view/"})
public class FrontendCarousal extends HttpServlet {

   
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/index1")){
            request.setAttribute("carousaldata",CarousalDao.select());
            RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
        }
        else if(request.getRequestURI().equals(contextPath+"/carousal/view/"))
        {
        int id=(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("carousaldata", CarousalDao.selectById(id));
        RequestDispatcher rd=request.getRequestDispatcher("/carousal-view.jsp");
        rd.forward(request, response);
        
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    
}
