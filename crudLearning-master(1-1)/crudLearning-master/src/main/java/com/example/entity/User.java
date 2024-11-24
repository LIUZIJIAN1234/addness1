package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
    private String email;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "is_collect")
    private Integer isCollect;
    private String image;
    @Column(name = "contact_meiti")
    private String contactMeiti;
    @Column(name = "corporation_phone")
    private String corporationPhone;
    @Transient
    private MultipartFile file;


}
