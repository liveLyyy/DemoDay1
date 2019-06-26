package com.liyan.service;

import com.liyan.pojo.Flower;

import java.util.List;

public interface FlowerService {
    /**
     * 查询花卉信息**/
    List<Flower> findAll() throws Exception;
    /**
     * 添加花卉信息**/
    int insert(Flower flower) throws Exception;

}
