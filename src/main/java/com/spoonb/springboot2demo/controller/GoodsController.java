package com.spoonb.springboot2demo.controller;

import com.spoonb.springboot2demo.entity.Goods;
import com.spoonb.springboot2demo.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @GetMapping("/goods")
    public ModelAndView showGoods(Long goodsId) {
        ModelAndView mav = new ModelAndView("goods");
        Goods goods = goodsService.getGoodsById(goodsId);
        mav.addObject("goods", goods);
        return mav;
    }
}
