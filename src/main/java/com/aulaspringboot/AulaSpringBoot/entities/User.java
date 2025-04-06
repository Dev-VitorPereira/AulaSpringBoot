package com.aulaspringboot.AulaSpringBoot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // Gera getter, setter, toString, equals, hashCode
@NoArgsConstructor // Construtor sem argumentos
@AllArgsConstructor // Construtor com todos os argumentos

@Entity
@Table(name = "tb_user")
public class User {
    @Id

    private Long id;
    private String name;
    private String email;
    private  Department department;
}
