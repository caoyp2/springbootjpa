package com.ittest.springbootjpa.dao;

import com.ittest.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 自定义接口继承JpaRepository，就会crud及分页等基本功能
 *
 */
//指定的泛型<操作的实体类，主键的类型>
public interface UserRepository extends JpaRepository<User,Integer> {


}
