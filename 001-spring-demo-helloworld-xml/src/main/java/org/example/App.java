package org.example;

import java.util.List;

import org.example.config.BeansConfig;
import org.example.pojo.User;
import org.example.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        // create and configure beans
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example");

        // retrieve configured instance
        UserServiceImpl service = context.getBean(UserServiceImpl.class);

        // use configured instance
        List<User> userList = service.findUserList();

        // print info from beans
        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}
