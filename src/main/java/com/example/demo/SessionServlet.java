package com.example.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Session")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        //Getting the session object
        HttpSession session = request.getSession();

        //setting the session attribute
        session.setAttribute("userName","Minkoko");

        //getting session attribute
        String userName = (String) session.getAttribute("userName");

        try {
            // Display the attribute value in the response
            response.getWriter().println("Username from Session: " + userName);

            // Invalidate the session after displaying the attribute
            session.invalidate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
