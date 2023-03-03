package it.step.controller;
import it.step.model.Employee;
import it.step.model.EmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class AddController extends HttpServlet{
//metoda http get

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //resp.sendRedirect("add.jsp");
        req.getRequestDispatcher("add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String birthdate = req.getParameter("birthdate");
        EmployeeModel model = EmployeeModel.getInstance();
        model.add(new Employee(name, surname, LocalDate.parse(birthdate)));
        resp.sendRedirect("list");
    }
}
