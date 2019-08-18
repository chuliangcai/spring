package com.bashir.spring.pojo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
public class AccountVo {
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;
    @Email
    private String email;
}
