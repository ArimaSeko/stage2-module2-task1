package com.example.servlet;


import com.example.User;
import com.example.Warehouse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        Warehouse.getInstance().addUser(new User(firstName, lastName));
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>This user added!</h1>");
        printWriter.print("<p> firstName :: " + firstName + "</p>");
        printWriter.print("<p> lastName :: " + lastName + "</p>");
        printWriter.print("<button class=\"w3-btn w3-light-blue w3-round-large\" onclick=\"location.href='http://localhost:8080/users'\">Users</button>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

    }
}
