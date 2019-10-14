package com.byzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.byzx.model.Article;





@Controller
@RequestMapping("/article")
public class ArticleController {

 @RequestMapping("/list")
 public String list(Model model) {
	
	return "article/list";
}
 @RequestMapping("/detaile/{id}")
 public ModelAndView detaile(@PathVariable("id")int id) {
	 ModelAndView mav=new ModelAndView();
	 if(id==1) {
		mav.addObject("article",new Article("����һ","����һ�����ݣ�"));
	 }else if(id==2) {
	    mav.addObject("article",new Article("���¶�","���¶������ݣ�"));
	 }
	 mav.setViewName("article/detaile");
	return mav;
	 
 }
}
