package com.thinking.machines;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EditPost extends HttpServlet
{
 public void doGet(HttpServletRequest request,HttpServletResponse response)
 {
  try
  {
   System.out.println("Edit Post…");
   response.setContentType("text/html;charset=UTF-8");
   PrintWriter out=response.getWriter();
   PostBean postBean=(PostBean)request.getAttribute("postBean");
   String filename=postBean.getFilename();
   String postText=postBean.getPostText();
   String heading=postBean.getHeading();
   postText="<h2>"+heading+"</h2><br/>"+postText+"<br/>";
   System.out.println("Filename…"+filename);
   System.out.println("postText…"+postText);
  
    File f=new File("/Library/tomcat/webapps/letsDoIt.com/pages/"+filename);
        
        FileInputStream fs = null;
        InputStreamReader in = null;
        BufferedReader br = null;
        
        StringBuffer sb = new StringBuffer();
        
        
         String textInLine;    
        try {
             fs = new FileInputStream(f);
             in = new InputStreamReader(fs);
             br = new BufferedReader(in);
            
            while(true)
            {
                textInLine=br.readLine();
                if(textInLine==null)
                    break;
                sb.append(textInLine);
            }
       
		String textAfterEdit="<p>";
              int count1 = sb.indexOf(textAfterEdit);
	      int count2=count1+textAfterEdit.length();
              sb.insert(count2,postText,0,postText.length());
              
    

		
              fs.close();
              in.close();
              br.close();

            } catch (FileNotFoundException e) {
              System.out.println(e);
            } catch (IOException e) {
              System.out.println(e);
            }
            
            try{
                FileWriter fstream = new FileWriter(f);
                BufferedWriter outobj = new BufferedWriter(fstream);
                outobj.write(sb.toString());
                outobj.close();
                
            }catch (Exception e){
              System.err.println("Error: " + e.getMessage());
            }
          
	response.setContentType("text/html");
	out.println("<html><head><title>Admin Panel</title></head>");
	out.println("<body><a href='/letsDoIt.com/Logout.jsp'>Logout</a>");
	out.println("<br><center><h3><i>File Updated</i></h3><br/>");
	out.println("View Updated File <a href='/letsDoIt.com/pages/"+filename+"'>"+filename+"</a>");
	out.println("</center></body></html>");	
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
