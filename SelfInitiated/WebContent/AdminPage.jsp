<%@taglib uri="/WEB-INF/tlds/CustomTags.tld" prefix="security" %>
<security:SecurityCheck>
<jsp:forward page='/InvalidAccess.jsp'/>
</security:SecurityCheck>
<html>
<head><title>Admin Login</title>
</head>
<body>
<a href='/letsDoIt.com/Logout.jsp'>Logout</a>
<br/>
<br/>
<center>
<h2>Welcome Admin</h2>
<br>
<form action='/letsDoIt.com/editPage.jsp' method='POST'>
<table border='0'>
<tr><td>File Name: </td><td>
<input type="text" name="filename"/>
</td></tr>
<tr><td>Heading</td><td>
<input type="text" name="heading"/>
</td></tr>
<tr><td>Post:</td><td>
<textarea rows="25" cols="85" name="postText">
</textarea>
</td></tr>
<tr></tr><tr/><tr/><tr/><tr/><tr>
<td colspan='2' align='center'><input type='submit' value='Update'></td>
</tr>
</table>
</form>
</center>
</body>
</html>

