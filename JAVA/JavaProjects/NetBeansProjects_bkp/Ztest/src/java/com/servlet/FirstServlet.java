/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;
//import java.io.IOError;
import java.io.IOException;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
/**
 *
 * @author Siddhant Naik
 */

public class FirstServlet implements Servlet {
    //overriding the methods 
    ServletConfig conf;

    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("Creating Object");
    }
    public void service(ServletRequest req,ServletResponse resp)throws 
        ServletException,IOException{System.out.println("Servicing...");
//    To process a request

//Setting the content type of the response..

resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
out.println("<h1>This is my output from Servlet method:</h1>");
out.println("<h1>Todays date and time is "+new Date().toString()+"</h1>");

    }
    public void destroy(){
        System.out.println("Going to destroy the servlet object");
    }
    //Below are the non-lifecycle method --will run when you will call them
    
    public ServletConfig getServletConfig(){
    return this.conf;
    }
    public String getServletInfo()
    {
        return "This servlet is created by MR.SSN";
    }
}
