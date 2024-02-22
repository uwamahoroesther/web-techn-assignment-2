package rw.ac.auca.controller;

import rw.ac.auca.model.AccademicUnit;
import rw.ac.auca.model.EAccademicUnit;
import rw.ac.auca.service.AccademicUnitInterface;
import rw.ac.auca.service.AccademicUnitService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AccademicUnitServlet", value = "/AccademicUnitServlet")
public class AccademicUnitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code= request.getParameter("code");
        String name= request.getParameter("name");
        String unit= request.getParameter("unit");
        String parentId = request.getParameter("parent");
       // String parent=AccademicUnit.parce( request.getParameter("parent"));

        AccademicUnit accademicUnit= new AccademicUnit();
        AccademicUnitInterface ifc= new AccademicUnitService();
        accademicUnit.setUnit(EAccademicUnit.valueOf(unit));
        accademicUnit.setName(name);
        accademicUnit.setCode(code);
        //accademicUnit.setParent(parentUnit);

        boolean saved=ifc.createAcademicUnit(accademicUnit);
        if(saved ==true){
            request.getRequestDispatcher("AccademicUnit.jsp").forward(request,response);
        }

    }
}
