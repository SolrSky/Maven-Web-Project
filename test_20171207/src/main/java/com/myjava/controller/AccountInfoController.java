/**
 * 
 */
package com.myjava.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myjava.entity.AccountInfo;
import com.myjava.service.AccountInfoService;

/**
 * @author dingjunjie
 *
 */
@Controller
@RequestMapping("/account")
public class AccountInfoController {

	private static Logger logger = Logger.getLogger(AccountInfoController.class);
	
	@Autowired
	private AccountInfoService accountService;
	
	@RequestMapping("/getinfo")
	public ModelAndView getAccountInfo(){
		ModelAndView model = new ModelAndView();
		AccountInfo entity = accountService.getAccountInfoById(1);
		model.addObject("userinfo", entity);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("detail")
	public String getDetail(Model model){
		AccountInfo entity = accountService.getAccountInfoById(1);
		model.addAttribute("userinfo",entity);
		return "index";
	}
}
