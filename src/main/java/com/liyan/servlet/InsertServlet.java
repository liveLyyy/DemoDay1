package com.liyan.servlet;

import com.liyan.pojo.Flower;
import com.liyan.service.Impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class InsertServlet extends HttpServlet {
    private FlowerServiceImpl flowerService = null;

    private Flower flower;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        flowerService = new FlowerServiceImpl();
        String name = req.getParameter("name");
        Double price = Double.parseDouble(req.getParameter("price"));
        String production = req.getParameter("production");
        flower = new Flower(name, price, production);
        flowerService = new FlowerServiceImpl();
        try {
            int row = flowerService.insert(flower);
            if (row > 0) {
                  resp.sendRedirect("insert.jsp");
//                req.getRequestDispatcher("show").forward(req,resp);
            } else {
                resp.sendRedirect("show");
//                req.getRequestDispatcher("insert.jsp").forward(req,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
