package com.spoonb.babytuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoodsController {

    @GetMapping("/goods")
    public ModelAndView showGoods() {
        ModelAndView mav = new ModelAndView("goods");
        return mav;
    }
}
