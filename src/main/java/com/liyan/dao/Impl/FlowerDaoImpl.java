package com.liyan.dao.Impl;

import com.liyan.DBUtil.DB;
import com.liyan.dao.FlowerDao;
import com.liyan.pojo.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {

    @Override
    public List<Flower> findAll() throws Exception{
        List<Flower> list = new ArrayList<Flower>();
        Connection connection = null;
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;

        try {
            connection= DB.getConnection();
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append("select * from flower");
            preparedStatement=connection.prepareStatement(stringBuilder.toString());
            resultSet=preparedStatement.executeQuery();
            Flower flower=null;
            while (resultSet.next()){
                flower=new Flower();
                flower.setId(resultSet.getInt("id"));
                flower.setName(resultSet.getString("name"));
                flower.setPrice(resultSet.getDouble("price"));
                flower.setPriduction(resultSet.getString("production"));
                list.add(flower);
                System.out.println(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            resultSet.close();
            preparedStatement.close();
        }
        return list;
    }
}
