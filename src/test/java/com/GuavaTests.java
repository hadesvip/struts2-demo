package com;

import com.domain.Goods;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimaps;
import org.junit.Test;

import java.util.List;

public class GuavaTests {


    @Test
    public void guavaTest() {
        List<Goods> goodsList = Lists.newArrayList();
        goodsList.add(new Goods("iphone", "北京"));
        goodsList.add(new Goods("iphone", "天津"));
        goodsList.add(new Goods("mac", "上海"));
        goodsList.add(new Goods("imac", "武汉"));

        //被转换的对象key一定要是唯一的
//        Map<String, Goods> goodsMap = Maps.uniqueIndex(goodsList, new Function<Goods, String>() {
//            @Override
//            public String apply(Goods goods) {
//                return goods.getGoodName();
//            }
//        });


        //被转换的对应key可以不是唯一的
        ImmutableListMultimap<String, Goods> multimap = Multimaps.index(goodsList, new Function<Goods, String>() {
            @Override
            public String apply(Goods goods) {
                return goods.getGoodName();
            }
        });



    }

}

