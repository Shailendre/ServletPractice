package org.shailendra.singh;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by shailendra.singh on 7/15/16.
 */
@WebServlet(name = "helloservlet", urlPatterns = { "/helloservlet"})
public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printer = resp.getWriter();
        printer.println("<html><body>");
        printer.println("hello world");
        printer.println("</body></html>");
        printer.flush();
    }
}
