package com.example.servlet;


import com.example.User;
import com.example.Warehouse;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import java.io.IOException;

public class AddUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        Warehouse.getInstance().addUser(new User(firstName,lastName));
        resp.sendRedirect("http://localhost:8080/jsp/add.jsp");
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){

    }
}
