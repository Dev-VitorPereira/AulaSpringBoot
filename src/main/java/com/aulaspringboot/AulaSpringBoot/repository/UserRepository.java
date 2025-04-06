package com.aulaspringboot.AulaSpringBoot.repository;


import com.aulaspringboot.AulaSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


// Interface do repositório. Aqui você não precisa implementar nada, o Spring Data faz tudo automaticamente.
public interface UserRepository extends JpaRepository <User, Long> {
    // <User, Long>
    // User → entidade que será gerenciada
    // Long → tipo do ID (chave primária) da entidade
}
