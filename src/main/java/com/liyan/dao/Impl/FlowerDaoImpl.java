package com.liyan.dao.Impl;

import com.liyan.util.DB;
import com.liyan.dao.FlowerDao;
import com.liyan.pojo.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {
    /**
     * 查询花卉信息
     **/

    @Override
    public List<Flower> findAll() throws Exception {
        List<Flower> list = new ArrayList<Flower>();
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select * from flower");
            preparedStatement = connection.prepareStatement(stringBuilder.toString());
            resultSet = preparedStatement.executeQuery();
            Flower flower = null;
            while (resultSet.next()) {
                flower = new Flower();
                flower.setId(resultSet.getInt("id"));
                flower.setName(resultSet.getString("name"));
                flower.setPrice(resultSet.getDouble("price"));
                flower.setProduction(resultSet.getString("production"));
                list.add(flower);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 添加花卉信息
     **/

    @Override
    public int insert(Flower flower) throws Exception {
        int row = 0;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DB.getConnection();
            String sql = "insert into flower(name,price,production) values(?,?,?)";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,flower.getName());
            preparedStatement.setDouble(2,flower.getPrice());
            preparedStatement.setString(3,flower.getProduction());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
}
