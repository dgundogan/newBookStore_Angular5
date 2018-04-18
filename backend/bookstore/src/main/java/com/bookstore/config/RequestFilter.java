package com.bookstore.config;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestFilter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)  {
   /*     HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Methods","PUT, POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers","x-request-with, x-auth-token");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Credentials","true");

        if(!request.getMethod().equalsIgnoreCase("OPTIONS")){
            try {
                chain.doFilter(req,res);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ServletException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Pre-fight");
            response.setHeader("Access-Control-Allow-Methods","POST, GET,  DELETE");
            response.setHeader("Access-Control-Allow-Headers","authorization, content-type, x-request-with, x-auth-token" +
                    "access-control-request-header, access-control-request-method, accept, origin");
            response.setHeader("Access-Control-Max-Age","3600");
            response.setStatus(HttpServletResponse.SC_OK);
        }*/
    }

    public void init (FilterConfig config) {}

    public void destroy(){}
}
