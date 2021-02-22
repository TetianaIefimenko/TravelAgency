package edu.khai.voloshyn.travelagency.dao;

import edu.khai.voloshyn.travelagency.entity.Order;
import edu.khai.voloshyn.travelagency.entity.User;
import edu.khai.voloshyn.travelagency.exception.DAOException;

import java.util.List;

public interface OrderDAO extends DAO<Order> {
    void updateUserDiscount(User user) throws DAOException;

    List<Order> findOrdersByUserId(int userId) throws DAOException;

    void updateOrdersStatus() throws DAOException;
}