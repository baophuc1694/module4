package com.codegym.form_dang_ky.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity(name = "user")
public class User {
    @Id
    @Column(name = "email")
    @NotBlank( message = "Yêu cầu nhập đúng định dạng email !!!")
    @Email
    private String email;


    @Column(name = "first_name")
    @NotBlank(message = "Yêu cầu nhập đúng Tên !!!")
    @Size(min = 5, max = 45, message = "Độ dài của Tên là từ 5 -> 45 ký tự !!!")
    private String firstName;


    @Column(name = "last_name")
    @NotBlank(message = "Yêu cầu nhập đúng Họ !!!")
    @Size(min = 5, max = 45, message = "Độ dài của Họ là từ 2 -> 45 ký tự !!!")
    private String lastName;


    @Column(name = "phone_number")
    @NotBlank(message = "Yêu cầu nhập đúng Số Điện Thoại !!!")
    @Pattern(regexp = "\\d{10}", message = "Số Điện Thoại phải là số, không được nhập chữ")
    private String phoneNumber;


    @Column(name = "age")
    @Min(value = 18, message = "Tuổi phải lớn hơn 18")
    private int age;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
