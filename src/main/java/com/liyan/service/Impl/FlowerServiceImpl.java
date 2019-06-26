package com.liyan.service.Impl;

import com.liyan.dao.Impl.FlowerDaoImpl;
import com.liyan.pojo.Flower;
import com.liyan.service.FlowerService;

import java.util.List;


public class FlowerServiceImpl implements FlowerService {
    private FlowerDaoImpl flowerDao=null;

    @Override
    public List<Flower> findAll() throws Exception {
        flowerDao = new FlowerDaoImpl();
        List<Flower> list = flowerDao.findAll();
        return list;
    }

    @Override
    public int insert(Flower flower) throws Exception {
        flowerDao=new FlowerDaoImpl();
        int row=flowerDao.insert(flower);
        return row;
    }
}
