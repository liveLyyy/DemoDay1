package com.liyan.dao;

import com.liyan.pojo.Flower;

import java.util.List;

public interface FlowerDao {
    List<Flower> findAll() throws Exception;
}
