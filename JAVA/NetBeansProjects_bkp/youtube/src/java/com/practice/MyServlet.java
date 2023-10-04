 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


/**
 *
 * @author Siddhant Naik
 */
public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        System.out.println("this is get method ....");
        //to generate a dynamic response 
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        out.print("<h1>This is the get method</h1>");
        out.print(new Date().toString());
        
    }
    
}
