
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
    out.println("<h2>Welcome to the Register Servlet -This is from http servlet</h2>");
    String name = request.getParameter("user_name");
    String password = request.getParameter("user_password");
    String email = request.getParameter("user_email");
    String gender = request.getParameter("user_gender");
    
    String course = request.getParameter("user_course");
    
    String cond = request.getParameter("condition");
//    out.println(cond);// For checking the null value is there or not
    if (cond != null){
        
    
    if (cond.equals("checked")){
        out.println("<h2>Name :" +name+"<h2>");
        out.println("<h2>|Password :" +password+"<h2>");
        out.println("<h2>Email :" +email+"<h2>");
        out.println("<h2>Gender :" +gender+"<h2>");
        out.println("<h2>Course :" +course+"<h2>");

        
        //Now lets assume that the data has been saved to the DB
        
        
        //Now we are passing the success at the servlets place..
        
        RequestDispatcher rd = request.getRequestDispatcher("success");
        rd.forward(request, response);
        
    }else{ out.println("<h2>Thank you Saar</h2>");
}
 
    
            
//    Now lets do the mapping for the mentioned servlets inside WEB-INF
}else{
        out.println("<h2>YOu haven't accepted the T&C Saar</h2>");

        RequestDispatcher rd=request.getRequestDispatcher("index.html");
        rd.include(request, response); 
//         Important which is covered in the 10 th vid

    }
}
}
