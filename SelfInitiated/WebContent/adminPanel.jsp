
<html>
<head>
<title>Admin Panel</title>
</head>
<body>
<jsp:useBean id='userBean' scope='request' class='com.thinking.machines.UserBean'/>
<jsp:useBean id='errorBean' scope='request' class='com.thinking.machines.ErrorBean'/>
<center>
<br/><br/><br/><br/>
<h2>Admin Panel</h2>
<br/>
<jsp:getProperty name='errorBean' property="errorMessage"/>
<form action='/letsDoIt.com/Login.jsp' method="POST" >
<table border='0'>
<tr><td>Username:</td><td> <input type='text' name="username" value="<%=userBean.getUsername()%>"/>
<span id="usernameErrorSection"></span>
</td></tr>
<tr><td>
Password:</td><td> <input type='password' name="password" value=""/>
<span id="passwordErrorSection"></span>
</td></tr>
<tr><td/><td/></tr>
<tr><td colspan='2' align='center'>
<input type='submit' value='Login'>
</td></tr>
</form>
</table>
</center>
</body>
</html>

