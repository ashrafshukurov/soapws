package com.test.soapws.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Ashraf on 17-Jul-23
 * @project soapws
 */

@Entity
@Data
@Table(name = "studentws")
public class StudentEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String phoneNumber;
   private int age;

}
