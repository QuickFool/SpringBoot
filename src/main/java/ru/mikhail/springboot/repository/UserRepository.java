package ru.mikhail.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mikhail.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
