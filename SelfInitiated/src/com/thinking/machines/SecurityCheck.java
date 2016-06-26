package com.thinking.machines;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class SecurityCheck extends TagSupport
{
 public int doStartTag()
 {
  try
  {
   if(pageContext.getAttribute("userBean",pageContext.SESSION_SCOPE)==null)
    {
     return super.EVAL_BODY_INCLUDE;
    }
  }catch(Exception e)
  {
   return super.EVAL_BODY_INCLUDE;
  }
  return super.SKIP_BODY;
 }
 public int doEndTag()
 {
  try
  {
  }catch(Exception e)
  {
  }
  return super.EVAL_PAGE;
 }
}
