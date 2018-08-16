package com.lotusp.refactoring.service;

import com.lotusp.refactoring.entity.Goods;

import java.util.List;
import java.util.stream.Collectors;

public class GoodsService {

    public double calculateTotalPrice(List<Goods> goodsList) {
        return goodsList.stream()
                        .mapToDouble(Goods::getDiscountedPrice)
                        .sum();
    }

    public List<String> getGoodsTips(List<Goods> goodsList) {
        return goodsList.stream()
                        .map(goods -> formatGoods(goods.getName(), goods.getPrice()))
                        .collect(Collectors.toList());
    }

    private String formatGoods(String name, Double price) {
        return String.format("Name: %s\nPrice: %.2f", name, price);
    }
}
