package com.UsersManagement.Users.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {

    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    private  String address;
    @Email
    private String email;
    @Max(60)
    @Min(18)
    private Integer age;
}
