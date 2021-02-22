package com.example.demo.Controller;

import org.apache.maven.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/todo",method = RequestMethod.GET)
    public ModelAndView todo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("todo.html");
        return modelAndView;
    }
}
