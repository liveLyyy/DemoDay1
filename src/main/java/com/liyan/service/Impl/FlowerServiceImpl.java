package com.liyan.service.Impl;

import com.liyan.dao.Impl.FlowerDaoImpl;
import com.liyan.pojo.Flower;
import com.liyan.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    private FlowerDaoImpl flowerDao;
    @Override
    public List<Flower> findAll() throws Exception{
        List<Flower> list=flowerDao.findAll();
        return list;
    }
}
