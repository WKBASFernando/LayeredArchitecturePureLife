package com.assignment.purelifewaterbottles.bo.custom.impl;

import com.assignment.purelifewaterbottles.bo.custom.OrderDetailBO;
import com.assignment.purelifewaterbottles.dao.custom.impl.OrderDetailDAOImpl;
import com.assignment.purelifewaterbottles.dto.OrderDetailDto;

import java.sql.SQLException;

public class OrderDetailBOImpl implements OrderDetailBO {
    OrderDetailDAOImpl orderDAO = new OrderDetailDAOImpl();

    @Override
    public boolean save(OrderDetailDto orderDetailDto) throws SQLException {
        return orderDAO.save(orderDetailDto);
    }

    @Override
    public boolean update(OrderDetailDto orderDetailDto) throws SQLException {
        return orderDAO.update(orderDetailDto);
    }
}
