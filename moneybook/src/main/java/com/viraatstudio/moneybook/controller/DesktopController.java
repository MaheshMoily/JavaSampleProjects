package com.viraatstudio.moneybook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DesktopController 
{
	@RequestMapping("/desktop")
	public ModelAndView showDesktop()
	{
		ModelAndView desktopMV = new ModelAndView("desktop");
		return desktopMV;
	}

}
