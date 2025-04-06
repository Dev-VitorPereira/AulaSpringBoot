package com.aulaspringboot.AulaSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Gera getter, setter, toString, equals, hashCode
@NoArgsConstructor // Construtor sem argumentos
@AllArgsConstructor // Construtor com todos os argumentos

@Entity // Indica que essa classe é uma entidade JPA — ou seja, será mapeada para uma tabela no banco
@Table(name = "tb_department") // Especifica o nome da tabela no banco de dados que será usada para essa entidade
public class Department {

    @Id // Marca o campo como chave primária da entidade (coluna 'id' na tabela do banco)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Define que o valor da chave primária será gerado automaticamente pelo banco de dados
    // usando a estratégia IDENTITY (auto-incremento, como em MySQL, H2, PostgreSQL, etc.)

    private Long id;
    private String name;
}
