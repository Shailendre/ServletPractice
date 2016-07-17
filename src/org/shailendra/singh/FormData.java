package org.shailendra.singh;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shailendra.singh on 7/16/16.
 */
@WebServlet(name = "formdataservlet", urlPatterns = {"/formservlet"})
public class FormData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Servlet read follwing data from formdata.html</h1>");
        printWriter.println("<br><h5>"+req.getParameter("uname")+"</h5>");
        printWriter.println("<br><h5>"+req.getParameter("password")+"</h5>");
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
