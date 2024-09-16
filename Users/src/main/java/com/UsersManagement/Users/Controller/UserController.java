package com.UsersManagement.Users.Controller;

import com.UsersManagement.Users.DTO.UsersDto;
import com.UsersManagement.Users.Services.UserServices;
import com.UsersManagement.Users.entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserServices userServices;
    @PostMapping

    public ResponseEntity<?> insertdata(@Valid @RequestBody UsersDto usersDto, BindingResult result){
        if(result.hasErrors()){
            Map<String,String> errors=new HashMap<String,String>();
            for(FieldError fieldError:result.getFieldErrors()){
                errors.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
        }
        User user =new User();
        user.setName(usersDto.getName());
        user.setAddress(usersDto.getAddress());
        user.setEmail(usersDto.getEmail());
        user.setAge(usersDto.getAge());

        userServices.insertdata(user);

        return new ResponseEntity<>("User is Valid and saved Succesfully..!",HttpStatus.OK);
    }

    @GetMapping
    public List<User> getAll(){
        return userServices.getAllusers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id)
    {
        return userServices.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        String msg= userServices.deleteById(id);
        return msg;
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable int id , @RequestBody User user){
        return userServices.upadateUser(id,user);
    }
}
