package com.liyan.service;

import com.liyan.pojo.Flower;

import java.util.List;

public interface FlowerService {
    List<Flower> findAll() throws Exception;
}
