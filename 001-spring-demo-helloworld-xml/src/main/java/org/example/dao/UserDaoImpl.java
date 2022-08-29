package org.example.dao;

import java.util.Collections;
import java.util.List;

import org.example.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl {

    public List<User> findUserList() {
        return Collections.singletonList(new User("hong", 21));
    }
}

