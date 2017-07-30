
package com.temple.loginfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter({"/admin/*"})//redirects /admin urls to this filter
public class NextFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hr=(HttpServletRequest) request;
        HttpServletResponse hs=(HttpServletResponse) response;
       HttpSession session=hr.getSession(false);//if true or blank vayo ki already session xa ki xaena check 
       //false already session vaye use same session else not make new session
       if(session!=null && session.getAttribute("user")!=null)
       {
       chain.doFilter(request, response);
       
       }
       else
       {
       hs.sendRedirect(hr.getContextPath()+"/login");
       }
    }

    @Override
    public void destroy() {
    }
    
}
