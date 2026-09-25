package com.crudDTO.demoDTO.dto;

import jakarta.validation.constraints.*;
public class createStudentDTO {
    @NotBlank(message = "Enter a name")
    @Size(min=2 ,max = 50,message = "Name should be in between 2 to 50 chars")
    private String name;

    @NotBlank(message = "Unique Email ID required")
    @Email(message = "Enter the email")
    private String email;

    @NotBlank(message = "Enter the roll")
    private int rollNo;
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public createStudentDTO(int rollNo, String email, String name) {
        this.rollNo = rollNo;
        this.email = email;
        this.name = name;
    }
}
