package com.StudentManagement.Student.Management.System.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Student name is required")
    private String name;

    @Email(message = "Please enter a valid email")
    @Column(unique = true)
    private String email;

    @Min(value = 18, message = "Age should be at least 18")
    private Integer age;

    @NotBlank(message = "Course is required")
    private String course;
}
