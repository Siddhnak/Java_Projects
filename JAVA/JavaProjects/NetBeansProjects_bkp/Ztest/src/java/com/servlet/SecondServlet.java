/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.io.IOException;
import java.io.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Siddhant Naik
 */
 public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("this is servlet using the GENERIC SERVLET"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>THis is my second servlet using generic\n bhai waah"
                + " servlet</h1>");
    
//        BUT STILL WE NEED TO DO THE MAPPING
    }
    
}
