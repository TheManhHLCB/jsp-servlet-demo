package com.codegym;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Hello Servlet</title></head>");
            out.println("<body style='font-family: Arial, sans-serif;'>");
            out.println("<h1 style='color: #1b2a7a;'>Chào mừng bạn đến với Servlet đầu tiên!</h1>");
            out.println("<p style='color: #f15a24; font-size: 18px;'>Triển khai thành công trên Antigravity IDE 2026</p>");
            out.println("<a href='index.jsp'>Quay lại trang chủ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}