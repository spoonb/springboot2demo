package com.spoonb.springboot2demo.service;

import com.spoonb.springboot2demo.dao.GoodsDAO;
import com.spoonb.springboot2demo.entity.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsService {

    @Resource
    private GoodsDAO goodsDAO;

    public Goods getGoodsById(Long goodsId) {
        return goodsDAO.findById(goodsId);
    }
}
