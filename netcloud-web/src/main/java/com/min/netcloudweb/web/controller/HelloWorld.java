package com.min.netcloudweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author  小米的阿怪
 * @create  15:44 2018/3/26/0026
 * @desc  注意注解 restcontroller 和controller 的问题  restcontroll 注解表示返回的内容都是HTTP Content不会被模版引擎处理的
 **/
@Controller
@RequestMapping("/hello")
public class HelloWorld {



    //    成功调到模板界面
    @GetMapping(value = "/loginmin1")
    public ModelAndView view(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

    @RequestMapping("/loginmin2")
    public String login(Model model){
        return "/login/hello";
    }


}
