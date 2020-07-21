package net.proselyte.springbootdemo.repository;

import net.proselyte.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository это класс дженерик
// JpaRepository – это интерфейс фреймворка Spring Data предоставляющий набор стандартных методов JPA для работы с БД.

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastName (String lastName);
}
