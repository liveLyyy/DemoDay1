package com.liyan.test;


import com.liyan.pojo.Flower;
import com.liyan.service.Impl.FlowerServiceImpl;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void find() throws Exception {
        FlowerServiceImpl flowerService = new FlowerServiceImpl();
        List<Flower> list = flowerService.findAll();
        for (Flower f : list) {
            System.out.println(f.getName());
        }
    }
}
