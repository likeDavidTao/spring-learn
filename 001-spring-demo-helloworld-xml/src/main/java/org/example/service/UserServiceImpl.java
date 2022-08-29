package org.example.service;

import java.util.List;

import org.example.dao.UserDaoImpl;
import org.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDaoImpl userDao;

    public List<User> findUserList() {
        return this.userDao.findUserList();
    }
}

