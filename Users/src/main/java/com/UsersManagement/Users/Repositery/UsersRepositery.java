package com.UsersManagement.Users.Repositery;


import com.UsersManagement.Users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsersRepositery extends JpaRepository<User, Integer> {
}
