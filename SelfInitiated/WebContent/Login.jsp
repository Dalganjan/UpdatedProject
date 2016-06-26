<jsp:useBean id='userBean' scope='request' class='com.thinking.machines.UserBean'/>
<jsp:setProperty name='userBean' property='*'/>
<jsp:forward page='/Login'/>
