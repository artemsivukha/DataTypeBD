package ru.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.model.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {
}
