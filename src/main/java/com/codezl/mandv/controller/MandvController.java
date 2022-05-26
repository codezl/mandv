package com.codezl.mandv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: code-zl
 * @Date: 2022/04/29/16:59
 * @Description:
 */
@Controller
@RequestMapping("one")
public class MandvController {

    @RequestMapping("1")
    public ModelAndView one() {
        ModelAndView view = new ModelAndView();
        view.setViewName("error");
        view.addObject("code",404);
        view.addObject("msg","请求错误页面");
        return view;
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("index1")
    public ModelAndView index1(){
        ModelAndView view = new ModelAndView("index");
        view.addObject("author","codezl");
        view.addObject("name","zs");
        return view;
    }


    @RequestMapping("error")
    public ModelAndView error() {
        ModelAndView view = new ModelAndView("error");
        view.addObject("code",404);
        view.addObject("msg","错误");
        return view;
    }

    @RequestMapping("list")
    public ModelAndView list() {
        ModelAndView view = new ModelAndView("list");
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("word");
        view.addObject("list",list);
        return view;
    }
}
