package com.spring.puzzle.web.validation;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class Student {

    @NotEmpty
    @Size(min = 1, max = 10)
    private String name;
    private short age;

    @Valid
    private Phone phone;

}

@Data
class Phone {
    @NotEmpty
    @Size(max = 10)
    private String number;
}
