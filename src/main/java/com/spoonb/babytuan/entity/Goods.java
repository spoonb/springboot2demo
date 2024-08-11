package com.spoonb.babytuan.entity;

import lombok.Data;

@Data
public class Goods {

    private Integer goodsId;
    private String title;
    private String subTitle;
    private Float originalCost;
    private Float currentPrice;
    private Float discount;
    private Integer isFreeDelivery;
    private Long categoryId;

}
