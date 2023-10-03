package com.review.model;

import lombok.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee
{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String address;
    private String address2;
    private String password;
    private String city;
    private String state;
    private String zipcode;
}
