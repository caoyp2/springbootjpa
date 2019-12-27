package com.ittest.springbootjpa.service;

import com.ittest.springbootjpa.dao.UserRepository;
import com.ittest.springbootjpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * isolation=Isolation.READ_COMMITTED 指定事物的隔离级别
     * propagation=Propagation.REQUIRED指定事物的传播行为
     * @param user
     * @return
     */
    @Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED) //对该方法开启事物控制
    public User addUser(User user){
        userRepository.save(new User("abcabc","123456"));
        int a = 10/0;
        User user1 = userRepository.save(user);
        return user1;
    }
}
