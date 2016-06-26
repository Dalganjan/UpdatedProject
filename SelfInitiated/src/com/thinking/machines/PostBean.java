package com.thinking.machines;
import java.io.Serializable;
public class PostBean implements Serializable
{
 private String filename="";
 public String getFilename()
 {
  return filename;
 }
 public void setFilename(String filename)
 {
  this.filename=filename;
 }
private String heading="";
public String getHeading()
{
return heading;
} 
public void setHeading(String heading)
{
this.heading=heading;
}
private String postText="";
 public String getPostText()
 {
  return postText;
 }
 public void setPostText(String postText)
 {
  this.postText=postText;
 }
 
}

