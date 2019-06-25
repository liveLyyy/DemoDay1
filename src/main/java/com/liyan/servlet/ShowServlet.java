package com.liyan.servlet;

import com.liyan.pojo.Flower;
import com.liyan.service.FlowerService;
import com.liyan.service.Impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    private FlowerService flowerService=new FlowerServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Flower> list=flowerService.findAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}