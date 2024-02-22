package rw.ac.auca.controller;

import rw.ac.auca.model.EQualificatio;
import rw.ac.auca.model.Teacher;
import rw.ac.auca.service.TeacherInterface;
import rw.ac.auca.service.TeacherService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TeacherServlet", value = "/TeacherServlet")
public class TeacherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tCode= request.getParameter("tCode");
        String names= request.getParameter("name");
        String email= request.getParameter("email");
        String phone= request.getParameter("phone");
        String qualification =request.getParameter("qualification");
        TeacherInterface teacherInterface= new TeacherService();
        Teacher teacher= new Teacher();
        teacher.setEmail(email);
        teacher.setName(names);
        teacher.setPhone(phone);
        teacher.setQualification(EQualificatio.valueOf(qualification));

        teacher.settCode(tCode);
       boolean saved= teacherInterface.newTeacher(teacher);
       if(saved ==true){
           request.getRequestDispatcher("Teacher.jsp").forward(request,response);
       }


    }
}
