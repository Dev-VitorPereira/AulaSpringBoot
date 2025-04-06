package com.aulaspringboot.AulaSpringBoot.entities;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToOne // Define um relacionamento Muitos-para-Um (vários usuários podem estar em um mesmo departamento)
    @JoinColumn(name = "department_id") /// Indica qual é o nome da coluna estrangeira (chave estrangeira) na tabela do banco de dados
    private  Department department; // Objeto que representa o departamento ao qual esse usuário pertence




}
