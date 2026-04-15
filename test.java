#!/bin/bash

############ this is test

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "testpass";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        response.setContentType("text/html");
        if (USERNAME.equals(user) && PASSWORD.equals(pass)) {
            response.getWriter().println("<h2>Login Successful!</h2>");
        } else {
            response.getWriter().println("<h2>Invalid Credentials</h2>");
        }
    }
}

