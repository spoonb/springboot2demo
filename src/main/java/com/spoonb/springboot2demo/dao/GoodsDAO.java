package com.spoonb.springboot2demo.dao;

import com.spoonb.springboot2demo.entity.Goods;

public interface GoodsDAO {

    Goods findById(Long goodsId);
}
