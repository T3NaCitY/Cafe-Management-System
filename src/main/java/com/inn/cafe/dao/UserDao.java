package com.inn.cafe.dao;

import com.inn.cafe.Model.User;
import com.inn.cafe.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByEmailId(@Param("email") String email);
}
