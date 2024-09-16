package com.UsersManagement.Users.Services;

import com.UsersManagement.Users.Repositery.UsersRepositery;
import com.UsersManagement.Users.UserNotFoundException;
import com.UsersManagement.Users.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServices {
    @Autowired
    UsersRepositery usersRepositery;

    public User insertdata(User user){
        return usersRepositery.save(user);
    }

    public List<User> getAllusers(){
        List<User> list = usersRepositery.findAll();
        return list;
    }

    public User getUserById(int id){
       return usersRepositery.findById(id).orElseThrow(()->new UserNotFoundException("User Not Found by this id "+id));
    }

    public String deleteById(int id){
        usersRepositery.findById(id).orElseThrow(()->new UserNotFoundException("User not found by this id" +id));
        usersRepositery.deleteById(id);
        return "Deleted Succesfully..!";
    }

    public User upadateUser(int id ,User user){
       User existingUser= usersRepositery.findById(id).orElseThrow(()->new UserNotFoundException("User not found by this id" +id));
       existingUser.setName(user.getName());
       existingUser.setAddress(user.getAddress());
       existingUser.setEmail(user.getEmail());
       existingUser.setAge(user.getAge());

       return usersRepositery.save(existingUser);

    }
}
