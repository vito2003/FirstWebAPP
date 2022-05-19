package com.example.firstwebapp;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import appLayer.User;
@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User userObject = new User();
        request.setAttribute("rname", request.getParameter("loginname"));
        request.setAttribute("password", request.getParameter("loginpassword"));
        if (userObject.isValidUserCredentials(request.getParameter("loginname"), request.getParameter("loginpassword"))){
            request.getRequestDispatcher("/userpage.jsp").forward(request,response);
        }
            else
        {
            request.setAttribute("errorMessage", "Invalid login and password, Try again");
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }
                }
            }




