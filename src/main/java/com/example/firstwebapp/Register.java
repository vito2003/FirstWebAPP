package com.example.firstwebapp;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import appLayer.User;
@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User rightPass = new User();
        request.setAttribute("rpassword", request.getParameter("rpassword"));
        request.setAttribute("repeatpassword", request.getParameter("rrepeatpassword"));
        request.setAttribute("rname" , request.getParameter("rname"));
        if (rightPass.isRightPassword(request.getParameter("rpassword"), request.getParameter("rrepeatpassword"))) {
            request.getRequestDispatcher("/userpage.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("errorMessage", "Passwords dont match, please try again");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }
    }
}

