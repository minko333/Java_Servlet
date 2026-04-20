//package com.example.demo;
//
//import java.io.*;
//
//import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
//public class HelloServlet extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//    //service
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
//
//    public void destroy() {
//    }
//}

/*

Responsibilities of Servlets are as follows:

Servlets work on the server-side
It is used to handle client requests and generate a corresponding response.
Managing request dispatching (e.g., forwarding that request to another servlet).

*/

package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class HelloServlet extends HttpServlet {

   //init state
    public HelloServlet(){
        super();
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();//
        String userName = request.getParameter("userName");//getRequest
        String password = request.getParameter("password");
        out.print("<html><body>");//Post
        out.print("<h1>Hello!!!</h1>");
        out.printf("<h3>User Name with : %s </h3><h3>Your password is : %s</h3>",userName,password);
        out.print("</body></html>");

    }
}
