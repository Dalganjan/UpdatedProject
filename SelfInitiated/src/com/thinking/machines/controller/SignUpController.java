package com.thinking.machines.controller;

import java.sql.SQLException;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller("SignUp")
public class SignUpController {

	
	
	@RequestMapping(value="/app/userSignup",method=RequestMethod.POST)
	public @ResponseBody String getSlotsAvailable(@RequestBody String slot) throws SQLException
	{
		System.out.println(slot);
		return null;
	}
	
}
