package com.temple.controller;

import com.temple.dao.LoginDao;
import com.temple.dao.RegisterDao;
import com.temple.model.Login;
import com.temple.model.Register;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet({"/login","/logout"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextpath = request.getContextPath();
        if (request.getRequestURI().equals(contextpath + "/login")) {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
        else if (request.getRequestURI().equals(contextpath + "/logout")) {
            HttpSession session=request.getSession(false);
            session.invalidate();
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
       
        

        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String contextpath = request.getContextPath();
        if (request.getRequestURI().equals(contextpath + "/login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            Login l = new Login();
            l.setUsername(username);
            l.setPassword(password);

            boolean output = LoginDao.validate(l);
            if (output) {
                HttpSession session = request.getSession();
                session.setAttribute("user", username);
                RequestDispatcher rd = request.getRequestDispatcher("admin-dashboard.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        }
        
    }

}
