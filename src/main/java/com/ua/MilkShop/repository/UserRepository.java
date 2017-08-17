package com.ua.MilkShop.repository;

import com.ua.MilkShop.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Long> {
    UserDto findByUserName(String userName);
}
