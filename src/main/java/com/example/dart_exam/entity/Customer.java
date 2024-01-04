package com.example.dart_exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table (name = "customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;
    @Column (name = "FullName")
    private String FullName;
    @Column (name = "Birthday")
    private Date Birthday;
    @Column (name = "Address")
    private String Address;
    @Column (name = "PhoneNumber")
    private String PhoneNumber;

}
