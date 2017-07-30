/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frontend.controller;


import com.temple.dao.worshipDao;
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
@WebServlet({"/indexs","/worship/view/"})
public class FrontendWorship extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/indexs")){
            request.setAttribute("worshipdata",worshipDao.select());
            RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
        }
        
         else if(request.getRequestURI().equals(contextPath+"/worship/view/"))
        {
        int id=(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("worshipdata", worshipDao.selectById(id));
        RequestDispatcher rd=request.getRequestDispatcher("/worship-view.jsp");
        rd.forward(request, response);
        
            
        }
            
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   

}
