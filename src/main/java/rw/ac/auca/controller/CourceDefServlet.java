package rw.ac.auca.controller;

import rw.ac.auca.model.CourceDefinition;
import rw.ac.auca.service.CourceDefInterface;
import rw.ac.auca.service.CourceDefService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CourceDefServlet", value = "/CourceDefServlet")
public class CourceDefServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String courceCode= request.getParameter("courseCode");
        String courceName= request.getParameter("courseName");
        Integer credit=Integer.parseInt( request.getParameter("courseCredit"));
        String description=request.getParameter("courseDescription");
        CourceDefinition cource= new CourceDefinition();
        CourceDefInterface courceDefInterface= new CourceDefService();
        cource.setName(courceName);
        cource.setCredit(credit);
        cource.setDescription(description);
        cource.setCode(courceCode);
        boolean saved=courceDefInterface.newCourceDefinition(cource);
        if(saved == true){
            request.getRequestDispatcher("CourceDef.jsp").forward(request,response);
        }



    }
}
