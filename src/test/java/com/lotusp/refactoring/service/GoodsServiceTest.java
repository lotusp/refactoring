package com.lotusp.refactoring.service;

import com.lotusp.refactoring.entity.Goods;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GoodsServiceTest {

    @Test
    public void should_return_correct_total_price_for_all_goods() {
        Goods goods1 = new Goods("Apple", 1.0, 200);
        Goods goods2 = new Goods("Pear", 1.0, 50);
        GoodsService goodsService = new GoodsService();
        double goodsPrice = goodsService.calculateTotalPrice(Arrays.asList(goods1, goods2));
        assertEquals(200*0.9 + 50*0.95, goodsPrice, Double.MIN_VALUE);
    }

    @Test
    public void should_return_correct_formated_tips_for_all_goods() {
        Goods goods1 = new Goods("Apple", 1.0, 200);
        Goods goods2 = new Goods("Pear", 1.0, 50);
        GoodsService goodsService = new GoodsService();
        List<String> goodsTips = goodsService.getGoodsTips(Arrays.asList(goods1, goods2));
        assertEquals("Name: Apple\nPrice: 1.00", goodsTips.get(0));
        assertEquals("Name: Pear\nPrice: 1.00", goodsTips.get(1));
    }
}