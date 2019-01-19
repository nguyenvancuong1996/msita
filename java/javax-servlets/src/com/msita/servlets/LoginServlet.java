package com.msita.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login-servlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("username") != null) {
            resp.sendRedirect("/welcome");
        }
        else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/jsp/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (!password.equals("123456")) {
            req.setAttribute("error_message", "Password is invalid");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/jsp/login.jsp");
            requestDispatcher.forward(req, resp);
        }
        req.getSession().setAttribute("username", username);
        resp.sendRedirect("/welcome");
    }
}
