package com.mybatistest.controller.day8;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController extends AbstractController {
    private Logger logger = Logger.getLogger(getClass());
    /*@RequestMapping("welcome")
    public ModelAndView welcome(String username){
        logger.info("welcome");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("username", username);
        return modelAndView;
    }*/
    @Override
    @RequestMapping("/index")
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        logger.info("hellospring");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Hello Spring MVC");
        return modelAndView;
    }
    @RequestMapping("/success")
    public ModelAndView success(HttpServletRequest request, HttpServletResponse response){
        logger.info("success");
        String username = request.getParameter("username");
        System.out.println("==========================\n"+username+"\n==========================");
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("username", username);
        return modelAndView;
    }
}
