package it.step.controller;

import it.step.model.Employee;
import it.step.model.EmployeeDAO;
import it.step.model.EmployeeModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPBinding;
import java.io.IOException;
import java.util.List;

public class ListController extends HttpServlet {
    //private EmployeeModel employeeModel=new EmployeeModel();
    //HTTP
    //GET

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      // List<Employee> employeeList=employeeModel.getEmployeeList();

        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> all = dao.findAll();
       if(all.isEmpty()){System.out.println("Nu am gasit nimic!");}
       for (Employee emp:all){System.out.println(emp);}

        String searchBy = req.getParameter("search");
        if(searchBy!=null){this.search(req, resp);}
        else{this.displayPage(req, resp);}

    }

    private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page =1;
        EmployeeModel model= EmployeeModel.getInstance();
        String requestedPage = req.getParameter("p");
        if(requestedPage != null){
            page = Integer.parseInt(requestedPage);
        }
        String searchBy = req.getParameter("search");
//TODO de implementat paginare cu cautare

        req.setAttribute("lista", model.search(searchBy, page));
        req.setAttribute("activePage", page);
        req.setAttribute("totalPages", model.getTotalPages(searchBy));
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }

    private void displayPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page =1;
        String requestedPage = req.getParameter("p");

        if(requestedPage != null){
            page = Integer.parseInt(requestedPage);
        }
        //TODO de fixat logica pentru pagina inexistenta


        EmployeeModel model = EmployeeModel.getInstance();
        int totalPages = model.getTotalPages();
        req.setAttribute("lista", model.getPage(page));
        req.setAttribute("activePage", page);
        req.setAttribute("totalPages", totalPages);

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(req, resp);
    }


    //POST

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       String searchBy= req.getParameter("search");
//       EmployeeModel model = EmployeeModel.getInstance();
//       List<Employee> list= model.search(searchBy);
//       req.setAttribute("lista", list);
//       req.setAttribute("activePage",1);
//       int totalPages = model.getTotalPages();
//       req.setAttribute("totalPages", totalPages);
//        req.getRequestDispatcher("list.jsp").forward(req,resp);


    }
}
