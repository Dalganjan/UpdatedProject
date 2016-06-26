<html>
 <head>
  <title>JSP Page</title>
 </head>
 <body>
  <jsp:useBean id='messageBean' scope='request' class='com.thinking.machines.MessageBean'/>
  <h1>Notification</h1>
  <jsp:getProperty name='messageBean' property='message'/>
  <br>
  <form action="/letsDoIt.com/index.html" method="POST">
   <input type="submit" value="Ok"/>
  </form>
  </body>
  </html>

