package com.assignment.purelifewaterbottles.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO<T> extends SuperDAO{
    boolean save(Connection connection, T Dto) throws SQLException, ClassNotFoundException;
    boolean update(Connection connection, T Dto) throws SQLException, ClassNotFoundException;
    boolean delete(String id) throws SQLException, ClassNotFoundException;
    String getNextID() throws SQLException, ClassNotFoundException;
    T find(String id) throws SQLException, ClassNotFoundException;
    ArrayList<String> getAllIds() throws SQLException;
}
