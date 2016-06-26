package com.thinking.machines;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Logout extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 {
  try
  {
   response.setContentType("text/html;charset=UTF-8");
   PrintWriter out=response.getWriter();
   HttpSession session=request.getSession();
   session.removeAttribute("userBean");
   MessageBean messageBean=new MessageBean();
   messageBean.setMessage("You have been logged out.");
   request.setAttribute("messageBean",messageBean);
   RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Message.jsp");
   requestDispatcher.forward(request,response);
  }catch(Exception e)
  {
   System.out.println(e);
  }
 }
 public void doPost(HttpServletRequest request,HttpServletResponse response)
 {
  doGet(request,response);
 }
}
