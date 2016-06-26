package com.thinking.machines;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet
{
 public void doGet(HttpServletRequest request,HttpServletResponse response)
 {
  try
  {
   System.out.println("Login.java....");
   response.setContentType("text/html;charset=UTF-8");
   PrintWriter out=response.getWriter();
   UserBean userBean=(UserBean)request.getAttribute("userBean");
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   Connection connection;
   connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/conative", "conative", "conative@DB");
   PreparedStatement preparedStatement;
   preparedStatement=connection.prepareStatement("select * from UserInformation where username=? and password=?");
   preparedStatement.setString(1,userBean.getUsername());
   preparedStatement.setString(2,userBean.getPassword());
   ResultSet resultSet=preparedStatement.executeQuery();
   boolean b=resultSet.next();
   resultSet.close();
   preparedStatement.close();
   connection.close();
   if(b)
   {
    HttpSession session=request.getSession();
    session.setAttribute("userBean",userBean);
    response.sendRedirect("/letsDoIt.com/AdminPage.jsp");
   }
   else
   {
   ErrorBean errorBean=new ErrorBean();
   errorBean.setErrorMessage("Invalid Username/Password");
   request.setAttribute("errorBean",errorBean);
   RequestDispatcher requestDispatcher=request.getRequestDispatcher("/InvalidAccess.jsp");
   requestDispatcher.forward(request,response);
   }
  }catch(Exception e)
  {
   System.out.println(e);
  }
 }
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
 {
  doGet(request, response);
 }
}
