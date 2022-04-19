package com.ltts.ticket.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ticketcontroller {
	@RequestMapping(" ")
	public ModelAndView m1() {
		return new ModelAndView("index");
		
	}
   @RequestMapping("ticket")
   public ModelAndView m2() {
		return new ModelAndView("ticket");
   }
   @RequestMapping(value = "insert-booking",method = RequestMethod.POST)
   public ModelAndView m3(HttpServletRequest req) {
		ModelAndView mV = null;
		return mV;
   }
}
